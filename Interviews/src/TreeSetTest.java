import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfStrings = in.nextInt();
 
        Map<String,Integer> arrayStrings = new HashMap<String,Integer>();
        for(int i = 0; i < numOfStrings; i++) {
        	String current = in.next();
            arrayStrings.put(current, arrayStrings.containsKey(current) ? arrayStrings.get(current)+1:1);
        }
        
        int numOfComps = in.nextInt();
        String[] comps = new String[numOfComps];
        for(int i = 0; i < numOfComps; i++) {
            comps[i] = in.next();
        }
        
        for(int i=0;i<numOfComps; i++) {
        	if(arrayStrings.containsKey(comps[i])){
            	System.out.println(arrayStrings.get(comps[i]));
            }
            else {
            	System.out.println("0");
            }
        }
        
    }
	

}
