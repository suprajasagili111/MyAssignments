package week3day2Assignment;

import java.util.ArrayList;
import java.util.List;

public class StringReverse {
	public static void main(String[] args) {
		List<String> originallist=new ArrayList<String>();
		originallist.add("HCL");
		originallist.add("Wipro");
		originallist.add("AspireSystems");
		originallist.add("CTS");
		
		System.out.println("original list is" + originallist);
		
		List<String> reverselist=new ArrayList<String>();
		
		for(int i=originallist.size()-1;i>=0;i--) {
			reverselist.add(originallist.get(i));
			
		}
		
		System.out.println("reversed list is" +reverselist);
		
	}

}
