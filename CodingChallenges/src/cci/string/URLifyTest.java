package cci.string;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


class URLify{
	String s;
	
	public String replaceWith(String s1) {
		if(s1 == null || s1.isEmpty()) return null;
		String[] splitStrings = s1.split(" ");
		StringBuffer sb = new StringBuffer();
		if(splitStrings.length>0)
			sb.append(splitStrings[0]);
		
		for(int i=1;i<splitStrings.length;i++) {
			sb.append("%20"+splitStrings[i]);
		}
	
		return sb.toString();
	}
}

public class URLifyTest {

	URLify urlify;
	
	@Before
	public void setUp() throws Exception {
		urlify = new URLify();
	}

	@Test
	public void test() {
		assertEquals("Mr%20John%20Smith", urlify.replaceWith("Mr John Smith   "));
		assertEquals("Mr", urlify.replaceWith("Mr"));
	}

}
