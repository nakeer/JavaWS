package leetcode;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = {"ab", "abcd", "abc"};
		int maxLen = 0;
		boolean flag = false;
		//char[][] chArr =
		for(int i=0;i<strArr[0].length();i++) {
			for(int j=1;j<strArr.length;j++) {
				if(strArr[j].length() > i) {
					if (strArr[0].charAt(i) != strArr[j].charAt(i)) {
						maxLen = i;
						flag = true;
					}
				} else {
					flag = true;
					maxLen = i;
					break;
				}
			}
			if(flag) {
				break;
			}
			else if(!flag && i==strArr[0].length()-1) {
				maxLen = i+1;
			}
		}
			
		System.out.println(strArr[0].substring(0, maxLen));

	}

}

//T - O(i*j);
//S - O(1);
