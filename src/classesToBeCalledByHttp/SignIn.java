package classesToBeCalledByHttp;

import java.util.Map;

import org.json.simple.JSONObject;

import threads.ClientServingThread.RequestType;
import Database.UserDatabase;

public class SignIn {
	public static String in(	RequestType requestType,
				Map<String, String> headerData, 
				Map<String, String> formParameters, 
				Map<String, String> methodAndParameters) {
		
		String token=UserDatabase.get().validate(methodAndParameters.get("user"),methodAndParameters.get("password"));
		
		if(!token.equals("-1")){
			JSONObject obj=new JSONObject();
			obj.put("AuthToken",token);
			
			return new String(obj.toJSONString());
		}
		else{
			return new String("error signing in");
		}
	}
}
