package Database;

import java.util.ArrayList;

import matches.Match;
import misc.Message;
import misc.Update;
import Admin.Subscription;
import Admin.User;

public class UserDatabase {
	private static UserDatabase self = new UserDatabase();
	public static UserDatabase get() { return self; }
	
	ArrayList<User> users = new ArrayList<User>();
	ArrayList<String> passwords =new ArrayList<String>();
	
	public UserDatabase(){
		users.add(new User("SomeOne", new ArrayList<Message>() ,new ArrayList<Update>(), new ArrayList<Match>(), new Subscription()));
		passwords.add("1234");
		users.add(new User("SomeOther", new ArrayList<Message>() ,new ArrayList<Update>(), new ArrayList<Match>(), new Subscription()));
		passwords.add("4321");
	}
	
	/**checks for the param name from the database, if not found, return null
	 * 
	 * @param name
	 * @return name, null if not found
	 */
	
	public String getByName(String name) {
		for(int i=0; i < users.size(); i++){
			if(name.equals(users.get(i).getUsername())){
				
				return name;
			}
		}
		return "null";
	}
	
	public void add(String name, String password) {
		users.add(new User(name, new ArrayList<Message>() ,new ArrayList<Update>(), new ArrayList<Match>(), new Subscription()));
		
		passwords.add(password);
	}
	
	public boolean validate(String name, String password){
		for(int i=0; i < users.size(); i++){
			
			if(name.equals(users.get(i).getUsername())){
				if(passwords.get(i).equals(password)){
					return true;
				}
			}
		}
		
		return false;
	}
	
}
