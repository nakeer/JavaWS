package leetcode;

public class L9PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1221;
		System.out.println(isPalindrome(-2147483648));
		
	}
	public static boolean isPalindrome(int x) {
        String in = String.valueOf(x);
        System.out.println(in);
        for(int i =0;i<in.length();i++){
            if(in.charAt(i)!=in.charAt(in.length()-i-1)) {
            	
                return false;
            }
        }
        return true;
    }

}
