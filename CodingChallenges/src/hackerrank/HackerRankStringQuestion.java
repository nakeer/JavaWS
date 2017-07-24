package hackerrank;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class HackerRankStringQuestion {

	HackerRankStringQuestionTest test;
	
	@Before
	public void setUp() throws Exception {
		test = new HackerRankStringQuestionTest();
		Map<Integer,Integer> map = new HashMap<>();
		StringBuffer sb = new StringBuffer();
		
	}

	@Test
	public void test1() {
		assertEquals(test.question1("hi", "hello"), 7);
		assertEquals(test.question1("", "hello"), 5);
		assertEquals(test.question1("", ""), 0);
		assertEquals(test.question1("123", "123"),6 );
		assertEquals(test.question1("hi", "hi"), 4);
		assertEquals(test.question1(null, null), 0);
	}
	
	@Test
	public void test2() {
		assertEquals(test.question2("hi", "hi"), "No");
	}
	
	@Test
	public void test3() {
		assertEquals(test.question3("hi", "hi"), "Hi Hi");
		assertEquals(test.question3(null, null), null );
		assertEquals(test.question3(null, "hi"), null );
		assertEquals(test.question3("hi", null), null );
	}
}
