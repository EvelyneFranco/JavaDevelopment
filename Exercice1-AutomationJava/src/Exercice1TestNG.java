import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Exercice1TestNG {
	
	WebDriver driver;
  @Test
  public void ValidateMacText() {
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.findElement(By.linkText("Mac")).click();
	 String text= driver.findElement(By.xpath("//h3[contains(.,'Ligera como siempre.Poderosa como nunca.')]")).getText();
	 String expected="Ligera como siempre.\n" + 
	 		"Poderosa como nunca.";
	 Assert.assertEquals(text, expected, "Test fail, text is different");
  }
  
 
 public void IphoneXR() {
	 driver.findElement(By.id("ac-gn-link-search")).click();
	 driver.findElement(By.id("ac-gn-searchform-input")).sendKeys("iPhone XR");
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//a[@data-label='iPhone XR']")).click();
	
	 
	
	 
 }
 
 @Test
 public void IphoneXRTittle() {
	 IphoneXR();
	 String expectedTittle="iPhone XR - Apple (MX)";
	 String actual=driver.getTitle();
	 Assert.assertEquals(actual, expectedTittle);
	 	 
 }
  
 @Test
 public void IphoneXRElementsEnable() {
	 IphoneXR();
	 Assert.assertTrue(driver.findElement(By.linkText("Pantalla")).isEnabled());
	 Assert.assertTrue(driver.findElement(By.linkText("Face ID")).isEnabled());
	 Assert.assertTrue(driver.findElement(By.linkText("A12 Bionic")).isEnabled());
	 Assert.assertTrue(driver.findElement(By.linkText("Cámaras")).isEnabled());
	 Assert.assertTrue(driver.findElement(By.linkText("Sólo el iPhone")).isEnabled());
	 Assert.assertTrue(driver.findElement(By.linkText("Especificaciones")).isEnabled());
	 Assert.assertTrue(driver.findElement(By.linkText("Comprar")).isEnabled());
 }
  @BeforeTest
  public void setUpBrowserFirefox() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
	  driver= new FirefoxDriver();
	  driver.get("https://www.apple.com/mx/");
  }
   @AfterTest
   public void cleanTest() {
	 driver.close();
   }
}
