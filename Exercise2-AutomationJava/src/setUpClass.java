import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class setUpClass {

	
	private String actualUrl;
	private String actualTittle;
	private String expectedUrl="https://www.facebook.com/";
	private String expectedTittle="Facebook - Log In or Sign Up";
	
	WebDriver driver;
	public String getUrl2() {
		return expectedUrl;
	}

	public void setActualFacebookURL(WebDriver driver) {
		actualUrl= driver.getCurrentUrl();
	}
	public String getActualUrl(WebDriver driver) {
		return actualUrl;
	}
	public void clickOnEnglish() {
		//my browser is openen in spanish even if I have it on english, vaildation is on english
		driver.findElement(By.xpath("//a[@class='_sv4'][contains(.,'English (US)')]")).click();
	}
	
	
	public WebDriver drivers(String browser) {
		//in case of add more browsers
		if (browser.equalsIgnoreCase("firefox")) {
			return driver= new FirefoxDriver();
		}
		return null;
	}
	
	public void setFacebookTittle(WebDriver driver) {
		actualTittle= driver.getTitle();
	}
	public String getActualFacebookTittle(WebDriver driver) {
		return actualTittle;
	}
	public String getExpectedTittle() {
		return expectedTittle;
	}
	public void waits5() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void fillUpSignUp(WebDriver driver) {
		WebDriverWait wait= new WebDriverWait(driver, 5);
		
		driver.findElement(By.id("u_0_c")).sendKeys("testName");
		driver.findElement(By.id("u_0_e")).sendKeys("testLast");
		driver.findElement(By.id("u_0_h")).sendKeys("test@test.com");
		driver.findElement(By.id("u_0_o")).sendKeys("passtest");
		
		Select selectMonth=new Select(driver.findElement(By.id("month")));
		selectMonth.selectByVisibleText("Jul");
	
		Select selectDay=new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("31");
		Select selectYear=new Select(driver.findElement(By.id("year")));
		selectYear.selectByVisibleText("1991");
		WebElement female=driver.findElement(By.id("u_0_9"));
		wait.until(ExpectedConditions.elementToBeClickable(female));
		female.click();
		WebElement button= driver.findElement(By.id("u_0_u"));
		wait.until((ExpectedConditions.elementToBeClickable(button)));
		
	}
	
	public boolean ConnectLabelText(WebDriver driver) {
		String labelText="Connect with friends and the"  + '\n' + 
				"world around you on Facebook.";
		
		String actualLabel=driver.findElement
				(By.xpath("//h2[@class='inlineBlock _3ma _6n _6s _6v'][contains(.,'Connect with friends and theworld around you on Facebook.')]"))
				.getText();
	
		if(labelText.equals(actualLabel)) {
			return true;
		}else {return false;}
	}
	
	public void goToForgotAccount() {
		WebDriverWait wait= new WebDriverWait(driver, 5);
		WebElement forgot=driver.findElement(By.linkText("Forgot account?"));
		wait.until((ExpectedConditions.elementToBeClickable(forgot)));
		forgot.click();
	
	}
	
	public boolean validateforgot() {
		goToForgotAccount();
		String account= driver.findElement(By.xpath("//h2[@class='uiHeaderTitle'][contains(.,'Find Your Account')]")).getText();
		String expected="Find Your Account";
		
		if(account.equals(expected)) {
			return true;
		}else {return false;}
	}
	
	public void goToerrorMessage() {
		WebDriverWait wait= new WebDriverWait(driver, 10);
		WebElement email=driver.findElement(By.id("identify_email"));
		wait.until((ExpectedCondition<Boolean>) driver -> email.isEnabled());
		email.sendKeys("test@sdettest.com");
		WebElement search=driver.findElement(By.xpath("//input[@value='Search']"));
		wait.until((ExpectedCondition<Boolean>) driver -> search.isEnabled());
		search.click();
		
		
		
	}
	
	public String getErrorMessage() {
		goToerrorMessage();
		waits5();
		WebElement completeText=driver.findElement(By.xpath("//div[@class='pam uiBoxRed'][contains(.,'No Search ResultsYour search did not return any results.  Please try again with other information.')]"));
		return completeText.getText();
	}

	

}
