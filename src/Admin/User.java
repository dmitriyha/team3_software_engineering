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
	private ArrayList<Message> inbox;
	private ArrayList<Update> notifications;
	private ArrayList<Match> matches;
	private Subscription subscription;
	private String email;
	private String screenName;
	private String authToken = "-1";
	String location;
	String gender;
	String interestedIn;
	String pass;
	/**
	 * The constructor for the class User
	 * 
	 * @param username specify the username
	 * @param passWord 
	 * @param specify email
	 * @param specify screen name
	 * @param inbox pass the inbox of the user to this class if the user is newm use the new call
	 * @param notifications the notification array
	 * @param matches the matches array
	 * @param subscription the type of subscription the user has
	 */
	
	public User(String username,
				String email,
				String screenName,
				String passWord, ArrayList<Message> inbox,
				ArrayList<Update> notifications,
				ArrayList<Match> matches,
				Subscription subscription,
				String location,
				String gender,
				String interestedIn){
		this.username=username;
		this.inbox=inbox;
		this.notifications=notifications;
		this.matches=matches;
		this.subscription=subscription;
		this.email=email;
		this.screenName=screenName;
		this.location=location;
		this.gender=gender;
		this.interestedIn=interestedIn;
		pass=passWord;
	}
	
	/**Gets the username for this user
	 * 
	 * @return this class' username parameter
	 */
	public String getUsername() {
		return username;
	}
	
	public String getSreenName(){
		return screenName;
	}
	
	public String getLoc() {
		return location;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getOrientation() {
		return interestedIn;
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
	        authToken=hex.toString();
	        return authToken;
		}
		else{
			return authToken;
		}
		
	}
	
	public void clearToken(){
		authToken="-1";
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return pass;
	}
}
