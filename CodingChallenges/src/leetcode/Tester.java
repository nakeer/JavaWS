package leetcode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Tester {
 
  public static void main(String args[]) {
	  
	  System.out.println(lengthOfLongestSubstringKDistinct("aa", 2));
  }
  
  public static int lengthOfLongestSubstringKDistinct(String s, int k) {
      if (s == null || s.length() == 0 || k == 0) return 0;
      int maxLen = 0, N = s.length();
      
      for(int i = 0;i < N;i++) {
          int j=i;
          Set<Character> set = new HashSet<>();
          while(j < N && set.size() <= k) {
        	  set.add(s.charAt(j));
        	  System.out.println(j + ": " + s.charAt(j));
              j++;
          }
          maxLen = Math.max((j-1-i), maxLen);
      }
      
      return maxLen;
  }
}

