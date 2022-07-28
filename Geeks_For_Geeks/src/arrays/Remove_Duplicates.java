package arrays;

public class Remove_Duplicates {
	public static void remove_duplicate(int A[],int N){
        // code here
        int B[]=new int[A[N-1]+1];
        System.out.println(A[N-1]+" "+B.length);
        int count=0;
        if(N==1)
        {
           System.out.println();
        }
        for(int i=0;i<N;i++)
        {
            B[A[i]]++;
        }        
        for(int i=0;i<B.length;i++)
        {
            if(B[i]>=1)
            count++;
        }
        System.out.println(count);
     
    }
	public static void main(String[] args) {
		int arr[]={1,1 ,2 ,2 ,20, 21, 22, 23, 24, 25 };
		remove_duplicate(arr,arr.length);
	}

}
