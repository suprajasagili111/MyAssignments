package week3day1Assignment;

public class APIClient {
	public void sendRequest(String endpoint) {
		System.out.println("endpoint");
	}
	
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
		System.out.println("request body");
	}
	public static void main(String[] args) {
		APIClient apc=new APIClient();
		apc.sendRequest("done");
		apc.sendRequest("done", "req", false);
		
		
	}
}
