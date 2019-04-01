

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Clean {
	WebDriver dirver;
	public Clean(WebDriver driver) {
		this.dirver=driver;
	}
	
	public void cleanCar() {
		WebDriverWait wait= new WebDriverWait(dirver, 5);
		WebElement carrito=dirver.findElement(By.id("a-autoid-0-announce"));
		wait.until(ExpectedConditions.elementToBeClickable(carrito));
		carrito.click();
		
		
	}
	
	

	public void eliminar() {
		WebDriverWait wait= new WebDriverWait(dirver, 5);
		WebElement elimina=dirver.findElement(By.xpath("//input[@aria-label='Eliminar Alienware AW3418DW Monitor Gaming Curvo 34\", LED-Lit, 3440 x 1440, 1 HDMI, 4 USB, 120 Hz']"));
		wait.until(ExpectedConditions.elementToBeClickable(elimina));
		elimina.click();
		
		WebElement eliminar=dirver.findElement(By.xpath("//input[@aria-label='Eliminar Samsung Galaxy S9 64GB Desbloqueado Negro Medianoche']"));
		wait.until(ExpectedConditions.elementToBeClickable(eliminar));
		eliminar.click();
		
		
		
	}
	

}
