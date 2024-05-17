package week3day2Assignment;

public class DbConnect implements DataBaseConnection {

	public void connect() {
	
		System.out.println("connect");
		
	}

	public void disconnect() {
		
		System.out.println("disconnect");
	}

	public void executeUpdate() {
		
		System.out.println("update");
	}
	public static void main(String[] args) {
		DbConnect d=new DbConnect();
		d.connect();
		d.disconnect();
		d.executeUpdate();
		
	}

}
