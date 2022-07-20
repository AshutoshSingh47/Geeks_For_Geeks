package recursion;

public class Tail_Recursion_Fibonacci {
	public static int fib(int n,int a,int b)
	{
		if(n==0)
		{
			return a;
		}
		else if(n==1)
		{
			return b;
		}
		return fib(n-1,b,a+b);
	}
	public static void main(String[] args) {
		System.out.println(fib(5,0,1));
	}

}
