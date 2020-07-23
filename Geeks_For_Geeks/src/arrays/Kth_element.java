//Program to find Kth element means we have to find the Kth largest element in the array given by user.
//for eg. 1 2 3 6 8 5 4 7 
// user input 3 : It means 3rd largest number in the array.
//That is : 6
//If given user input 4 : That means 4th largest no in the array : That is 5.
package arrays;
import java.util.Scanner;
public class Kth_element {
	public static void main(String[] args) {
		int i,j,size,temp,tc,Kth;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Test Cases");
		tc=sc.nextInt();
		while(tc!=0){
			tc--;
		size=sc.nextInt();
		int a[]=new int[size];
		for(i=0;i<size;i++)
		{a[i]=sc.nextInt();}
		Kth=sc.nextInt();
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
			System.out.println(a[Kth-1]);}

	}

}
