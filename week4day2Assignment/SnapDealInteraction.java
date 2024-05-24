package week4day2Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDealInteraction {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement mensfahion=driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
			
	Actions actions=new Actions(driver);
	actions.moveToElement(mensfahion).perform();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement sportsshoes=driver.findElement(By.xpath("//span[text()='Sports Shoes']"));
	sportsshoes.click();
	WebElement countshoes=driver.findElement(By.xpath("//span[text()='Sports Shoes']"));
	System.out.println("no.of shoes is"+ countshoes.getText() );
	WebElement trainingshoes=driver.findElement(By.xpath("//div[text()='Training Shoes']"));
	trainingshoes.click();
	WebElement sort=driver.findElement(By.xpath("//div[@class='sort-drop clearfix']"));
	sort.click();
	WebElement lowtohigh=driver.findElement(By.xpath("//li[@data-sorttype='plth']"));
	lowtohigh.click();
	List<WebElement> prices=driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
	boolean sorted=true;
	for(int i=0;i<prices.size()-1;i++) {
		if
		(Integer.parseInt(prices.get(i).getText().replaceAll("[^0-9]", ""))>
		Integer.parseInt(prices.get(i + 1).getText().replaceAll("[^0-9]", "")))
		{
			sorted=false;
			break;
		}
	}
	System.out.println("items are sorted correctly" + sorted);
WebElement minslider=driver.findElement(By.xpath("//input[@name='fromVal']"));
minslider.clear();
minslider.sendKeys("500");

WebElement maxslider=driver.findElement(By.xpath("//input[@name='toVal']"));
maxslider.clear();
maxslider.sendKeys("700");

WebElement gobtn=driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary'])"));
gobtn.click();

WebElement color=driver.findElement(By.xpath("//label[@for='Color_s-White & Blue']"));
color.click();

List<WebElement> filters=driver.findElements(By.xpath("//div[@class='navFiltersPill']/a"));
System.out.println("Applied filters ");
for(WebElement filter:filters) {
	System.out.println(filter.getText());
WebElement firstimage=driver.findElement(By.xpath("//div[@class='product-tuple-image']"));
actions.moveToElement(firstimage).perform();

WebElement quickvieew=driver.findElement(By.xpath("//div[@class='clearfix row-disc']//div[contains(text(),'QuickView']"));

quickvieew.click();

WebElement quickViewFrame=driver.findElement(By.xpath("//iframe[@class='product-quicklook-iframe']"));
driver.switchTo().frame(quickViewFrame);

WebElement cost=driver.findElement(By.xpath("//span[@class='payBlkBig']"));
WebElement discount=driver.findElement(By.xpath("//span[@class='percent=desc']"));
System.out.println("cost is" + cost.getText() );
System.out.println("discount is" + discount.getText());

driver.switchTo().defaultContent();

WebElement close=driver.findElement(By.xpath("//div[@class='close close1 marR10']/i"));
close.click();

driver.quit();

}

}
}

