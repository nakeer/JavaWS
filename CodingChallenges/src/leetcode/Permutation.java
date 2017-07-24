package leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3};
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		//list = Arrays.asList(a);
		
		System.out.println(list.subList(3, 3));
		//rec(a,0,0);
	}
	
	public static void rec(List<Integer> list, int fp) {
		
		//if(fp == sp) return;
		System.out.println(list);
		
		for(int i =0;i < list.size();i++) {
			int temp = list.get(i); list.set(i, list.get(i++)); list.set(i++, temp);
			rec(list.subList(i+1, list.size()),i);
			
		}
	}
	
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	
}
