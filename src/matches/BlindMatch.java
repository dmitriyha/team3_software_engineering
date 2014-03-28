package matches;

import java.util.ArrayList;
import java.util.Random;

import Admin.User;

public class BlindMatch extends Match{
	
	User user;
	
	public BlindMatch(User user,ArrayList<User> u) {
		super(u);
		this.user=user;
	}

	@Override
	public ArrayList<User> match() {
		int i =0;
		while (true){
			ArrayList<User> a = new ArrayList<User>();
			Random rand = new Random();
			i = rand.nextInt(users.size()) ;
			if(!user.getOrientation().equals(users.get(i).getOrientation())){
				if(!user.getGender().equals(users.get(i).getGender())){
					System.out.println(user.getOrientation()+1);
					a.add(users.get(i));
					return a;
				}
			}
			else if(user.getOrientation().equals(users.get(i).getOrientation())){
				if(user.getGender().equals(users.get(i).getGender())){
					if(!user.getOrientation().equals(users.get(i).getOrientation())){
						System.out.println(user.getOrientation()+2);
						a.add(users.get(i));
						return a;
					}
				}
			}
		}
		
		// TODO Auto-generated method stub
		
	}

}
