package MyQuestions;

import java.util.ArrayList;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,2,3,6};
		System.out.println(removeDups(arr));
	}
	
	public static ArrayList removeDups(int[] arr) {
		int length = arr.length;
		
		ArrayList<Integer> dupsLess = new ArrayList<Integer>();
		
		for (int i=0;i<length;i++){
			if(dupsLess.contains(arr[i])){
				continue;
			}
			else
				dupsLess.add(arr[i]);
		}
		
		return dupsLess;
	}

}
