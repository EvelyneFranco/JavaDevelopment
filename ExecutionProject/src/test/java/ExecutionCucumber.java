


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class ExecutionCucumber{
	
	WebDriver driver;
	Samsung sa;
	String priceSearchResult;
	String carprice;
	int oneproductincar;
	Alien al;

	@Before
	 public void InitializeTest() {
		BrowserSetUp br= new BrowserSetUp();
		driver=br.browser();
		br.browserUrl();
		
		LoginPage lp=new LoginPage(driver);
		lp.login();
		
      
   }
	
	//Validate first price vs detail price
	

	@Given("^Samsung Search$") 
    public void SearchSamsungProduct() throws Throwable {
		sa=new Samsung(driver);
		sa.searchItem();
		priceSearchResult=sa.getPrice1();
		
    }
	
	
	@And("^Select samsung result$")
	public void SelectSamsung() throws Throwable {
        
		sa.samsungFlow1();
    }

	@Then("^first price should match wih current price$")
    public void ValidatePrice1() throws Throwable {
		String productPrice=sa.productPrice();
		Assert.assertEquals(productPrice, priceSearchResult);
    }
	
	//Validate again, first price vs Car current price
	
	@Given("^Samsung add to car$")
    public void AddSamsungToCar() throws Throwable {
		sa=new Samsung(driver);
		sa.searchItem();
		priceSearchResult=sa.getPrice1();
		sa.samsungFlow1();
		sa.addCar();
		
    }

	@And("^we got car price$")
	public void gotSamsubgCarPrice() throws Throwable {
		 carprice=sa.carPrice();
		
    }

	@Then("^first price should match with car price$")
    public void ValidateCarPrice() throws Throwable {
		Assert.assertEquals(priceSearchResult, carprice);
        
    }
	
	//Validate that the Shop car has 1 as a number

	@Given("^amazon is in car page$")
    public void isInCarPage() throws Throwable {
		sa=new Samsung(driver);
		sa.searchItem();
		priceSearchResult=sa.getPrice1();
		sa.carrito();
		//sa.addCar();
		
			oneproductincar=sa.carroCantidad();
		
		
        
    }

	@Then("^shop car has one has a number$")
    public void OneProductInCar() throws Throwable {
		Assert.assertEquals(oneproductincar, 1);
        
    }
	
	//Verify that the cart number is now 2
	
	@Given("^Search Alien$")
    public void SearchAlien() throws Throwable {
		al= new Alien(driver);
		al.searchAlien();
				
    }

	@And("^Select Alien product$")
	public void SelectAlien() throws Throwable {
		al.selectAlien();
		
    }

	@And("^add alien to car$")
	public void AddAlienToTheCar() throws Throwable {
		al.addToCar();
		
    }

	@Then("^car numer is now two$")
    public void twoProductsInCar() throws Throwable {
		Assert.assertEquals(al.secondProduct(), 2);
		TearDownTest();
    }

	
	 public void TearDownTest(){

		Clean c= new Clean(driver);
		c.cleanCar();
		
		//delete items in car after test so that everytime we run the test it pass
		c.eliminar();
	
		
    }
	 
	 @After
	 public void close() {
		 driver.close();
	 }
}
