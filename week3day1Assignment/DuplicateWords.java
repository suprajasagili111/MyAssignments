package week3day1Assignment;

public class DuplicateWords {
	public static void main(String[] args) {
		String text="we learn java basics as part of java sessions in java1";
		int count=0;
		String[] words=text.split("\\s+");
		for(int i=0;i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equalsIgnoreCase(words[j])){
					words[j]="";
					count++;
					
				}
			}
		}
		if(count>1) {
			System.out.println("array with duplicates replaced");
			for(String word:words) {
				System.out.println(word + " ");
			}
		}
	}

}
