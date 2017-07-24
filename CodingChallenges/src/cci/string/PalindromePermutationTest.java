package cci.string;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.util.*;

class PalindromePermutation {
	List<String> list = new ArrayList<>();
	public boolean isaPermWithPali(String s) {
		s = s.replace(" ", "");
		s = s.toLowerCase();
		list = getAllPermutations("", s);
		for(String input : list) {
			if(isAPalindrome(input)){
				return true;
			}
		}
		return false;
	}
	

	public List<String> getAllPermutations(String prefix, String input) {
		int N = input.length();
		if(N==0) list.add(prefix);
		
		for(int i=0;i<N;i++) {
			getAllPermutations(prefix+input.charAt(i), input.substring(0,i)+input.substring(i+1, N));
		}
		
		return list;
	}
	
	public boolean isAPalindrome(String input) {
		if(input == null) return false;
		if(input.isEmpty()) return false;
		if(input.length() == 1) return true;
		
		for(int i=0;i<input.length()/2;i++) {
			if(input.charAt(i) != input.charAt(input.length()-1-i))
				return false;
		}
		return true;
	}
}

public class PalindromePermutationTest {

	PalindromePermutation palindromePermuation;
	
	@Before
	public void setUp() throws Exception {
		palindromePermuation = new PalindromePermutation();
	}

	@Test
	public void test() {
		assertTrue(palindromePermuation.isaPermWithPali("Tact Coa"));
		assertTrue(palindromePermuation.isaPermWithPali(""));
		assertTrue(palindromePermuation.isaPermWithPali("malayalam"));
		assertTrue(palindromePermuation.isaPermWithPali("amma"));
		assertTrue(palindromePermuation.isaPermWithPali("Tacsssss"));
	}

}
