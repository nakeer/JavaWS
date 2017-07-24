package hackerrank;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StackCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findAllPalindromes("abc"));
	}
	
	public static boolean isPalindrome(String s) {
		// implementation here
		if (s == null) return false;
		for(int i =0 ;i < s.length()/2 ; i++) {
		    if (s.charAt(i) != s.charAt(s.length()-i-1)) return false;
		}
		return true;
	}
	
	public static List<String> findAllPalindromes(String s) {
	
		if(s.length() == 1) return Arrays.asList(s);
		else {
			List<String> palis = null;
			for(int i = 0;i <= s.length(); i++) {
				System.out.println(i + " " + s);
				
				palis = findAllPalindromes(s.substring(i+1));
			}
			return palis;
		}
		
	}
		   
		  

}