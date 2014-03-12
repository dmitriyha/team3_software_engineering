package classesToBeCalledByHttp;

import java.util.Map;

import threads.ClientServingThread.RequestType;
import Database.UserDatabase;

public class SignUp {
	public static String add(	RequestType requestType,
				Map<String, String> headerData, 
				Map<String, String> formParameters, 
				Map<String, String> methodAndParameters) {
		//System.out.println(UserDatabase.get().getByName(methodAndParameters.get("user")));
		
		if(UserDatabase.get().getByName(methodAndParameters.get("user")).equals("null")){
			UserDatabase.get().add(methodAndParameters.get("user"),methodAndParameters.get("password"));
			return new String("done");
		}
		else{
			return new String("user exists");
		}
	}
}
