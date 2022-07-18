package searching;

import java.util.Arrays;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,9,8,7,6,5,4,3,2,1};
		int num=1;
		Arrays.sort(arr);
		int low=0,high=arr.length-1,mid=0;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(num==arr[mid]) {
				System.out.print(mid+1);
				break;
			}
			else if(num>arr[mid])
			{
				low=mid+1;				
			}
			else
			{
				high=mid-1;
			}
		}

	}

}
