package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountsCreationAutomation {
public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		//driver.close();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("testleaf");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement industryy=driver.findElement(By.name("industryEnumId"));
		Select sec=new Select(industryy);
		sec.selectByIndex(3);
		WebElement owner=driver.findElement(By.name("ownershipEnumId"));
		Select sec1=new Select(owner);
		sec1.selectByVisibleText("S-Corporation");
		WebElement source=driver.findElement(By.id("dataSourceId"));
		Select sec2=new Select(source);
		sec2.selectByValue("LEAD_EMPLOYEE");
		WebElement marketing=driver.findElement(By.id("marketingCampaignId"));
		Select sec3=new Select(marketing);
		sec3.selectByIndex(6);
		WebElement state=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select sec4=new Select(state);
		sec4.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println(driver.getTitle());
		driver.close();
		
	}



}
