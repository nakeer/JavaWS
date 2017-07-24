import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Set<String> list = new HashSet<>();
		list.add("shilpa");
		list.add("shilpa");
		list.add("Keerthy");
		
		Iterator<String> li = list.iterator();
		while(li.hasNext()) {
			System.out.println(li.next().hashCode());
		}
		

	}

}
