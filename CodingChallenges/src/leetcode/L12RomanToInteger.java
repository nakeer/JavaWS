package leetcode;
import java.util.HashMap;
import java.util.Map;

public class L12RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5,6,7,8,9,10,40,50,90,100,400,500,900,1000,3999};
		String[] romans = {"I","II","III","IV","V","VI","VII","VIII","IX","X","XL","L","XC","C","CD","D","CM","M","MMMCMXCIX"};
		
		int input = 2925;
		StringBuffer sb = new StringBuffer();
		while(input > 0) {
			for(int i=0;i<nums.length;i++) {
				if(input == nums[i]) {
					sb.append(romans[i]);
					input = 0;
					break;
				}
				else if(input < nums[i]) {
					input = input - nums[i-1];
					sb.append(romans[i-1]);
					break;
				}
			}
		}
		
		System.out.println(sb.toString());
		
		
		
		
	}
	
	

}
