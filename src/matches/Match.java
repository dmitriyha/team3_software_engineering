package matches;

import java.util.ArrayList;

import Admin.User;


public abstract class Match {
	protected ArrayList<User> users;
	public Match(ArrayList<User> u) {
		users=u;
	}

	abstract ArrayList<User> match();
}
