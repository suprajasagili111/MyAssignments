package week3day2Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElements {
	public static void main(String[] args) {
		Integer[] array= {1,2,3,4,10,6,8};
	     
		Arrays.sort(array);
		
		List<Integer> list=Arrays.asList(array);
		
		for(int i=0;i<list.size()-1;i++) {
			int current=list.get(i);
			int next=list.get(i+1);
		
		
	if(current +1!=next) {
		
		for(int j=current+1;j<next;j++) {
			System.out.println(j);
		}
		
	}
		}
}
}