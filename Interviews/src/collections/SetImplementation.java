package collections;

import java.util.*;

public class SetImplementation {

	public static void main(String[] args) {
		Collection<Integer> col = new LinkedHashSet<Integer>();
		col.add(1);
		col.add(5);
		col.add(2);
		col.add(1);
		col.add(3);
		
		for (Integer integer : col) {
			System.out.println(integer);
		}

	}

}
