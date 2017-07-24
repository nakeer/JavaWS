
import java.util.*;

public class WorkSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String org = "https://okta.okta.com";
		String subdomain = "okta";
		
		System.out.println(org.replaceFirst(subdomain, subdomain+"-admin"));
		
		
	}
	
	
	public static boolean BS(int[] arr, int min, int max, int search) {
		if(max < min) {
			
			return false;
		}
		int mid = min + (max-min) / 2;
		
		if(search == arr[mid]) {
			return true;
		} else if (search < arr[mid]) {
			 return  BS(arr, min, mid-1, search);
		} else {
			//System.out.println("mid"+ mid);
			return BS(arr, mid+1, max, search);
		}
		
	}
	
	public static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r>=l)
        {
            int mid = l + (r - l)/2;
 
            // If the element is present at the middle itself
            if (arr[mid] == x)
               return mid;
 
            // If element is smaller than mid, then it can only
            // be present in left subarray
            if (arr[mid] > x)
               return binarySearch(arr, l, mid-1, x);
 
            // Else the element can only be present in right
            // subarray
            return binarySearch(arr, mid+1, r, x);
        }
 
        // We reach here when element is not present in array
        return -1;
    }

}
