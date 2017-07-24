package leetcode;
import java.util.Arrays;

class TwoSum1Tests {

	TwoSum1Tests() {
		int[] sol = twoSum(new int[]{0,2,4,5} , 10);
		System.out.println(Arrays.toString(sol));
	}

	public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++) {
        	for(int j=i+1; j<nums.length;j++) {
        		if(nums[i]+nums[j]==target) {
        			return new int[] {i,j};
        		}
        	}
        }
		throw new IllegalArgumentException("No sol");
    }
}

public class TwoSum1 {

	TwoSum1Tests t1; 
	
	
	public void setUp() throws Exception {
		t1 = new TwoSum1Tests();
	}

	
	public void test() {
		//assertEquals(t1.twoSum(new int[]{1, 2, 3}, 3)[0], 0);
	}

}