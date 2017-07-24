package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1 ";
		//System.out.println(s.split(" ")[0].length());
		System.out.println(reverseWords(s));
		
		//List<String> list = Arrays.asList(s.split(" "));
		
		//for(String s1: list) System.out.println(s1);
	}
	
	public static String reverseWords(String s) {
		
		if(s==null || s.isEmpty()) return s;
        
        String[] words = s.split(" ");
        List<String> list = new ArrayList<>();
        
        if (words.length ==0) return "";
        
        StringBuffer sb = new StringBuffer();
        for(int i = words.length-1 ; i >=0; i--) {
            if(words[i].length() != 0) {
                list.add(words[i]);
            }
        } 
        System.out.println(list.size());
        for(int i=0;i<list.size();i++) {
            if(i!=list.size()-1) {
            	
                sb.append(list.get(i) + " ");
            } else {
                sb.append(list.get(i));
            }
        }
        return sb.toString();
        
    }

}
