package classesToBeCalledByHttp;

import java.util.Map;

import org.json.simple.JSONObject;

import threads.ClientServingThread.RequestType;
import Database.UserDatabase;

public class SignOut {
	public static String out(	RequestType requestType,
			Map<String, String> headerData, 
			Map<String, String> formParameters, 
			Map<String, String> methodAndParameters) {
		
		boolean signOut=true;
		
		if(UserDatabase.get().checkToken(methodAndParameters.get("user"),methodAndParameters.get("authToken"),signOut) &&
				!methodAndParameters.get("authToken").equals("-1")){
			
			
			
			JSONObject obj=new JSONObject();
			obj.put("message","signed out");
			
			return new String(obj.toJSONString());
		}
		else{
			JSONObject obj=new JSONObject();
			obj.put("message","error signing out");
			
			return new String(obj.toJSONString());
		}
	}
}
