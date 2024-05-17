package week3day2Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindingIntersection {

	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<Integer>(Arrays.asList(3,2,11,4,6,7));
		List<Integer> list2=new ArrayList<Integer>(Arrays.asList(1,2,8,4,9,7));
		
		System.out.println("list1 is" +list1);
		System.out.println("list2 is" +list2);
		
		List<Integer> intersection=new ArrayList<Integer>(list1);
		
		intersection.retainAll(list2);
		System.out.println("common elements are" + intersection);
	}
}
