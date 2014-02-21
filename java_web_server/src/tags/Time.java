package tags;

import java.util.Date;
import java.util.Map;

import threads.ClientServingThread.RequestType;

public class Time {
	// Gets the  time. For now, only return current time
	// In then future, add attributes specifying formatting
	// In the future, add attributes specifying what time to get
	// Output is, as always with tags, in a String containing HTML

	public static String current(	RequestType requestType,
									Map<String, String> requestParameters, 
									Map<String, String> formParameters, 
									Map<String, String> pageParameters) {
		// For this method, the parameters are unused
		// Returns current time
		StringBuilder result = new StringBuilder();
		result.append("The current date and time is: ");
		result.append(new Date().toString());
		return new String(result);
	}
}
