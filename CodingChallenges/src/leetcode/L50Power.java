package leetcode;

public class L50Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(9/4);
		System.out.println(myPow(1.00001, 123456));
		System.out.println(myPow(0.00001, 2147483647));
	}

	public static double myPow(double x, int n) {
		if(n==1) return x;
        //return n>0 ? x*myPow(x, n-1) : (1/x)*myPow(x,n+1);
		
//		if(n > 1000 && n%2 ==0 ) return (x*myPow(x, (n-1)/2)) * (x*myPow(x, (n-1)/2));
//        if(n > 1000 && n%2 ==1 ) return (x*myPow(x, (n-1)/2)) * (x*myPow(x, (n-1)/2 - 1));
		
		if(n > 1000 && n%4 ==0 ) return (x*myPow(x, (n-1)/4)) * (x*myPow(x, (n-1)/4)) * (x*myPow(x, (n-1)/4)) * (x*myPow(x, (n-1)/4));
		
		
		
		//if(n > 1000 && n%4 ==1 ) return (x*myPow(x, (n-1)/4)) * (x*myPow(x, (n-1)/4)) * (x*myPow(x, (n-1)/4)) * (x*myPow(x, (n-1)/4));
        //if(n > 1000 && n%2 ==1 ) return (x*myPow(x, (n-1)/2)) * (x*myPow(x, (n-1)/2 - 1));
		
//		if(n > 1000 && n%2 ==0 ) return (x*myPow(x, n/2 - 1)) * (x*myPow(x, n/2 - 1));
//        if(n > 1000 && n%2 ==1 ) return (x*myPow(x, n/2 - 1)) * (x*myPow(x, n/2 + 1));
//      
		
//		
//		if(n > 1000 && n%4 ==0 ) return (x*myPow(x, n/4-1)) * (x*myPow(x, n/4-1)) * (x*myPow(x, n/4-1)) * (x*myPow(x, n/4-1));
//        if(n > 1000 && n%4 ==1 ) return (x*myPow(x, n/4-1)) * (x*myPow(x, n/4-1)) * (x*myPow(x, n/4-1)) * (x*myPow(x, n/4+1));
//        if(n > 1000 && n%4 ==2 ) return (x*myPow(x, n/4-1)) * (x*myPow(x, n/4-1)) * (x*myPow(x, n/4+1)) * (x*myPow(x, n/4+1));
//        if(n > 1000 && n%4 ==3 ) return (x*myPow(x, n/4-1)) * (x*myPow(x, n/4+1)) * (x*myPow(x, n/4+1)) * (x*myPow(x, n/4+1));
        
		
		return  x*myPow(x, n-1) ;
    }
}
