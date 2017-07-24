package leetcode;
class ListNode {
	int val;
    ListNode next;
    ListNode(int x) 
    { 	
    	val = x; 
    }
}

public class AddTwoNumbers2 {
	
	ListNode start;

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(5);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(2);
		l2.next.next = new ListNode(3);
		
		System.out.println(addListNodes(l1, l2));
	}

	public static int addListNodes(ListNode l1, ListNode l2) {
		
		int sum  = 0;
		ListNode current = l1;
		while(current.next !=null){
			sum += current.val;
			current = current.next;
			
		}
		System.out.println(sum);
		return l1.val + l2.val;
	}

}
