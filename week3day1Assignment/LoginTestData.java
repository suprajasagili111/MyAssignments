package week3day1Assignment;

public class LoginTestData extends TestData {
	public void enterUsername() {
		System.out.println("enter username");
	}
	
	public void enterPassword() {
		System.out.println("enter password");
	}
	public static void main(String[] args) {
		LoginTestData lt=new LoginTestData();
		lt.enterCredentials();
		lt.enterPassword();
		lt.enterUsername();
		lt.navigateToHomePage();
		
	}

}
