package Prep;

import java.util.*;

public class CollectionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] iArray = new int[10];
		List<String>[] lArray = new ArrayList[10];
		
		for(int i=0;i<10;i++) {
			lArray[i] = new ArrayList<String>();
			for (int j = 0; j < 10 ; j++) {
				lArray[i].add(String.valueOf(j));
			}
		}
		for(int i = 0 ;i < 10 ; i++)
		System.out.println(lArray[i]);
		
	}
	
	public static Collection<String> getCol() {
		Set<String> set = new HashSet<>();
		
		set.add("Hi");
		return set;
		
	}

}
