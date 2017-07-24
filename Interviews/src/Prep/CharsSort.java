package Prep;

import java.util.Arrays;
import java.util.PriorityQueue;

public class CharsSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(10);
		queue.add(5);
		queue.add(50);
		queue.add(15);
		
		Integer head = queue.poll();
	      
	      System.out.println ( "Head of the queue is: "+ head);
	      
	      System.out.println(queue);
	}

}
