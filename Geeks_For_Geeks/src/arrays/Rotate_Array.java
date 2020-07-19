package arrays;
import java.util.Scanner;
public class Rotate_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,n,size;
		int a[]={7,2,2,2,0};
		size=a.length;
		System.out.println(size);
		System.out.println("Enter the Limit");
		n=sc.nextInt();
		int b[]=new int[n];
		for(i=0,j=0;i<n;i++,j++)
		{
			b[j]=a[i];
		}
		for(int e:b){
			System.out.print(e+" ");}
		System.out.println();
		for(i=0,j=n;i<size-n;i++,j++)
		{
			a[i]=a[j];
		}
		for(int e:a)
		{
			System.out.print(e+" ");
		}
		System.out.println();
		for(i=size-n,j=0;i<size;i++,j++)
		{
			a[i]=b[j];
		}
for(int e:a)
{
	System.out.print(e+" ");
}
	}

}
