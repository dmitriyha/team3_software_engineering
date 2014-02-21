package threads;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.util.ArrayList;

import Admin.User;
import Database.UserDatabase;

public class MainListenerThread implements Runnable{
	// An object of this class will listen to client requests. 
	// As sson as one is received, it will set up a mechanism
	// to serve the client. The main listener itself will then
	// resume listening for requests.
	// Make this thread active (i.e. self-runnable).
	// Use sockets for network communication
	
	private static int PORTNUMBER = 9090;
	private Thread t;
	private volatile boolean stop = false;
	private ServerSocket socket;
	private InetSocketAddress addr;
	
	UserDatabase users=new UserDatabase();
	
	public MainListenerThread(){
		try {
			socket=new ServerSocket();
			addr= new InetSocketAddress("localhost",PORTNUMBER) ;
			socket.bind(addr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		t=new Thread(this);
		t.start();
	}
	
	public void interrupt() {
		t.interrupt();
		stop=true;
		try {
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		
		//while(!stop){
			try {
				while(!stop){
					new ClientServingThread(socket.accept(), users);
				}
				
			} catch ( IOException e) {
				// TODO Auto-generated catch block
				System.out.println("socket was closed");
			}
		//}
		
	}

}

