package tags;

import java.util.Map;

import threads.ClientServingThread.RequestType;


public class RequestParameters {
	
	public static String show(	RequestType requestType,
								Map<String, String> requestParameters, 
								Map<String, String> formParameters, 
								Map<String, String> pageParameters) {
		// For this method, only the request parameters are used
		// Returns a table containing the parameters provided

		StringBuilder result = new StringBuilder();
		// Add the relevant code here
		Object[] keys = requestParameters.keySet().toArray();
		Object[] values = requestParameters.values().toArray();
		
		result.append("<table border=\"1\">\n");
		System.out.println(values.length);
		for(int i=0;values.length>i;i++){
			
			result.append("<tr>\n"+
			"<td>"+keys[i]+"</td>\n"+
			"<td>"+values[i]+"</td>\n"+
			"</tr>\n");
			
		}
		
		result.append("</table>\n");
		return new String(result);
	}
}
