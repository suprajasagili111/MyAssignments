package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbAccountCreation {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		//driver.manage().timeouts().implicitlyWait(Duration,ofseconds(20));
		driver.findElement(By.name("firstname")).sendKeys("Dean");
		driver.findElement(By.name("lastname")).sendKeys("winchester");
		driver.findElement(By.name("reg_email__")).sendKeys("Dean112@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Dean123");
		driver.findElement(By.id("day")).sendKeys("25");
		driver.findElement(By.id("month")).sendKeys("march");
		driver.findElement(By.id("year")).sendKeys("1997");
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.name("websubmit")).click();
		
	}
}
