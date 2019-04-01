import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginElements {
	WebDriver driver;
	ConfigFile cf= new ConfigFile();

	
	@FindBy(xpath="//span[contains(text(),'Hola, Identifícate')]")
	WebElement identificarse;
	
	@FindBy (id="ap_email") WebElement email;
	
	@FindBy (id="ap_password") WebElement pass;
	
	@FindBy (id="signInSubmit") WebElement button;
	
	public LoginElements(WebDriver driver) {
		this.driver=driver;
	}
	
	public void login() {
		try {
			WebDriverWait wait= new WebDriverWait(driver, 7);
			//wait for first element
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Hola, Identifícate')]"))).isEnabled();
				identificarse.click();
			wait.until(ExpectedConditions.elementToBeClickable(email));
		
			email.sendKeys(cf.SetUsername());
			pass.sendKeys(cf.SetPassword());
			button.click();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
