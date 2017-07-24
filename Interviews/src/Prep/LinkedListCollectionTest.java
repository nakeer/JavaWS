package Prep;

import java.util.LinkedList;
class Person {
	
	private int age;
	public Person(){
		System.out.println("Created as part of Node construction");
	}
	
	public Person(int age, String name){
		this.setAge(age);
		this.setName(name);
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	
	
	
	
}
public class LinkedListCollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person(28,"Shilpa");
		Person p2 = new Person(30,"Keerthy");
		Person p3 = new Person(1,"Buddu");
		
		LinkedList list = new LinkedList();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		System.out.println(((Person)list.get(0)).getAge());
		
	}

}

class LLNode {
	public LLNode() {
		Person person = new Person();
		LLNode next = null;
	}
	
	public void addNode() {
		
	}
}

class Node {
	
	private Node next;
	private Object obj;
	
	public Node(Object obj){
		next = null;
		obj = obj; 
	}
	
	public Node(Object obj, Node next) {
		next = next;
		obj = obj;
	}
	
	
}

class LL {
	private Node head;
	
}
