package MyQuestions;

public class AnagramsRecursion {

	public static void main(String[] args) {
		String word = "Hello";
		System.out.println(word.substring(3));
		anagram("",word);
	}
	
	public static void anagram(String prefix, String word) {
		if (word.length() ==1) {
			System.out.println(prefix + word);
		}
		else {
			for(int i =0;i<word.length();i++){
				String current = word.substring(i,i+1);
				String before = word.substring(0,i);
				String after = word.substring(i+1);	
				anagram(prefix + current, before+after);
			}
		}
		
	}

}
