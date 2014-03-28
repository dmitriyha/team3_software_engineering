package misc;

import java.util.Date;

public class Message {
	String sender;
	//receiver
	String content;
	String date;
	
	
	public Message(String sender,String msg){
		this.sender=sender;
		this.content=msg;
		Date d = new Date();
        
		date=d.toString();
	}
	
	public String getSender(){
		return sender;
	}
	
	public String getContent(){
		return content;
	}
	
	public String getDate(){
		return date;
	}
	
}
