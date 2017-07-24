package Prep;

public class Fib {

	static int[] arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = fibo(5);
		for(int i=0;i<ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
	
	public static int[] fibo(int n) {
		arr = new int[5];
		for(int i=0;i<n;i++) {
			arr[i] = fib(i);
		}
		return arr;
	}
	
	public static int fib(int n) {
		if(n == 0 || n == 1) return n;
		return fib(n-1)+fib(n-2);
	}

}
