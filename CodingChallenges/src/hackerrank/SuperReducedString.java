package hackerrank;
import java.util.HashMap;
import java.util.Map;

public class SuperReducedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	        String s = "zztqooauhujtmxnsbzpykwlvpfyqijvdhuhiroodmuxiobyvwwxupqwydkpeebxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh";
			//String s = "aaabccbddd";
	        if(s==null) System.out.println("Empty String");
	        System.out.println(recursion(s, s.length(), 0));

	}
	
	public static String recursion(String s, int prevcount, int newCount) {
		
		if(prevcount == newCount) return s;
        StringBuffer sb = new StringBuffer(); 
    	for(int i =0; i < s.length()-1; i++) {
        	if(s.charAt(i)==s.charAt(i+1)){
        		i = i+1;
        	} else {
        		sb.append(s.charAt(i));
        	} 
        	if (i == s.length()-2) {
        		sb.append(s.charAt(i+1));
        	}
        } 
        return recursion(sb.toString(), s.length(), sb.length());

	}

}
