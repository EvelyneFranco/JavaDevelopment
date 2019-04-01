import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Alien extends AlienElements{
	WebDriver driver;
	
	public Alien(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void searchAlien() {
		AlienElements al=PageFactory.initElements(driver, AlienElements.class);
		al.searchCriteria("Alienware Aw3418DW");
	}
	
	public void selectAlien() {
		AlienElements al=PageFactory.initElements(driver, AlienElements.class);
		al.select();
	}

	public void addToCar() {
		AlienElements al=PageFactory.initElements(driver, AlienElements.class);
		al.AddToCar();
	}
	
	public int secondProduct() {
		AlienElements al=PageFactory.initElements(driver, AlienElements.class);
		return al.secondProductInCar();
	}
}
