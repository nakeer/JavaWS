package leetcode;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	int val;
	Node left;
	Node right;
	public Node(int val) {
		this.val = val;
	}
}

public class BFS {
	
	static Queue<Node> que = new LinkedList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		Node n5 = new Node(50);
		Node n6 = new Node(60);
		Node n7 = new Node(70);
		
		n1.left = n2;
		n1.right = n3;
		
		n2.left = n4;
		n2.right= n5;
		
		n3.left = n6;
		n3.right = n7;
		
		BFS(n1);
		System.out.println();
		DFS(n1);
		
	}

	
	public static void BFS(Node root) {
		if (root== null) return;
		que.add(root);
		while(!que.isEmpty()) {
			Node node = que.peek();
			System.out.print(node.val+" ");
		
			if(node.left != null) {
				que.add(node.left);
			}
			
			if(node.right != null) {
				que.add(node.right);
			}
			
			que.poll();
			
		}
	}
	
	
	public static void DFS(Node root) {
		if(root == null) return;
		
		System.out.print(root.val + " ");
		
		DFS(root.left);
		DFS(root.right);
	}
}
