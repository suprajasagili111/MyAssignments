package week4day2Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonInteraction {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("oneplus 9 pro");
		search.submit();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 WebElement price=driver.findElement(By.xpath("//span[contains(@class,'a-price-whole')][1]"));
		String price1=price.getText();
		System.out.println("price of the first product is" +price1 );
	WebElement rating=driver.findElement(By.xpath("//span[contains(@class,'a-icon-alt')][1]"));
	
	System.out.println("first rating is" +rating.getText());
	
	WebElement firstlink=driver.findElement(By.xpath("//img[@class='s-image'][1]"));
	firstlink.click();
	String originalwindow=driver.getWindowHandle();
	Set<String> windows=driver.getWindowHandles();
	for(String window:windows) {
		if(!window.equals(originalwindow)) {
			driver.switchTo().window(window);
			break;
		}
	}
		
	WebElement addtocart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
	addtocart.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement subtotal=driver.findElement(By.xpath("//span[@id='attach-accessory-cart-total-string']"));
	System.out.println("cart total is" + subtotal.getText());
	
	driver.quit();
	}
	}
		
