package matches;

import java.util.ArrayList;

import Admin.User;

public class BlindLocationMatch extends BlindMatch{
	
	String userLocation;
	
	
	public BlindLocationMatch(String userLocation, ArrayList<User> u) {
		// TODO Auto-generated constructor stub
		super(new User(), u);
		this.userLocation=userLocation;
		users=u;
	}

	@Override
	public ArrayList<User> match() {
		ArrayList<User> u=new  ArrayList<User>();
		for(int i = 0; users.size()>i;i++){
			if(users.get(i).getLoc().equals(userLocation)){
				u.add(users.get(i));
			}
		}
		
		return u;
	}
}
