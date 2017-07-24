package concepts;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Node {
     int data;
     Node next;
     public Node(int data) {
    	 this.data = data;
     }
     
     @Override
     public String toString(){
		return this.data+" -> " + next;
    	 
     }
}

public class LinkedListUtility {

	public static Node reverseNode;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		n1.next = n2; n2.next = n3; n3.next = n4;
		//printList(n1);
		//System.out.println();
		//reversePrint(n1);
		//System.out.println();
		System.out.println(reverseLinkedList(n1));
		
		Node m1 = new Node(15);
		Node m2 = new Node(25);
		Node m3 = new Node(35);
		Node m4 = new Node(25);
		Node m5 = new Node(55);
		m1.next = m2; m2.next = m3; m3.next = m4; m4.next = m5;
		
		//printList(mergeList(n1, m1));
		//System.out.println(reverseNodeNumberPrint(n1,0));
		
		System.out.println(removeDuplicates(m1));
		
		Node c1 = new Node(1);
		Node c2 = new Node(2);
		Node c3 = new Node(3);
		Node c4 = new Node(4);
		Node c5 = new Node(5);
		
		c1.next = c2; c2.next = c3; c3.next = c4; c4.next = c2;
		//System.out.println(isaCyclicLinkedList(c1));
	}
	
	public static Node mergeList(Node h1, Node h2) {
		if(h1 == null && h2 == null)return null;
		else if(h1 == null) return h2;
		else if(h2 == null) return h1;
		
		if(h1.data <= h2.data) {
			h1.next = mergeList(h1.next, h2);
			return h1;
		} else {
			h2.next = mergeList(h1, h2.next);
			return h2;
		} 
	}

	
	public static Node reverseLinkedList(Node head) {
		if(head.next == null) return head;
		Node revNode = reverseLinkedList(head.next);
		//System.out.println(("returned: " + head.data));
		head.next.next = head;
		head.next = null;
		return revNode;
	}
	

	public static void reversePrint(Node head) {
		if(head == null);
		else {
			reversePrint(head.next);
			System.out.print(head.data + " <-");
		}
	}
	
	public static int reverseNodeNumberPrint(Node head, int n) {
		 int counter = 0;
		 Map<Integer,Integer> map = new HashMap<>();
		 while(head != null) {
			 map.put(counter, head.data);   
			 head = head.next;
		     counter++;
		 }
		 return map.get(counter-n-1);
	}
	
	public static Node removeDuplicates(Node head) {
		if(head == null) return head;
		Set<Integer> set = new HashSet<>();
	    head.next = removeDuplicates(head.next);
	    if(set.contains(head.data)){
	        head= head.next;
	    } else {
	        set.add(head.data);
	    }  return head;
	    
	}
	
	
	public static boolean isaCyclicLinkedList(Node head) {
		
		if(head == null || head.next == null) return false;
		Node runner = head;
		Node walker = head;
		
		while(runner != null || walker != null) {
			runner = runner.next.next;
			walker = walker.next;
			System.out.println("Runner : " + runner.data+ ", Walker : "+ walker.data);
			if(runner == walker) return true;
		}
		return false;
	}
	
	
}
