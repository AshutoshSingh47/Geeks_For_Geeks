package sorting;

public class Quick_Sort {
	public static void  quicksort(int arr[],int l,int h)
	{
		int pivot=0;
		if(l<h)
		{
		pivot=partition(arr,l,h);
		quicksort(arr,l,pivot-1);
		quicksort(arr,pivot+1,h);
		
		}
		
	}
	public static void printArray(int arr[])
	{
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
	public static void swap(int arr[],int a,int b)
	{
		int temp=0;
		temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	public static int partition(int arr[],int l,int h)
	{
		int pivot=arr[h];
		int i=l-1,j=0;
		for(j=l;j<=h-1;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,h);
		return i+1;
	}
	public static void main(String[] args) 
	{
		int arr[]= {10,7,8,9,1,5};
		System.out.print("Array before sorting : ");
		printArray(arr);
		quicksort(arr, 0,arr.length-1);
		System.out.print("\nArray after sorting : ");
		printArray(arr);
	}

}
