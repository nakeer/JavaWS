package Euler;
public class FactorialDigitalSum20 {

	public static void main(String[] args) {
		System.out.println(factorial(100));
		
	}
	
	public static double factorial(int n) {
		if (n==1) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
	}

}
