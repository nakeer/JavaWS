import java.util.Scanner;

public class AnagramsRecursion {

	public static void main(String[] args) {
//		System.out.print("Enter the word for anagram : ");
//		Scanner scanner = new Scanner(System.in);
//		String word = scanner.nextLine();
		String word1 = "abc";
		anagram("", word1);
		//System.out.println(word.substring(1));
	}
	
	public static void anagram(String prefix, String word) {
		if (word.length() == 1) {
			System.out.println(prefix + word);
			return;
		}
		else {
			for (int i = 0; i < word.length(); i++) {
				String current = word.substring(i, i+1);
				String before = word.substring(0, i);
				String after = word.substring(i+1);
				System.out.println("i: "+i+" Prefix: " + prefix + " Current: " + current + " Before: "+ before + " After: "+after);
				anagram(prefix + current, before + after);
			}
		}
	}

}
