package cci.string;
import java.util.*;

public class Pract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character, Integer> map = new HashMap<>();
		Set<String> set = new HashSet<>();
		//Nanduri sri sesha goda seeta shilpa
		set.add("Shilpa");
		set.add("Sri");
		set.add("Sesha");
		
		Iterator<Integer> iterator = map.values().iterator();
		
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
