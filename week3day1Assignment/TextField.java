package week3day1Assignment;

public class TextField extends WebElement {
	
	public void getText() {
		System.out.println("textfield gettext method");
		
	}
	public static void main(String[] args) {
		TextField tx=new TextField();
		tx.Click();
		tx.getText();
		tx.setText("hello");
	}

}
