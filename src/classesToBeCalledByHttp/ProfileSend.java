package classesToBeCalledByHttp;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.xml.bind.DatatypeConverter;

import org.json.simple.JSONObject;

import threads.ClientServingThread.RequestType;
import misc.Interest;
import misc.Update;
import Admin.User;
import Database.UserDatabase;

public class ProfileSend {
	private Path picture;
	private String displayName;
	private Date DoB = new Date();
	private ArrayList<Interest> interests;
	private Interest preferences;
	private ArrayList<Update> updates = new ArrayList<Update>();
	static String base64EncodedMan = convertImg("img\\man.jpg");
	static String base64EncodedWoman = convertImg("img\\woman.jpg");
	//sexual preference
	//gender
	// preferences in a partner
	
	
	public static String show(	RequestType requestType,
								Map<String, String> headerData, 
								Map<String, String> formParameters, 
								Map<String, String> methodAndParameters) {
		
		
		
		
		
		
		
		int i = 0;
		String jsonToSend="";
		for(User u= UserDatabase.get().getUser(i); u!= null;){
			JSONObject obj=new JSONObject();
			obj.put("user",u.getUsername());
			obj.put("interestedIn",u.getOrientation());
			obj.put("screenName", u.getSreenName());
			obj.put("location", u.getLoc());
			obj.put("gender", u.getGender());
			
			if(u.getGender().equals("Male")){
				obj.put("image", base64EncodedMan);
			}
			else if(u.getGender().equals("Female")){
				
				obj.put("image", base64EncodedWoman);
			}
			jsonToSend=jsonToSend+obj.toJSONString();
			i++;
			u= UserDatabase.get().getUser(i);
		}
		
		return new String(jsonToSend);
		
	}
	
	public static String getUser(RequestType requestType,
			Map<String, String> headerData, 
			Map<String, String> formParameters, 
			Map<String, String> methodAndParameters){
				
		User u= UserDatabase.get().getUser(methodAndParameters.get("username"));
		JSONObject obj=new JSONObject();
		obj.put("user",u.getUsername());
		obj.put("interestedIn",u.getOrientation());
		obj.put("screenName", u.getSreenName());
		obj.put("location", u.getLoc());
		obj.put("gender", u.getGender());
		
		if(u.getGender().equals("Male")){
			obj.put("image", base64EncodedMan);
		}
		else if(u.getGender().equals("Female")){
			
			obj.put("image", base64EncodedWoman);
		}
		String jsonToSend=obj.toJSONString();
		return new String(jsonToSend);
		
	}
	
	private static String convertImg(String file){
		File fnewMan=new File(file);
		BufferedImage originalImage = null;
		try {
			originalImage = ImageIO.read(fnewMan);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		try {
			ImageIO.write(originalImage, "jpg", baos );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] imageInByteMan=baos.toByteArray();
		return DatatypeConverter.printBase64Binary(imageInByteMan);
	}
	
}
