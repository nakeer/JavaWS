package Prep;

import java.util.HashMap;
import java.util.Map;

public class ASCIIChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=33;i<256 ; i++) {
			char c = (char) i;
			System.out.print(c + " ");
			if( i%10 == 0) System.out.println();
		}
		
		int A = 'A', a = 'a', z = 'z', Z = 'Z';
		System.out.println(A);
		System.out.println(Z);
		System.out.println(a);
		System.out.println(z);
	}
	
	public static void setAsciiNum() {
		Map<Character, Integer> map = new HashMap<>();
		for(int i = 65,j=97; i <90 + 26 && j < 97+26;i++,j++) {
			map.put((char)i, i-64);
			map.put((char)j, j-96);
		}
	}

}
