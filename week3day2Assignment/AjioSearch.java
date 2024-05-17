package week3day2Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AjioSearch {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		try {
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		Thread.sleep(1000);
		WebElement malecheckbox= driver.findElement(By.xpath("//input[@type='checkbox' and @value='Men']"));
		
		
	     if(!malecheckbox.isSelected()) {
	    	
	    	 malecheckbox.click();
	     }
		}
	    	 
	  catch(Exception e){
		  e.printStackTrace();
	  }
	  finally {
		  System.out.println("done");
	  }
		
		WebElement checkbox= driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']")); 
	
		if(!checkbox.isSelected()) {
			checkbox.click();
		}
		
		else {
			System.out.println("click bags");
		}
		List<WebElement> bagList = driver.findElements(By.id("Men - Fashion Bags"));
		System.out.println(bagList.size());
		
		List<WebElement> brandList=driver.findElements(By.className("brand"));
		for(WebElement each:brandList) {
			String brands=each.getText();
			System.out.println(brands);
		}
	}

}
