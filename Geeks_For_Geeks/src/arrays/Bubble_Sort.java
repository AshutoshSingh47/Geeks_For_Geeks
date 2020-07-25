
package arrays;
import java.util.Scanner;
public class Bubble_Sort {

	public static void main(String[] args) {
		int i,j,size,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter elements");
		for(i=0;i<size;i++)
		{a[i]=sc.nextInt();}
		for(i=0;i<size-1;i++)
		{
			for(j=0;j<size-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int e:a)
		{
			System.out.print(e+" ");
		}
			
	}

}
