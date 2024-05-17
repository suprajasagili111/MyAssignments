package week3day1Assignment;

public class ReverseOddWords {
	public static void main(String[] args) {
		String test="i am a software tester";
		String[ ] words=test.split("\\s+");
		for(int i=0;i<words.length;i++) {
			if(i%2==0) {
				char[] charArray=words[i].toCharArray();
				if(charArray.length%2==0) {
					for(int j=charArray.length-1;j>=0;j--) {
						System.out.println(charArray[j]);
					}
					System.out.println(" ");
				}
			}
		}
			
				
		
		
	}

}
