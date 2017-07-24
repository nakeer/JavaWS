package hackerrank;

public class HackerRankInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String solutionString = "hackerrank";
        
        String s = "hereiamstackerrank";
		//String s = "knarrekcah";
        if(s.length() < solutionString.length()) {
            System.out.println("NO");
            System.exit(0);;
        }
        boolean flag = false;            
        for(int i=0, k=0;i<solutionString.length();i++) {

            for(int j=k;j <s.length();j++) {
                if(solutionString.charAt(i) == s.charAt(j)) {
                	System.out.println("location of "+s.charAt(j) + ":" + j);
                    flag = true;
                    k = j+1;
                    break;
                }
                if(j== s.length()-1 ) {
                	System.out.println("Reached here");
                    flag = false;
                    break;
                }
            }
            if(!flag) break;
            
        }
        if(flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
    }


}
