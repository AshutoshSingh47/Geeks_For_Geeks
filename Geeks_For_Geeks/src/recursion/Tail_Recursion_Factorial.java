package recursion;

public class Tail_Recursion_Factorial {
	public static int fact(int n,int a)
	{
		if(n==0)
		{
			return a;
		}
		return fact(n-1,n*a);
	}
	public static void main(String[] args) {
		System.out.println(fact(4,1));
	}

}
