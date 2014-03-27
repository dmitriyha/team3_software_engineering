package threads;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Database.UserDatabase;

public class ClientServingThread implements Runnable{
	
	private Map<String, String> headerData = new HashMap<>();//header data
	private Map<String, String> formParameters = new HashMap<>();
	private Map<String, String> methodAndParameters = new HashMap<>();//the method and all parameters
	RequestType req;
	private static final String TAG_PATH = "classesToBeCalledByHttp";
	
	
	String clazz="";
	
	private Socket socket=null;
	// This class handles the direct communication with a client
	// Make it an active object, i.e. self-runnable
	// Defer the actual work done to doWork()
	// Make sure to implement some mechanism to avoid deadlocks, as
	// threads may share resources such as html files and tags
	
	public ClientServingThread(Socket output, UserDatabase users)  {
		socket=output;
		Thread t=new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		doWork();
	}
	
	private void doWork() {
		// Open streams for input and for output
		// Use a try-with-resources
		try {
			
			PrintWriter writer = new PrintWriter(
							new BufferedOutputStream(socket.getOutputStream()));
			BufferedReader reader= new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			
			//out(reader);
			// Read the first line and determine whether it's a POST or GET
			String line= reader.readLine();
			req = getRequestType(line);
			
			// Still from the first line, read the file requested. 
			clazz = getRequestedClass(line);
			
			// Still from the first line,  read the GET parameters (if any)
			methodAndParameters=getGetParameters(line);
			
			// Read the (general) request parameters and put them in the Map
			headerData=getheaderData(reader);
			
			// We gathered the basic information (GET parameters will  be added later)
			// Read the requested file and put it in a StringBuffer for further processing
			//String file = readRequestedFile(path);
			
			// Now process the buffer. Search through it and replace all custom tags
			String file=replaceCustomTags(clazz);
			
			// Prepend the HTTP header
			String ans=prependHTTPHeader(file);
			
			// Write the answer to the client
			writeAnswer(writer,ans);
			String lol="";
//			for(lol=reader.readLine();;lol=reader.readLine()){
//				out(lol);
//			}
			
			
			// Implement error handling

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				socket.close();
			} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}
			
		}
			
			
	}
	
	private RequestType getRequestType(String inputLine) {
		// Gets the request type from the first line of the header
		// This will be just the first three or four characters in this line
		// For now, assume it will be either GET or POST
		// Other types will be added in a next iteration
		
		if (inputLine.startsWith("GET")){
			return RequestType.GET;
		}
		else {
			return RequestType.POST;
		}
	}
	
	private String getRequestedClass(String inputLine) {
		//  Gets the name of the  requested file from the first line of the header
		// This will require some clever manipulation of the string using substrings
		// Remember to take ? and spaces into account
		// When no file extension is given, use .html as default
		
		inputLine=inputLine.substring(inputLine.indexOf("/")+1, inputLine.indexOf(" HTTP/1.1"));
		if(inputLine.contains("?")){
			inputLine=inputLine.substring(0,inputLine.indexOf("?"));
		}
		inputLine=inputLine.replaceAll("%20"," ");
		inputLine=inputLine.replaceAll("/", "\\\\");
		
		//out(inputLine);
		
		return inputLine;
	}
	
	private Map<String, String> getheaderData(BufferedReader in) throws IOException {
		// Read the (general) request parameters and put them in the Map
		// Again, use some clever substringing, in this case on the character : to achieve this
		Map<String, String> result = new HashMap<>();
		String s;
		while(!(s=in.readLine()).equals("")){
			result.put(s.substring(0, s.indexOf(": ")), s.substring(s.indexOf(": ")+2));
		}
		return result;
	}
	
	private Map<String, String> getGetParameters(String inputLine) {
		// Get the GET parameters from the first line of the header
		// To be implemented in a later iteration
		String splitParam[];
		String splitLine[];
		inputLine=inputLine.replace("HTTP/1.1", "");
		inputLine=inputLine.replace("GET ", "");
		Map<String, String> params=new HashMap<>();
		
		if(inputLine.contains("?")){
			inputLine = inputLine.substring(inputLine.indexOf("?")+1);
			splitLine=inputLine.split("\\?");
			if(splitLine[0].contains("&")){
				splitLine=splitLine[0].split("&");
			}
			for(int i = 0; i<splitLine.length;i++){
				
				
				splitParam=splitLine[i].split("=");
				
				
				if (splitParam[1].contains(" ")){
					splitParam[1] =splitParam[1].substring(0,splitParam[1].lastIndexOf(" "));
				}
				params.put(splitParam[0], splitParam[1]);
			}
			
			
		}
		return params;
	}
	
	

	private String replaceCustomTags(String originalContents) throws IOException {
		// Scan through the original contents. All tags should be checked.
		// A tag that has been defined as a class in the TAG_PATH will be
		// instantiated and then called to get the HTML code.
		// This code will be placed in place of the custom tag
		// If a tag is not recognized, keep it, as it will probably
		// be a basic HTML tag, to be processed by the browser.
		// If a tag can be recognized, but processing fails, load and show
		// an error page including debugging information
		
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		String path=TAG_PATH;
		Enumeration<URL> resources = classLoader.getResources(path);
		URL resource = resources.nextElement();
		File f =new File (resource.getFile());
		File[] fi=f.listFiles();
		
		//String noWhitespaceTag= tag.replaceAll(" ", "");
		String className = clazz;
		String methodName = methodAndParameters.get("method");
		
		
		String tag ="error";
		
		Class[] params= new Class[]{RequestType.class,Map.class,Map.class,Map.class};
		Object[] objs = new Object[]{req,headerData,formParameters,methodAndParameters};
		String htmlCode="";
		try {
			Class<?> c=Class.forName(TAG_PATH+"."+className);
			Method m =c.getMethod(methodName, params);
			
			htmlCode=(String) m.invoke(methodName, objs);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return tag;
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			return tag;
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			return tag;
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			return tag;
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "an exeption was thrown in "+className;
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			return "class\""+className+"\" was recognised, but \""+methodName+"\" method was not!";
		}

		
		
		
		return htmlCode;
	}
	
	

	private String prependHTTPHeader(String originalContents) {
		// Put an HTTP header in front of the file to be returned
		// At first, assume ok and a simple return value
		// Neat error codes will be added in a next iteration
		// Check http://www.tutorialspoint.com/http/http_responses.htm for information on HTTP responses
		// Check StackOverflow on returning hard returns in a string if neccesary
		StringBuilder result = new StringBuilder();
		result.append("HTTP/1.1 200 OK" + System.getProperty("line.separator"));
		result.append("Date: " + new Date().toString() + System.getProperty("line.separator"));
		result.append("Server: TinyApplicationServer v0.1" + System.getProperty("line.separator"));
		result.append("Last-Modified: " + new Date().toString() + System.getProperty("line.separator"));
		result.append("Content-Length: " + originalContents.length() + System.getProperty("line.separator"));
		result.append("Content-Type: application/json" + System.getProperty("line.separator"));
		result.append(System.getProperty("line.separator"));
		result.append(originalContents);
		return new String(result);
	}
	
	private void writeAnswer(PrintWriter out, String content) {
		// Write the answer to the client
		// Use String.split where necessary
		// Make sure to add return / line feeds where necessary
		// Check StackOverflow on how to do this
		out.print(content);
		out.flush();
	}
	
	
//	private void out(String inputLine) {
//		
//		System.out.println(inputLine);
//			
//		
//	}
//	private void out(int o) {
//		System.out.println(o);
//		
//	}
	
	public enum RequestType { GET, POST }

	
}
