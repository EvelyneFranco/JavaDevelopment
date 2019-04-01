import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlienElements {

	WebDriver driver;
	
	public AlienElements(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy (xpath="//img[contains(@alt,'Alienware AW3418DW Monitor Gaming Curvo 34\", LED-Lit, 3440 x 1440, 1 HDMI, 4 USB, 120 Hz')]")
	WebElement selectAlien;
	public void select() {
		try {
			WebDriverWait wait= new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.elementToBeClickable(selectAlien));
		
			selectAlien.click();
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	@FindBy (id="add-to-cart-button") WebElement addCar;
	public void AddToCar() {
		
		try {
			WebDriverWait wait= new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.elementToBeClickable(addCar));
			addCar.click();
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	@FindBy (xpath="//strong[contains(.,'2')]") WebElement secondProduct;
	public int secondProductInCar() {
		try {
			int prduct=Integer.parseInt(secondProduct.getText());
			return prduct;
		}catch (Exception e) {
			System.err.println(e.getMessage());
			return 0;
		}
	}
	@FindBy (id="twotabsearchtextbox") WebElement searchbox;
	@FindBy (xpath="//input[contains(@value,'Ir')]") WebElement ir;
	
	public void searchCriteria(String product) {
		
		try {
			WebDriverWait wait= new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox"))).isEnabled();
			searchbox.sendKeys(product);
			wait.until(ExpectedConditions.elementToBeClickable(ir));
			ir.click();
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	
}
