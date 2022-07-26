package arrays;

public class Sort_1s_0s_2s {
	public static void sort(int a[],int n)
	{
		int a2[]=new int[3];
		for(int i=0;i<n;i++)
		{
			a2[a[i]]++;
		}
		for(int i=0;i<3;i++)
		{
			System.out.print(a2[i]+" ");
		}
	}
	public static void main(String[] args) {
		int a[]= {0,2,1,2,0,0,1};
		int n=a.length;
		sort(a,n);

	}

}
