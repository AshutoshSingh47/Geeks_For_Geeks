package arrays;

public class Wave_Array {

	public static void convert_to_Wave_Array(int a[],int n)
	{ int n2,temp=0;
	if(n%2==0)
	{
		n2=n;
	}
	else
	{
		 n2=n-1;
	}
		for(int i=0;i<=n2-1;i+=2)
		{
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		int a[]={2,4,7,8,9,10}; 
		int n=a.length;
		convert_to_Wave_Array(a,n);

	}
		

}
