package week3day1Assignment;

public class CheckBoxButton extends Button{
	public void clickCheckButton() {
		System.out.println("checkbutton method");
	}
	
public static void main(String[] args) {
	CheckBoxButton ck=new CheckBoxButton();
	ck.Click();
	ck.clickCheckButton();
	ck.setText("hey");
}
}
