package leetcode;
import java.util.ArrayList;
import java.util.List;

public class Linkedin {
	

	/**
	 * Sample input:
	 *
	 *          1
	 *         / \
	 *        3   5
	 *       /   / \
	 *      2   4   7
	 *     / \   \
	 *    9   6   8
	 
	 *
	 * Expected output:
	 *    1
	 *    3 5
	 *    2 4 7
	 *    9 6 8
	 *    ==========
	 */
	
	 
	  static class Node {
	    int value;
	    Node left;
	    Node right;
	    public Node(int value, Node left, Node right) {
	      this.value = value;
	      this.left = left;
	      this.right = right;
	    }
	  }
	 
	  public void printTree(Node root) {
	    // implementation here
	    List<List<Integer>> list = new ArrayList<>();
	    drecursion(root, 1, list);
	    for(List<Integer> l1 : list) {
	        for(Integer i : l1) {
	            System.out.print(i+" ");
	        }
	        System.out.println();
	    }
	   
	  }
	  
	  public int drecursion(Node node, int height, List<List<Integer>> list) {
	      if(node == null) return height;
	      
	      if(list.get(height) == null) {
	          //list.add(height);
	      }
	      list.get(height).add(node.value);
	     
	      drecursion(node.left,height+1,list);
	      drecursion(node.right, height+1, list);
	   
	      return height;
	  }   
	


}
