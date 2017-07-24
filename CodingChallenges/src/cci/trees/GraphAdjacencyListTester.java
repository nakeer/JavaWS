package cci.trees;

class GraphTreeNode {
	int data;
	GraphTreeNode[] children;
	boolean isNodeVisited;
	
	public boolean isNodeVisited() {
		return isNodeVisited;
	}

	public void setNodeVisited(boolean isNodeVisited) {
		this.isNodeVisited = isNodeVisited;
	}

	public GraphTreeNode(int data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return String.valueOf(data);
	}
	
	
}

class Graph{
	public GraphTreeNode[] nodes;
}

public class GraphAdjacencyListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphTreeNode root = new GraphTreeNode(1);
		root.children = new GraphTreeNode[3];
		
		root.children[0] = new GraphTreeNode(2);
		root.children[1] = new GraphTreeNode(3);
		root.children[2] = new GraphTreeNode(4);
		
		root.children[2].children = new GraphTreeNode[3];
		
		root.children[2].children[0] = new GraphTreeNode(5);
		root.children[2].children[1] = new GraphTreeNode(6);
		root.children[2].children[2] = new GraphTreeNode(7);
		
		
		
	}

}
