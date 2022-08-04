package sorting;

public class Merge_Sort {
	static void merge(int arr[],int start,int mid,int end)
	{
		int i=start;
		int j=mid+1;
		int k=0;
		int b[]=new int[end-start+1];
		while(i<=mid&&j<=end)
		{
			if(arr[i]<arr[j])
			{
				b[k]=arr[i];
				i++;
				k++;
			}
			else 
			{
				b[k]=arr[j];
				j++;
				k++;
			}
			//k++;
		}
		while(i<=mid)
		{
			b[k]=arr[i];
			i++;
			k++;
		}
		while(j<=end)
		{
			b[k]=arr[j];
			j++;
			k++;
		}
		k=0;
		for(i=start;i<=end;i++)
		{
			arr[i]=b[k++];
		}
	}
	static void mergeSort(int arr[],int start,int end)
	{
		if(start<end)
		{
			int mid=(start+end)/2;
			mergeSort(arr,start,mid);
			mergeSort(arr,mid+1,end);
			merge(arr,start,mid,end);
		}
	}
	public static void main(String[] args) {
		int arr[]= {10,9,8,7,6,5,4,3,2,1};
		mergeSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
