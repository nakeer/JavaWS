package MyQuestions;

public class SubStringWithRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "dfsfsffdf Hedllo";
		String s2 = "ello";
		
		System.out.println(isSubstring(s1, s2));
	}

	public static boolean isSubstring(String s1, String s2){
		if(s2.length()==0)
		     return true;
		if((s1.length()==0 || s1.length() < s2.length()))
		if (s1.charAt(0)!=s2.charAt(0)){
		     return isSubstring(s1.substring(1),s2);
		    }
		    return true;
		}
}
