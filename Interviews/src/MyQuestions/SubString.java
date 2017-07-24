package MyQuestions;

public class SubString {

	public static void main(String[] args) {
		String s1 = "introduction to appium";
		String s2 = "tro";
		
		int j =0;
		for(int i = 0 ;i <s1.length(); i++) {
			if(s1.charAt(i) == s2.charAt(j)){
				j++;
		
			}
			else {
				j=0;	
			}
			if(j == s2.length()) {
				System.out.println("YUP");
				break;
			}
			
			
			if(i > s1.length() - s2.length() +1) {
				System.out.println("NOPE");
				
			}
		}
		
	}

}
