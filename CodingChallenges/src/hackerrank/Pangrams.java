package hackerrank;
import java.util.HashSet;
import java.util.Set;

public class Pangrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "We promptly judged antique ivory buckles for the next prize";
		Set<Character> set = new HashSet<>();
		for(int i =0;i<s.length();i++) {
			
		}
        for(int i =0;i<s.length();i++) {
            
            set.add(s.charAt(i));
            System.out.println(s.charAt(i));
        }
        if(set.size()==26) {
            System.out.println("pangram");
        }
        else {
            System.out.println("not pangram");
            System.out.println(set + " - " + set.size());
        }
	}

}
