package hackerrank;
import java.util.Scanner;

public class AnagramTester {
	public static void main(String a[]) {
		//Scanner in = new Scanner(System.in);
		//String input = in.nextLine();
		String input = "abcdefgh";
		
		anagram(input.toCharArray(),0,input.length()-1);
		
	}
	
	public static void anagram(char[] wc, int start, int end) {
		if(start == end) System.out.print(String.valueOf(wc) +", ");
		else {
			char temp;
			for(int i = start; i <= end ; i++) {
				temp = wc[start] ; wc[start] = wc[i] ; wc[i] = temp;
				anagram(wc, start+1, end);
				temp = wc[start] ; wc[start] = wc[i] ; wc[i] = temp;
			}
		}
	}
}
