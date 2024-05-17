package week3day2Assignment;

import java.util.Arrays;

public class SeconLargestNumber {
public static void main(String[] args) {
	int[] array= {3,2,11,4,6,7};
	Arrays.sort(array);
	int seclargest=array[array.length-2];
	System.out.println("the second largest number is" +seclargest);
}
}
