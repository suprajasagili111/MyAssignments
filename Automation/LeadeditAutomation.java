package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeadeditAutomation {
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
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("sam");
	driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("winchester");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("sammy");
	driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("computers");
	driver.findElement(By.name("description")).sendKeys( "lead create");
	driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("sammy11@gmail.com");
	WebElement state=driver.findElement(By.name("generalStateProvinceGeoId"));
	Select sec1=new Select(state);
	sec1.selectByVisibleText("New York");
	driver.findElement(By.className("smallSubmit")).click();
	driver.findElement(By.linkText("Edit")).click();
	WebElement inputfield=driver.findElement(By.id("updateLeadForm_description"));
	inputfield.clear();
	driver.findElement(By.name("importantNote")).sendKeys( "lead create update");
	driver.findElement(By.className("smallSubmit")).click();
	System.out.println(driver.getTitle());
	
	
}
}
