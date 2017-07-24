package leetcode;

public class NumberOf1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(hammingWeight(1073741824));
		System.out.println(hammingWeight(101));
	}
	
	public static int hammingWeight(int n) {
        int i = 0, count = 0, sum = 1;
        if(n == 0) return 0;
        while(n >= sum) {
            if( (n & sum) == sum) {
                count++;
            } 
            sum = sum * 2;
            System.out.println(sum);
        }
        
        return count;
    }
    
    public int pow2(int i) {
        if (i == 0 ) return 1;
        return 2 * pow2(i-1);
    }

}
