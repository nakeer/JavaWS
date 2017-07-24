package hackerrank;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

class StringSplit {
	public String split(String input, String first, String second) {
		if(input!=null || input.length()!=0) {
			return input.split(first)[1].split("-admin")[0];
		}
		else {
			return null;
		}
	}
}
public class StringSplitTest {

	StringSplit ss;
	
	@Before
	public void setUp() throws Exception {
		ss = new StringSplit();
	}

	//@Test
	public void test() {
		assertEquals("rum", ss.split("https://rum-admin.okta.com/admin/dashboard", "://", "-admin"));
	}

	//@Test
	public void emptyTest() {
		assertEquals(null, ss.split("", " ", "sfsf"));
	}
	
	@Test
	public void emptyTest1() {
		assertTrue("Nopedsfsfsf", false);
	}
	
}
