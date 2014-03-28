package classesToBeCalledByHttp;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.xml.bind.DatatypeConverter;

import org.json.simple.JSONObject;

import Admin.User;
import Database.UserDatabase;
import matches.BlindLocationMatch;
import matches.BlindMatch;
import threads.ClientServingThread.RequestType;

public class HttpMatch {
	static String base64EncodedMan = convertImg("img\\man.jpg");
	static String base64EncodedWoman = convertImg("img\\woman.jpg");
	
	public static String location(	RequestType requestType,
			Map<String, String> headerData, 
			Map<String, String> formParameters, 
			Map<String, String> methodAndParameters) {
		
		User me =UserDatabase.get().getUser(methodAndParameters.get("user"));
		BlindLocationMatch m = new BlindLocationMatch(me.getLoc(), UserDatabase.get().getAll());
		ArrayList<User> match= m.match();
		JSONObject obj=new JSONObject();
		String jsonToSend="";
		for (int i = 0;match.size()>i;i++){
			
			obj.put("user",match.get(i).getUsername());
			obj.put("interestedIn",match.get(i).getOrientation());
			obj.put("screenName", match.get(i).getSreenName());
			obj.put("location", match.get(i).getLoc());
			obj.put("gender", match.get(i).getGender());
			
			if(match.get(i).getGender().equals("Male")){
				obj.put("image", base64EncodedMan);
			}
			else if(match.get(i).getGender().equals("Female")){
				
				obj.put("image", base64EncodedWoman);
			}
			jsonToSend=jsonToSend+obj.toJSONString();
			
		}
		return new String(jsonToSend);
	}
	
	public static String blind(	RequestType requestType,
			Map<String, String> headerData, 
			Map<String, String> formParameters, 
			Map<String, String> methodAndParameters) {
		
		User me =UserDatabase.get().getUser(methodAndParameters.get("user"));
		BlindMatch m = new BlindMatch(me, UserDatabase.get().getAll());
		ArrayList<User> match= m.match();
		JSONObject obj=new JSONObject();
		String jsonToSend="";
		for (int i = 0;match.size()>i;i++){
			
			obj.put("user",match.get(i).getUsername());
			obj.put("interestedIn",match.get(i).getOrientation());
			obj.put("screenName", match.get(i).getSreenName());
			obj.put("location", match.get(i).getLoc());
			obj.put("gender", match.get(i).getGender());
			
			if(match.get(i).getGender().equals("Male")){
				obj.put("image", base64EncodedMan);
			}
			else if(match.get(i).getGender().equals("Female")){
				
				obj.put("image", base64EncodedWoman);
			}
			jsonToSend=jsonToSend+obj.toJSONString();
			
		}
		return new String(jsonToSend);
	}
	
	private static String convertImg(String file){
		File fnewMan=new File(file);
		BufferedImage originalImage = null;
		try {
			originalImage = ImageIO.read(fnewMan);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		try {
			ImageIO.write(originalImage, "jpg", baos );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] imageInByteMan=baos.toByteArray();
		return DatatypeConverter.printBase64Binary(imageInByteMan);
	}
	
}
