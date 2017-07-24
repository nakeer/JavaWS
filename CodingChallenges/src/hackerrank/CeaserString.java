package hackerrank;
import java.util.HashMap;
import java.util.Map;

public class CeaserString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		String capsAlphabets = alphabets.toUpperCase();
		
		Map<Character, Integer> map = new HashMap<>();
		for(int i = 0 ;i < alphabets.length(); i++) {
			map.put(alphabets.charAt(i), i);
		}
		
		Map<Character, Integer> umap = new HashMap<>();
		for(int i = 0 ;i < capsAlphabets.length(); i++) {
			umap.put(capsAlphabets.charAt(i), i);
		}
		
		int moveby = 2;
		
		//System.out.println(alphabets.charAt(25%26));
		//System.out.println(alphabets.charAt((map.get('z')+moveby)%26));
		String input = "middled-Outz";
		
		StringBuffer sb = new StringBuffer();
		for(int i =0 ;i < input.length(); i++) {
			if (umap.containsKey(input.charAt(i))) {
				sb.append(capsAlphabets.charAt((umap.get(input.charAt(i))+moveby)%26));
				
			} else if(map.containsKey(input.charAt(i))) {
				//input = input.replace(input.charAt(i), alphabets.charAt((map.get(input.charAt(i))+moveby)%26));
				sb.append(alphabets.charAt((map.get(input.charAt(i))+moveby)%26));
				//System.out.println(sb.toString());
				
			} else sb.append(input.charAt(i));
		}
		//System.out.println(sb.toString());
		//System.out.println(input);
		
//		System.out.println('a'%128);
//		System.out.println((char)97);
		
		//String input = "Shilpa";
		StringBuffer newSb = new StringBuffer();
		for(int i =0;i<input.length();i++) {
			if(input.charAt(i)%127 > 96 && input.charAt(i)%127 < 123) {
				newSb.append((char) ((char)input.charAt(i)%97));
			}
		}
		
		System.out.println(newSb.toString());
		
		
		
		
	}
	
	

}
