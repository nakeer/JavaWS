package leetcode;

public class LongestAbsoluteFilePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
		System.out.println(lengthLongestPath(str));
	}
	
	public static int lengthLongestPath(String input) {
        String[] arr = input.split("\n");
        if(arr.length == 0 || arr.length == 1) return arr.length;
        int[] stack = new int[arr.length+1];
        int maxLen = 0;
        for(String s : arr) {
            int level = s.lastIndexOf("\t") + 1;
            int currentLength = stack[level+1] =  stack[level] + s.length() - level + 1;
            if(s.contains(".")) {
                maxLen = Math.max(maxLen, currentLength-1);
            }
        }
        for(int i : stack) System.out.println(i);
        return maxLen;
    }

}
