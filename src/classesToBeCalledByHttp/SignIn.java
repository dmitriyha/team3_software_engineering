package classesToBeCalledByHttp;

import java.util.Map;

import threads.ClientServingThread.RequestType;
import Database.UserDatabase;

public class SignIn {
	public static String in(	RequestType requestType,
				Map<String, String> headerData, 
				Map<String, String> formParameters, 
				Map<String, String> methodAndParameters) {
		

		
		if(UserDatabase.get().validate(methodAndParameters.get("user"),methodAndParameters.get("password"))){
			return new String("Signed in");
		}
		else{
			return new String("error signing in");
		}
	}
}
