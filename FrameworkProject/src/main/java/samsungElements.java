
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class samsungElements {
	WebDriver driver;
	
	
	@FindBy (xpath="//span[@class='a-price-whole'][contains(.,'11,999')]") WebElement price1;
	@FindBy (xpath="(//span[@class='a-price-fraction'][contains(.,'00')])[1]") WebElement fraction;
	@FindBy (xpath="//img[@data-image-index='0']") WebElement SelectFirst;
	@FindBy (id="priceblock_ourprice") WebElement productPrice;
	@FindBy (id="add-to-cart-button") WebElement addCar;
	@FindBy (id="twotabsearchtextbox") WebElement searchbox;
	@FindBy (xpath="//input[contains(@value,'Ir')]") WebElement ir;
	@FindBy (xpath="//span[contains(.,'$11,999.00')]") WebElement priceCar;
	@FindBy (xpath="//strong[contains(.,'1')]") WebElement oneproduct;
	
	 public samsungElements(WebDriver driver) {
		this.driver=driver;
	}
	 
	 
	
	
	//guarda precio del search result
	public String firstPrice() {
		try {
			String price="$"+price1.getText()+"."+ fraction.getText();
			return price;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	
	
	//selecciona la opcion1 de la busqueda
	public void selectSamsung() {
		
		try {
			WebDriverWait wait= new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.elementToBeClickable(SelectFirst));
			SelectFirst.click();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	//guarda precio del producto seleccionado
	public String secondPrice() {
		try {
			String price2=productPrice.getText();
			return price2;
		}catch(Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	
	public void AddToCar() {
		
		try {
			WebDriverWait wait= new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.elementToBeClickable(addCar));
			addCar.click();
		}catch(Exception e) {
			System.err.println(e.getMessage());
			
		}
	}
	
	public String carPrice() {
		try {
			String price=priceCar.getText();
			return price;
		}catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	public int oneProductInCar() {
		
		try {
			int can=Integer.parseInt(oneproduct.getText());
		
			return can;
		}catch (Exception e) {
			System.err.println(e.getMessage());
			return 0;
		}
	}
	
	
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
