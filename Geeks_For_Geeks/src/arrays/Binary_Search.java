package arrays;
import java.util.Scanner;
class Binary_Search { 
	// Returns index of x if it is present in arr[], 
	// else return -1 
	int binarySearch(int arr[], int x) 
	{ int size;
	size=arr.length;
	System.out.println(size);
		int l = 0, r = size - 1; 
		while (l <= r) { 
			int m = l + (r - l) / 2; 
System.out.println("Middle Element = "+m);
			// Check if x is present at mid 
			if (arr[m] == x) 
				return m; 

			// If x greater, ignore left half 
			if (arr[m] < x) 
				l = m + 1; 

			// If x is smaller, ignore right half 
			else
				r = m - 1; 
		} 

		// if we reach here, then element was 
		// not present 
		return -1; 
	} 

	// Driver method to test above 
	public static void main(String args[]) 
	{ int x;
	Scanner sc=new Scanner(System.in);
		Binary_Search ob = new Binary_Search(); 
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
		int n = arr.length; 
		System.out.println("Enter the element to be searched");
		 x = sc.nextInt(); 
		int result = ob.binarySearch(arr, x); 
		if (result == -1) 
			System.out.println("Element not present"); 
		else
			System.out.println("Element found at "
							+ "index " + result); 
	} 
} 
