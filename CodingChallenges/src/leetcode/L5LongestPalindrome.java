package leetcode;
import java.util.ArrayList;
import java.util.List;

public class L5LongestPalindrome {
	
	private static int low;
	private static int maxLen;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//longestPalindrome("babadssffrfsssaaxqzxhklqp");
		System.out.println(longPali("bbabbccbba"));
		
	}
	
	public static boolean isAPalindrome(String in) {
		for(int i =0;i<in.length()/2;i++) {
			if(in.charAt(i) != in.charAt(in.length()-i-1)) {
				return false;
			}
		}
		return true;
	}

	public static String longestPalindrome(String s) {
		List<String> list = new ArrayList<>();
		System.out.println(getMaxPaliCombino("", s, list).size());
		return null;
				
    }
	
	public static List<String> getMaxPaliCombino(String prefix, String word, List<String> list){
		if(isAPalindrome(prefix))list.add(prefix);
		for(int i =0;i<word.length();i++) {
			getMaxPaliCombino(prefix+word.charAt(i), word.substring(i+1, word.length()), list);
		}
		return list;
	}
	
	public static String longPali(String s) {
		if(s.isEmpty() || s.length() == 1) return s;
		
		for(int i=0; i<s.length()-1; i++) {
			expandForPaliFromCenter(s,i,i);
			expandForPaliFromCenter(s,i,i+1);
		}
		return s.substring(low, low+maxLen);
	}
	
	public static void expandForPaliFromCenter(String s, int left, int right) {
		while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		if(maxLen < right-left-1) {
			low = left+1;
			maxLen = right-left-1;
		}
	}
}
