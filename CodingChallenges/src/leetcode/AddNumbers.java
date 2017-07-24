package leetcode;

public class AddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(13%10);
		System.out.println(addDigits(9));
	}
	
	public static int addDigits(int num) {
        if(num < 10) return num;
        
        int sum = 0;
        while(num/10 != 0 && num > 9) {
            sum = sum + num%10;
            num = num/10;
            
        }
        
        if(num == 0) {
        	return addDigits(sum);
        } else {
        	return addDigits(sum+num);	
        }
        
        
    }

}
