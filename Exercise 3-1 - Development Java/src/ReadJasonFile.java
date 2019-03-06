import java.io.FileReader;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadJasonFile {
	JSONParser parser = new JSONParser();
	private String url;
	private String browser;
	
	public static void main (String args[]) {
		
			ReadJasonFile js= new ReadJasonFile();
			System.out.println("AppSettings:");
			System.out.println("url: "+ js.SetUrl());
			System.out.println("browser: "+ js.setBrowser());
		
	}
	
	public Object ReadJson() {
		try {
			Object obj= parser.parse(new FileReader("C:\\Users\\evelyne.franco\\eclipse-workspace\\Exercise 3-1 - Development Java\\src\\file.json"));
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
			Map settings=((Map )jsonobj.get("AppSettings"));
			url= (String) settings.get("BaseUrl");
			 
			 return url;
			 
			
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public String setBrowser() {
		try {
			JSONObject jsonobj=(JSONObject) ReadJson();
			Map settings=((Map )jsonobj.get("AppSettings"));
			browser= (String) settings.get("BrowserTarget");
			 
			 return browser;
			 
			
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	
}
