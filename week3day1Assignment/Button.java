package week3day1Assignment;

public class Button extends WebElement {
	public void submit() {
		System.out.println("button submit method");
	}
public static void main(String[] args) {
	Button b=new Button();
	
	b.Click();
	b.submit();
	
}
}


