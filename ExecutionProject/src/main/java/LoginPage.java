import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LoginElements{
	WebDriver driver;
	
		public LoginPage(WebDriver driver) {
			
			super(driver);
			//LoginElements le=PageFactory.initElements(driver, LoginElements.class);
			
			this.driver=driver;
		}
	
		//LoginElements el= new LoginElements(driver);
	public void login() {
		LoginElements le=PageFactory.initElements(driver, LoginElements.class);
		
		le.login();
	}
	
}

