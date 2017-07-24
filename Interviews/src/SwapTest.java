import java.util.PriorityQueue;

public class SwapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,100,45,67};
		System.out.println(findKthWithMinHeap(arr, 2));
	}
	
	public static void swap(int[] arr, int i, int j) {
		System.out.println(arr);
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static int findKthWithMinHeap(int[] arr, int k) {
		PriorityQueue<Integer> pQ = new PriorityQueue<Integer>();
		for(int i : arr) {
			pQ.offer(i);
			
			if(pQ.size() > k) {
				pQ.poll();
			}
		}
		
		return pQ.peek();
	}

}
