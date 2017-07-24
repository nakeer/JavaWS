package recursion;

import java.util.Scanner;

/*
 * Sum of natural numbers using Recursion
 */
public class SumNaturalNumbers {

	public static void main(String[] args) throws Exception {
		// To read data from keyboard
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int sum=0;
		
		/*
		 * Basic logic
		 */
		
		for(int i=1;i<=num;i++) {
			sum = sum + i;
		}
		
		System.out.println(sumOfN(num));
		
	}
	
	public static int sumOfN(int n) {
		if (n ==1){
			return 1;
		}
		return sumOfN(n-1) + n;
	}

}
