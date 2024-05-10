package Automation;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttonAutomation {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration. ofSeconds(20));
     // driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		WebElement radiobtn=driver.findElement(By.xpath("//label[text()='Safari']"));
		radiobtn.click();
		if(radiobtn.isSelected()) {
			System.out.println("btn is selected");
		}
			else {
				System.out.println("btn is unselected");
			
		}
		radiobtn.click();
		
		if(!radiobtn.isSelected()) {
			System.out.println("btn is unselected");
		}
		else {
			System.out.println("btn is selected");
		}
		
	}

}
