import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class executionClass extends setUpClass {
	
	WebDriver driver;
	setUpClass su=new setUpClass();
	
	@BeforeClass
	public void goToURL() {
		driver=drivers("firefox");
		String url=getUrl2();
		driver.get(url);
		clickOnEnglish();
		
	}

	@Test (priority=1)
	public void validateUrl() {
		setActualFacebookURL(driver);//set actual property
		String actual=getActualUrl(driver);//get actual property
		String expected=getUrl2();//get property expected 
		Assert.assertEquals(actual, expected);
	}
	@Test (priority=2)
	public void validateSignUpTittle() {
		setFacebookTittle(driver); //set property
		String actual=getActualFacebookTittle(driver); //get property
		String expected=getExpectedTittle();//get property
		Assert.assertEquals(actual, expected);
	}
	
	@Test (priority=3)
	public void validateConnectLabelText() {
		//interactings with elements
		fillUpSignUp(driver);
		//assert label text
		Assert.assertTrue(ConnectLabelText(driver));
		
	}
	@Test (priority=4)
	public void FindYourAccountText() {
		Assert.assertTrue(validateforgot());
	}
	@Test (priority=5)
	public void errorMessageNotSearchResults() {
		String actual=getErrorMessage();
		String expected="No Search Results" + "\n"+
				"Your search did not return any results. Please try again with other information.";
		Assert.assertEquals(actual, expected);
	}
	

	@AfterClass
	public void Close() {
		driver.close();
	}
}
