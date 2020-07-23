//This Problem Rotate Array is based on rotation of some elements as per given index by user.
//for eg. 1 2 4 5 6 7
// we have to rotate first two elements and put at last
// new array = 4 5 6 7 1 2.
package arrays;
import java.util.Scanner;
public class Rotate_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,n,size,tc;
		System.out.println("Enter the test cases");
		tc=sc.nextInt();
		while(tc!=0){
			tc--;
		size=sc.nextInt();
		int a[]=new int[size];
		n=sc.nextInt();
		int b[]=new int[n];
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0,j=0;i<n;i++,j++)
		{
			b[j]=a[i];
		}
		for(i=0,j=n;i<size-n;i++,j++)
		{
			a[i]=a[j];
		}
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

}
