package classesToBeCalledByHttp;

import java.util.Map;

import org.json.simple.JSONObject;

import threads.ClientServingThread.RequestType;
import Database.UserDatabase;

public class SignUp {
	public static String add(	RequestType requestType,
				Map<String, String> headerData, 
				Map<String, String> formParameters, 
				Map<String, String> methodAndParameters) {
		//System.out.println(UserDatabase.get().getByName(methodAndParameters.get("user")));
		
		if(UserDatabase.get().getByName(methodAndParameters.get("username")).equals("null")){
			
			String screenName= methodAndParameters.get("screenName").replaceAll("%20", " ");
			
			UserDatabase.get().add(methodAndParameters.get("username"),
					methodAndParameters.get("password"),
					methodAndParameters.get("email"),screenName, 
					methodAndParameters.get("location"),
					methodAndParameters.get("gender"), 
					methodAndParameters.get("interestedIn"));
			
			String token=UserDatabase.get().validate(methodAndParameters.get("username"),methodAndParameters.get("password"));
			
			JSONObject obj=new JSONObject();
			obj.put("message","sucessful Sign Up");
			obj.put("AuthToken",token);
			
			return new String(obj.toJSONString());
		}
		else{
			JSONObject obj=new JSONObject();
			obj.put("message","user exists");
			
			return new String(obj.toJSONString());
		}
	}
}
