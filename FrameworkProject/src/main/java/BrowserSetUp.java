import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSetUp {
	WebDriver driver;
	ConfigFile cf = new ConfigFile();
	
	
	public WebDriver browser() {
		return driver= new FirefoxDriver();
	}
	
	public void browserUrl() {
		driver.get(cf.SetUrl());
	}
	
	
}
