package leetcode;
import java.util.HashMap;
import java.util.Map;

public class L13RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,2,3,4,5,6,7,8,9,10,40,50,90,100,400,500,900,1000,3999};
		String[] romans = {"I","II","III","IV","V","VI","VII","VIII","IX","X","XL","L","XC","C","CD","D","CM","M","MMMCMXCIX"};
		
		Map<String, Integer> map = new HashMap<>();
		for(int i = 0;i<romans.length;i++) {
			map.put(romans[i], nums[i]);
		}
		
		
		String roman = "MMMDLXXXVI";
		int counter =0, pointer = 0, sum =0;
		while(counter < roman.length()) {
			pointer = counter;
			while(pointer < roman.length() && map.containsKey(roman.substring(counter, pointer+1)) ) {
				pointer++;
			}
			
			sum = sum + map.get(roman.substring(counter, pointer));
			counter = pointer;
		}
		
		System.out.println(sum);

	}

}
