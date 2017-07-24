package cci.trees;
import java.util.*;

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return String.valueOf(data) + " -> ";
	}
}

class BinaryTrees {
	
	public void inOrderTraversal(TreeNode root) {
		if(root == null) {
			return;
		}
		inOrderTraversal(root.left);
		System.out.print(root);
		inOrderTraversal(root.right);
	}
	
	public void preOrderTraversal(TreeNode root) {
		if(root == null) {
			return;
		}
		visitNode(root);
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}

	public void portOrderTraversal(TreeNode root) {
		if(root == null) {
			return;
		}
		portOrderTraversal(root.left);
		portOrderTraversal(root.right);
		visitNode(root);
	}
	
	public void visitNode(TreeNode node) {
		System.out.print(node);
	}
	
	public void DFS(TreeNode node) {
		
		if(node == null) return;
		
		DFS(node.left);
		visitNode(node);
		DFS(node.right);
		
	}
	
	public void BFS(TreeNode node) {
		Queue<TreeNode> queue = new LinkedList<>();
		if(node == null) return;
		else {
			queue.add(node);
		}
		while(!queue.isEmpty()) {
			TreeNode current = queue.peek();
			if(current.left!=null)
				queue.add(current.left);
			if(current.right!=null)
				queue.add(current.right);
			visitNode(queue.poll());;
		}
	}
}

public class BinaryTreeTraversal {
	
	public static BinaryTrees binaryTrees = new BinaryTrees();
	public static void main(String args[]) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		
		System.out.print(" INORDER: ");
		binaryTrees.inOrderTraversal(root);
		System.out.print("\n PRE = ORDER: ");
		binaryTrees.preOrderTraversal(root);
		System.out.print("\n POST - ORDER: ");
		binaryTrees.portOrderTraversal(root);
		
		System.out.print("\n DFS: ");
		binaryTrees.DFS(root);
		
		System.out.print("\n BFS: ");
		binaryTrees.BFS(root);
		
	}
}
