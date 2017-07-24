package Prep;

import java.util.*;

public class SampleTest {

	public static void main(String args[]) {
		//System.out.println(Integer.MAX_VALUE);
		int[] a1 = {1,3};
		test(a1);
		test(new int[]{1,4});
	}
	
	public static void test(int[] arr) {
		System.out.println(arr[0] + " " + arr[1]);
	}
	
	public static List<String> fizzBuzz(int n) {
        if (n < 1) return null;
        List<String> list = new ArrayList<>();
        for(int i = 1; i<= n ; i ++) {
            if (n % 15 == 0) {
                list.add("FizzBuzz");
            } else if ( n % 5 == 0) {
                list.add("Buzz");
            } else if ( n % 3 == 0) {
            	System.out.println(n + " is ");
                list.add("Fizz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
	
	public static int hammingDistance(int x, int y) {
        int num = x ^ y, count = 0;
        if (num == 0 || num == 1) return num; 
        System.out.println("Before: " + num);
        while (num > 0) {
            if( (num & 1) != num ) 
                count++;
            num = num >> 1;
            System.out.println("shift : "+num);
        }
        return count;
    }
}
