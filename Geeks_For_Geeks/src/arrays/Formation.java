package arrays;

public class Formation {
	public static boolean form(int a[],int N)
	{
		int re=0;
		for(int i=0;i<N;i++)
		{
			re=(re+a[i])%3;
		}
		return (re==0);
		
	}
	public static void main(String[] args) {
		int N=3;
		int arr[]= {40,50,90};
		if(form(arr,N))
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}

}
