package sorting;
public class Bubble_Sort {
public int[]bubble_sort(int arr[])
{
	int temp=0;
	if(arr.length==1)
	{
		return arr;
	}
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			temp=0;
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	return arr;
	
}
	public static void main(String[] args) {
		int arr[]= {10,9,8,7,6,5,4,3,2,1};
		Bubble_Sort sort=new Bubble_Sort();
		sort.bubble_sort(arr);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
	}

}
