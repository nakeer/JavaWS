package hackerrank;
import java.util.ArrayList;
import java.util.List;

public class PermAndComb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "123";
		List<String> clist = new ArrayList<>();
		getCombinations("", s, clist);
		System.out.println(clist);
		List<String> plist = new ArrayList<>();
		getPerms("", s, plist);
		System.out.println(plist);
	}
	
	public static void getCombinations(String prefix, String s, List<String> list) {
		list.add(prefix);
		for(int i =0 ;i < s.length(); i++) {
			getCombinations(prefix + s.charAt(i), s.substring(i+1), list);
		}
		
	}
	
	public static void getPerms(String prefix, String s, List<String> list) {
		if(s.length() == 0) list.add(prefix);
		for(int i = 0;i < s.length(); i++) {
			getPerms(prefix + s.charAt(i), s.substring(0,i) + s.substring(i+1, s.length()), list);
		}
	}

}
