package Automation;


import org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonAutomation {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
	
	
	  WebElement clickcreate=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']"));
	  clickcreate.click(); System.out.println(driver.getTitle());
	  driver.navigate().back();
	  WebElement	disabled=  driver.findElement(By.id("j_idt88:j_idt92"));
	  if(!disabled.isEnabled()) {
		  System.out.println("Button is disabled");
	  }
	  else {
		  System.out.println("Button is enabled");
		  
	  }
	  WebElement submitt=  driver.findElement(By.id("j_idt88:j_idt94"));
	  System.out.println(submitt.getLocation());
	  
	  WebElement printbgv=driver.findElement(By.id("j_idt88:j_idt96"));
	  
	  System.out.println(printbgv.getCssValue("background-color"));
	  WebElement submit1=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']"));
	  Dimension size=submit1.getSize();
	  int height=size.getHeight();
	  int width=size.getWidth();
	  System.out.println("Height is" +height);
	  System.out.println("Width is" +width);
	  driver.close();
		
	}

}
