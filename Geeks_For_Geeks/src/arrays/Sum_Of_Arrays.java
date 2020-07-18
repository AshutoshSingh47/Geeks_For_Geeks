package arrays;
import java.util.Scanner;
public class Sum_Of_Arrays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tc,i,j,sizes,sum,l;
		sum=0;l=0;
		System.out.println("Enter Test Cases");
	    tc=sc.nextInt();
	    int s[]=new int[tc];
		while(tc!=0)
		{
			sizes=sc.nextInt();
			int a[]=new int[sizes];
			for(j=0;j<sizes;j++){
				a[j]=sc.nextInt();
			}
			for(int k=0;k<sizes;k++)
			{
				sum=sum+a[k];
				s[l]=sum;
			}
			l++;
			sum=0;
			tc--;
		}
		for(int m:s)
		System.out.println(m);
		

	}

}
