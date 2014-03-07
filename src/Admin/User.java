package Admin;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import matches.Match;
import misc.Interest;
import misc.Message;
import misc.Update;

public class User {
	private String username;
	public ArrayList<Message> inbox;
	private ArrayList<Update> notifications;
	private ArrayList<Match> matches;
	private Subscription subscription;
	//password
	//email
	private String authToken = "-1";
	
	
	/**
	 * The constructor for the class User
	 * 
	 * @param username specify the username
	 * @param inbox pass the inbox of the user to this class if the user is newm use the new call
	 * @param notifications the notification array
	 * @param matches the matches array
	 * @param subscription the type of subscription the user has
	 */
	
	public User(String username, 
				ArrayList<Message> inbox,
				ArrayList<Update> notifications,
				ArrayList<Match> matches,
				Subscription subscription){
		//TODO add the remaning parameter inits
		this.username=username;
	}
	
	/**Gets the username for this user
	 * 
	 * @return this class' username parameter
	 */
	public String getUsername() {
		return username;
	}
	
	public String getToken(){
		if(authToken.equals("-1")){
			Calendar cal=Calendar.getInstance();
			Date date = cal.getTime();
			
			StringBuilder hex = new StringBuilder();
	        
			
	        for (int i=0; i < username.length(); i++) {
	            hex.append(Integer.toHexString(username.charAt(i)));
	            
	            
	        }       
	        hex.append(Long.toHexString(date.getTime()));
	        return hex.toString();
		}
		else{
			return authToken;
		}
		
	}
}
