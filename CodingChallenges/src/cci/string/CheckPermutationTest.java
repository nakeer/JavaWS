package cci.string;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Before;
import org.junit.Test;


class CheckPermutation{
	List<String> list = new ArrayList<>();
	Set<String> set = new HashSet<>();
	
	public Set<String> getAllPermutations(String s) {
		set.addAll(getPermutations("", s));
		return set;
	}
	
	public List<String> getPermutations(String prefix, String word) {
		int N = word.length();
		if(N == 0) list.add(prefix);
		
		for(int i = 0; i< N ; i++) {
			getPermutations(prefix + word.charAt(i), word.substring(0,i) + word.substring(i+1, N));
		}
		return list;
	}
	
	public boolean isaPermuation(String s1, String s2) {
		
		if(s1 == null || s2 == null) return false;
		else if(s1.isEmpty() || s2.isEmpty()) return false;
		else if(s1.equals(s2)) return true;
		else if(s1.length() != s2.length()) return false; 
		else {
			if(getAllPermutations(s1).contains(s2)) {
				return true;
			}
			return false;
		}
	}
}

public class CheckPermutationTest {
	CheckPermutation cp;
	@Before
	public void setUp() throws Exception {
		cp = new CheckPermutation();
	}

	@Test
	public void test() {
		assertFalse("Nope not equal" , cp.isaPermuation("", "") );
		assertFalse("Nope not equal" , cp.isaPermuation("", "abc") );
		assertTrue("Nope not equal" , cp.isaPermuation("a", "a") );
		assertTrue("Nope not equal" , cp.isaPermuation("abc", "abc") );
		assertTrue("Nope not equal" , cp.isaPermuation("abc", "cba") );
		assertFalse("Nope not equall" , cp.isaPermuation("abcd", "abc") );
		assertFalse("Nope not equall" , cp.isaPermuation("abc", "abcb") );
		assertFalse("Nope not equall" , cp.isaPermuation("abcd", "abcb") );
	}

}
