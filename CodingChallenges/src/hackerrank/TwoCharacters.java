package hackerrank;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoCharacters {

	//public static 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "beabeefeab";
		List<String> list = new ArrayList<>();
		Set<Character> set = new HashSet<>();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<s.length();i++){
			if(!set.contains(s.charAt(i))) {
				sb.append(s.charAt(i));
			}
			set.add(s.charAt(i));
		}
		
		int combinationsSize = set.size() - 2;
		//System.out.println(sb.toString());
		getCombinationsWithSize("", sb.toString(), list, combinationsSize);
		//System.out.println(list);
		int max = 0;
		for(int listsize = 0; listsize < list.size(); listsize++) {
			String output = s;
			for(int i = 0; i < combinationsSize; i++) {
				output = output.replaceAll(list.get(listsize).charAt(i)+"", "");
			}
			if(validateString(output)){
				max = max < output.length() ? output.length() : max;
			}
		}
		
		System.out.println(max);
		
	}
	
	public static boolean validateString(String input) {
		for(int i = 0 ;i < input.length()-2; i++) {
			//System.out.println(input.charAt(i) + ": " + input.charAt(i+1));
			if(!(input.charAt(i) !=input.charAt(i+1) && input.charAt(i) == input.charAt(i+2))) {
				return false;
			}
		}
		return true;
	}
	
	public static void getCombinationsWithSize(String prefix, String s, List<String> list, int size) {
		if(prefix.length() == size)
		list.add(prefix);
		for(int i =0 ;i < s.length(); i++) {
			getCombinationsWithSize(prefix + s.charAt(i), s.substring(i+1), list, size);
		}
		
	}
	
	public static void getPerms(String prefix, String s, List<String> list) {
		if(s.length() == 0) list.add(prefix);
		for(int i = 0;i < s.length(); i++) {
			getPerms(prefix + s.charAt(i), s.substring(0,i) + s.substring(i+1, s.length()), list);
		}
	}

}
