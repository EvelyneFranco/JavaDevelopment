import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class ConfigFile {
	
	JSONParser parser = new JSONParser();
	private String url;
	private String username;
	private String password;
	
	public Object ReadJson() {
		try {
			Object obj= parser.parse(new FileReader("C:\\Users\\evelyne.franco\\eclipse-workspace\\FrameworkProject\\src\\main\\java\\settings.json"));
			JSONObject jsonobj=(JSONObject) obj;
			return jsonobj;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public String SetUrl() {
		try {
			JSONObject jsonobj=(JSONObject) ReadJson();
			url= (String) jsonobj.get("url");
			 return url;
			 
			
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public String SetUsername() {
		try {
			JSONObject jsonobj=(JSONObject) ReadJson();
			username= (String) jsonobj.get("username");
			 return username;
			 
			
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public String SetPassword() {
		try {
			JSONObject jsonobj=(JSONObject) ReadJson();
			password= (String) jsonobj.get("password");
			 return password;
			 
			
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	

}
