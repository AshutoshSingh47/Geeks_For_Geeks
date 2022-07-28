package arrays;

public class Remove_Duplicates {
	public static int remove_duplicate(int A[],int N){
        // code here
		int j=0;
		for(int i=0;i<N;i++)
		{
			if(A[j]!=A[i])
			{
				j++;
				A[j]=A[i];
			}
		}
		return j+1;
     
    }
	public static void main(String[] args) {
		int arr[]={1,1 ,2 ,2 ,3,3,4,5,6,7 };
		int size=remove_duplicate(arr,arr.length);
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
