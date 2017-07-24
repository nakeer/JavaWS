package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ExcelColumns {
	
	Map<Character, Integer> map;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcelColumns e = new ExcelColumns();
		System.out.println(e.titleToNumber("AAA"));
	}
	
	
    public int titleToNumber(String s) {
        charMapper();
        int N = s.length();
        int value = 0;
        if (s.isEmpty()) return 0;
        for(int i = 0; i < N; i++) {
        	int pw = pow(26,i);
        	System.out.println(pw);
            value = value + getCharValue(s.charAt(N-1-i)) * pw;
            
        }
        return value;
    }
    
    public int getCharValue(char c) {
        return map.get(c);
    }
    
    public int pow(int i, int j) {
    	System.out.println("Power of : " + i + " j : " + j);
        if(j==0) {
            return 1;
        }
        return i * pow(i, j-1);
    }
    
    public void charMapper() {
    	
        map = new HashMap<>();
		for(int i = 65,j=97; i <90 + 26 && j < 97+26;i++,j++) {
			map.put((char)i, i-64);
			map.put((char)j, j-96);
		}
    }

}
