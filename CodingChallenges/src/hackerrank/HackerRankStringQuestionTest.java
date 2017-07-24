package hackerrank;
import java.util.Scanner;

public class HackerRankStringQuestionTest {

    public  int question1(String A, String B) {
        return A != null && B!= null ? A.length()+B.length() : 0;
    }
    
    public  String question2(String A, String B) {
    	String tobefirst = A.length() >= B.length() ? B:A;
    	for(int i =0 ; i < tobefirst.length() ; i++) {
    		if(A.charAt(i) > B.charAt(i)) {
    			return "Yes";
    		} else if (A.charAt(i) == B.charAt(i)) {
    			continue;
    		} else {
    			return "No";
    		}
    	}
        return A.length() >= B.length() ? "No" : "Yes";
    }
    
    public  String question3(String A, String B) {
    	if(A == null || B == null) return null;
        return ((Character)A.charAt(0)).toString().toUpperCase() + A.substring(1) + " " + ((Character)B.charAt(0)).toString().toUpperCase() + B.substring(1);
    }
}
