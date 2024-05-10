package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeadDeleteAutomation {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		//driver.close();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneAreaCode")).sendKeys( "91");
		driver.findElement(By.name("phoneNumber")).sendKeys( "9876543211");
		WebElement leadbtn=driver.findElement(By.xpath("//button[@id='ext-gen334']"));
		
	     leadbtn.click();
	     
	     driver.findElement(By.linkText("Delete")).click();
	     driver.findElement(By.linkText("Find Leads")).click();
	     driver.close();
		
	}

}
