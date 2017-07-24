package companies;

import java.util.*;

class Comment {

	public int id;
	public String value;
	public Integer parent;

	public Comment(int id, String value, Integer parent) {
		this.id = id;
		this.value = value;
		this.parent = parent;
	}
	
}

class Graph {
	List<Comment>[] list;
	
	public Graph(int totalNodes) {
		list = new LinkedList[totalNodes];
	}
	
}


/*
 * { "id": 1, value: "This is a string" }
 * { "id": 2, value: "This is a child comment", parent: 1 }
 * { "id": 3, value: "New thread" }
 * { "id": 4, value: "Grandchild", parent: 2 }
 * { "id": 5, value: "new thread child", parent: 3 }
 
 * This is a string
   * This is a child comment
     * Grandchild
 * New thread
   * new thread child

*/
 
public class CreditKarma {
	public static Graph graph;
	public static void main(String[] args) {
		List<Comment> comments = new ArrayList<Comment>();
		comments.add(new Comment(1, "This is a string", null));
		comments.add(new Comment(2, "This is a child", 1));
		comments.add(new Comment(10, "This is a child", 1));
		comments.add(new Comment(3, "This is a new thread", null));
		comments.add(new Comment(4, "Grandchild", 1));
		comments.add(new Comment(5, "new thread child", 3));
		comments.add(new Comment(6, "another child", 1));
		
		printComments(comments);
	}

	public static void printComments(List<Comment> comments) {
		graph = new Graph(comments.size());
	}
}
