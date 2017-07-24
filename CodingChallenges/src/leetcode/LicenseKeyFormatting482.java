package leetcode;

public class LicenseKeyFormatting482 {

	public static String licenseKeyFormatting(String S, int K) {
        StringBuffer sb = new StringBuffer();
        char[] ch;
        int counter = 0;
        for(int i = S.length()-1; i >= 0 ;i--) {
        	if(counter < K) {
        		if(S.charAt(i) != '-') {
        			//System.out.println("add: " + S.charAt(i));
        			sb.append(S.charAt(i));
        			counter++;
        		}
        	} else if (counter == K) {
        		sb.append("-");
        		counter = 0;
        		i++;
        	} 
        }
        StringBuffer sb1 = new StringBuffer();
        for(int i=sb.length()-1; i >= 0 ; i--) {
        	sb1.append(sb.charAt(i));
        }
        return (sb1.toString().toUpperCase());
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(licenseKeyFormatting("2-4A0r7-4k", 4));
		System.out.println(licenseKeyFormatting("2-4A0r7-4k", 3).toUpperCase());
		
		//licenseKeyFormatting1("2-4A0r7-4k", 3);
	}

}
