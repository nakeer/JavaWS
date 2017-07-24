import java.util.Arrays;

public class CharacterTest {
	public static void main(String args[]) {
		char[] str = new char[]{'a','b','c'};
		String str1 = "abba";
		char[] s1 = str1.toCharArray();
		char[] s2 = new char[s1.length];
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<s1.length;i++) {
			s2[i] = s1[s1.length -i-1];
		}
		System.out.println(s2);
		System.out.println(s1);
		String ss1 = s1.toString();
		String ss2 = s2.toString();
		System.out.println(ss1);
		if (ss1.equals(ss2)) {
			System.out.println("pali");
		}
		else System.out.println("nope");
		
		
		
	}
}
