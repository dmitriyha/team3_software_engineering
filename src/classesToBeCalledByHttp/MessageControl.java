package classesToBeCalledByHttp;

import java.util.Map;

import org.json.simple.JSONObject;

import misc.Message;
import threads.ClientServingThread.RequestType;
import Admin.User;
import Database.UserDatabase;

public class MessageControl {
	public static String send(	RequestType requestType,
								Map<String, String> headerData, 
								Map<String, String> formParameters, 
								Map<String, String> methodAndParameters) {
		if(UserDatabase.get().checkToken(methodAndParameters.get("from"),methodAndParameters.get("authToken"), false)){
				UserDatabase.get().getUser(methodAndParameters.get("to"))
					.saveMessage(methodAndParameters.get("from"),methodAndParameters.get("message"));
			
			
		}
		return new String(" ");
		
		
		
	}
	
	public static String allMsg(	RequestType requestType,
			Map<String, String> headerData, 
			Map<String, String> formParameters, 
			Map<String, String> methodAndParameters) {
if(UserDatabase.get().checkToken(methodAndParameters.get("user"),methodAndParameters.get("authToken"), false)){
		
		
		String messages="";
		User u = UserDatabase.get().getUser(methodAndParameters.get("user"));
		int i=u.getMsgSize()-1;
		for(Message msg=u.getMsg(i);msg!=null;msg=u.getMsg(i)){
			
			msg=UserDatabase.get().getUser(methodAndParameters.get("user")).getMsg(i);
			JSONObject obj=new JSONObject();
			obj.put("from",msg.getSender());
			obj.put("name", UserDatabase.get().getUser(msg.getSender()).getSreenName());
			obj.put("date", msg.getDate());
			obj.put("message",msg.getContent());
			
			//put token into database
			
			messages=messages+obj.toJSONString();
			i--;
			System.out.println(messages);
		}
		return new String(messages);
	}
	return new String("");
	
	
	
	}
}