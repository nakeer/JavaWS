package MyQuestions;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>(5);

	      // add some values in the map
	      map.put("One", 1);
	      map.put("Two", 2);
	      map.put("Three", 3);


	      System.out.println(map);

	      // clear the map
	      map.clear();


	      System.out.println(map);
	}

}
