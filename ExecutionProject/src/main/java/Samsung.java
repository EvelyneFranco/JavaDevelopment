import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Samsung extends samsungElements{
	WebDriver driver;

	public Samsung(WebDriver driver) {
		super(driver);
			
		this.driver=driver;
		
	}
	
	
	public void searchItem() {
		samsungElements se=PageFactory.initElements(driver, samsungElements.class);
		//SearchProduct s=PageFactory.initElements(driver, SearchProduct.class);
		se.searchCriteria("Samsung Galaxy S9 64GB");
	}
	
	public String getPrice1() {
		samsungElements se=PageFactory.initElements(driver, samsungElements.class);
		return se.firstPrice();
	}
	
	public void samsungFlow1() {
		samsungElements se=PageFactory.initElements(driver, samsungElements.class);
		se.selectSamsung(); 
	}
	public String productPrice() {
		samsungElements se=PageFactory.initElements(driver, samsungElements.class);
		return se.secondPrice();
	}
	
	public void addCar() {
		samsungElements se=PageFactory.initElements(driver, samsungElements.class);
		se.AddToCar();
	}
	
	public String carPrice() {
		samsungElements se=PageFactory.initElements(driver, samsungElements.class);
		return se.carPrice();
	}
	
	public int oneProduct() {
		samsungElements se=PageFactory.initElements(driver, samsungElements.class);
		return se.oneProductInCar();
	}
	
	//method for cucumber test 
	
	public void carrito() {
		WebElement carro=driver.findElement(By.xpath("//a[contains(@aria-label,'1 artículo en el carrito')]"));
		carro.click();
		
		//return cant;
	}public int carroCantidad() {

		WebElement cantidad=driver.findElement(By.xpath("//span[@tabindex='-1'][contains(.,'1')]"));
		
		int cant=Integer.parseInt(cantidad.getText());
		return cant;
	}
}
