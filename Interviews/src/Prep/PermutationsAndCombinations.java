package Prep;

public class PermutationsAndCombinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abc";
		permutations(input, "");
		System.out.println("*****");
		combinations(input, "");
	}
	
	public static void permutations(String input, String prefix) {
		int n = input.length();
		if(n==0){
			System.out.println(prefix);
		}
		for(int i = 0 ;i< n ; i++) {
			permutations(input.substring(0,i) + input.substring(i+1,n), prefix + input.charAt(i));
		}
		
	}
	
	public static void combinations(String input, String prefix) {
		System.out.println(prefix);
		for(int i=0;i<input.length();i++){
			combinations(input.substring(i+1), prefix+input.charAt(i));
		}
	}

}
