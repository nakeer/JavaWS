import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListAddition {
	
	
	
	public static void add(LinkedList l1, LinkedList l2) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		int i = (l1.size() >= l2.size() ? l1.size():l2.size());
		while(i > 0){ 
			ll.add((Integer) l1.get(i-1) + (Integer)l2.get(i-1));
			i--;
		}
		Iterator<Integer> il = ll.iterator(); 
		while(il.hasNext()){
			System.out.println(il.next());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(3);l1.add(4);l1.add(2);
		
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l2.add(4);l2.add(6);l2.add(5);
		
		add(l1,l2);
	}

}
