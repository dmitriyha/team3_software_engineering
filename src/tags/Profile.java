package tags;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import threads.ClientServingThread.RequestType;
import misc.Interest;
import misc.Update;
import Database.UserDatabase;

public class Profile {
	private Path picture;
	private String displayName;
	private Date DoB = new Date();
	private ArrayList<Interest> interests;
	private Interest preferences;
	private ArrayList<Update> updates = new ArrayList<Update>();
	//sexual preference
	//gender
	// preferences in a partner
	
	public static String show(	RequestType requestType,
								Map<String, String> requestParameters, 
								Map<String, String> formParameters, 
								Map<String, String> pageParameters) {
		
		String content="add HTML profile implementation here<br>\n";
		
		
		content += UserDatabase.get().getByName(pageParameters.get("user"));
		
		return new String(content);
		
	}
	
}
