package tags;

import java.util.Map;

import threads.ClientServingThread.RequestType;
import Database.UserDatabase;

public class SignOnCheck {
	public static String check(	RequestType requestType,
								Map<String, String> requestParameters, 
								Map<String, String> formParameters, 
								Map<String, String> pageParameters) {

		String content="<a href=\"login\">Log in</a> <a href=\"signup\">Sign Up</a>";
		
		return new String(content);
		
	}
}
