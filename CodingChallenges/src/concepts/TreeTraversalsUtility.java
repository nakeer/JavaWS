package concepts;

import java.util.LinkedList;
import java.util.Queue;

class BinaryTreeNode {
	int value;
	BinaryTreeNode left;
	BinaryTreeNode right;
	public BinaryTreeNode(int val) {
		this.value = val;
	}
 }

public class TreeTraversalsUtility {
	static Queue<BinaryTreeNode> que = new LinkedList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode n1 = new BinaryTreeNode(10);
		BinaryTreeNode n2 = new BinaryTreeNode(20);
		BinaryTreeNode n3 = new BinaryTreeNode(30);
		BinaryTreeNode n4 = new BinaryTreeNode(40);
		BinaryTreeNode n5 = new BinaryTreeNode(50);
		BinaryTreeNode n6 = new BinaryTreeNode(60);
		BinaryTreeNode n7 = new BinaryTreeNode(70);
		
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

	
	public static void BFS(BinaryTreeNode root) {
		if (root== null) return;
		que.add(root);
		while(!que.isEmpty()) {
			BinaryTreeNode node = que.peek();
			System.out.print(node.value+" ");
		
			if(node.left != null) {
				que.add(node.left);
			}
			
			if(node.right != null) {
				que.add(node.right);
			}
			
			que.poll();
			
		}
	}
	
	
	public static void DFS(BinaryTreeNode root) {
		if(root == null) return;
		
		System.out.print(root.value + " ");
		
		DFS(root.left);
		DFS(root.right);
	}
}
