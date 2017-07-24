package cci.string;

import java.util.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


class StringUnique {
	public boolean checkUniqueness(String input) {
		if (input == null) return false;
		else if (input.isEmpty()) return false;
		else if (input.length() == 1) return true;
		
		for(int i = 0;i<input.length()-1;i++){
			for(int j=i+1 ; j< input.length();j++) {
				if(input.charAt(i)==input.charAt(j)) return false;
			}
		}
		return true;
		
	}
	
	public boolean checkUniquenessSet(String input) {
		if (input == null) return false;
		else if (input.isEmpty()) return false;
		Set<Character> set = new HashSet<>();
		for(char c : input.toCharArray()) {
			set.add(c);
		}
		if(set.size() == input.length()){
			return true; 
		}
		return false;
	}
}

public class StringUniqueTest {

	StringUnique stringUnique;
	@Before
	public void setUp() throws Exception {
		stringUnique = new StringUnique();
	}

	@Test
	public void test() {
		//assertTrue("Given input is not unique",stringUnique.checkUniqueness("abc"));
		assertTrue("Given input is not unique",stringUnique.checkUniquenessSet("a"));
	}

}
