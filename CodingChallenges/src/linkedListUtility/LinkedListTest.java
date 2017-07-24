package linkedListUtility;

import java.util.HashSet;
import java.util.Set;

class Node {
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	public String toString() {
		return this.data + " -> " + next;
	}
}

class LinkedList{
	public Node head;
	public LinkedList() {
		head = null;
	}
	
	private void addHead(int data) {
			head = new Node(data);
	}
	
	public void addNode(int data) {
		if(head == null) addHead(data);
		else {
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = new Node(data);
		}
		
	}
	
	public boolean findNode(int data) {
		if(head == null) return false;
		Node current = head;
		
		while(current != null) {
			if(current.data == data) {
				return true;
			}
			current = current.next;
		}
		return false;
		
	}
	
	public boolean deleteNode(int data) {
		if(head == null) return false;
		
		if(head.data == data) {
			head = head.next;
			return true;
		}
		Node current = head.next;
		Node prev = head;
		
		while(current != null) {
			if(current.data == data) {
				prev.next = current.next;
				return true;
			}
			prev = current;
			current = current.next;
		}
		return false;
	}
	
	public void displayLinkedList() {
		displayLinkedList(head);
	}
	
	public void displayLinkedList(Node node) {
		if(node != null) {
			System.out.println(node);
		}
	}
	
	public void reverseLinkedList() {
		Node rev = this.reverseLinkedList(head);
		this.displayLinkedList(rev);
	}
	
	private Node reverseLinkedList(Node node) {
		if(node.next == null) return node;
		Node newNode = reverseLinkedList(node.next);
		node.next.next = node;
		node.next = null;
		return newNode;
	}
	
	public void removeDuplicates() {
		if(head == null) return;
		Node slow = head, fast = head;
		
		Set<Integer> set = new HashSet<>();
		set.add(fast.data);
		fast = fast.next;
		
		while(fast != null) {
			if(set.contains(fast.data)) {
				fast = fast.next;
				slow.next = fast;
			} else {
				set.add(fast.data);
				slow = fast;
				fast = fast.next;	
			}
		}
	}
	
	private Node getNodeAtPosition(int pos) {
		Node current = head; 
		for(int i =0 ;i < pos; i++) {
			if(current!=null) {
				current = current.next;
			}
		}
		
		return current;
	}
	
	public void kthToLastNode(int k) {
		Node current =  head;
		int counter =0 ;
		
		while(current != null) {
			current = current.next;
			counter++;
		}
		
		System.out.println(" Value at "+k+"th : " + getNodeAtPosition(counter - k).data);
		
	}
	
}

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addNode(10);
		ll.addNode(20);
		ll.addNode(30);
		ll.addNode(30);
		ll.addNode(40);
		
		System.out.print("Actual Linked list: ");
		ll.displayLinkedList();
		
		System.out.println("Found the Node with data : "+ ll.findNode(40));
		ll.displayLinkedList();
		
		ll.deleteNode(0);
		ll.displayLinkedList();
		
		//ll.reverseLinkedList();
		
		ll.addNode(30);
		ll.displayLinkedList();
		
		ll.removeDuplicates();
		ll.displayLinkedList();
		
		ll.kthToLastNode(3);
	}

}
