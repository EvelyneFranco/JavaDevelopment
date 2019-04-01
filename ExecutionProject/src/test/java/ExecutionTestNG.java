import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExecutionTestNG {
	
	WebDriver driver;
	Samsung sa;
	String priceSearchResult;
	@BeforeTest
	public void setUrl() {
		BrowserSetUp br= new BrowserSetUp();
		driver=br.browser();
		br.browserUrl();
		
		LoginPage lp=new LoginPage(driver);
		lp.login();
		
	}
	 
	@Test (priority=0)
	public void ValidatePrice1Samsung() {
		
		sa=new Samsung(driver);
		sa.searchItem();
		priceSearchResult=sa.getPrice1();
		sa.samsungFlow1();
		String productPrice=sa.productPrice();
		
		Assert.assertEquals(priceSearchResult, productPrice);
	}
	
	@Test (priority=1)
	public void ValidatePrice2SamsungInCar() {
		sa=new Samsung(driver);
		sa.addCar();
		String carprice=sa.carPrice();
		
		Assert.assertEquals(priceSearchResult, carprice);
	}
	
	@Test (priority=2)
	public void ValidateOneProductInCar() {
		sa=new Samsung(driver);
		Assert.assertEquals(sa.oneProduct(), 1);
	}
	
	@Test (priority=3)
	public void VaidateAlienInCar() {
		Alien al= new Alien(driver);
		al.searchAlien();
		al.selectAlien();
		al.addToCar();
		Assert.assertEquals(al.secondProduct(), 2);
	}
	
	@AfterTest
	public void close() {
		Clean c= new Clean(driver);
		c.cleanCar();
		
		//delete items in car after test so that everytime we run the test it pass
		c.eliminar();
	
		driver.close();
	}
	
	
}
