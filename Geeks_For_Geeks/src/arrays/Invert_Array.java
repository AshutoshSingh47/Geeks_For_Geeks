package arrays;
import java.util.Scanner;
public class Invert_Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,n;
		int a[]={1,2,3,4,5};
		int size=a.length;
		System.out.println("Enter the limit");
		n=sc.nextInt();
		int b[]=new int[n];
        for(i=0;i<n;i++){
        	b[i]=a[i];
        }
        for(i=0,j=n;i<n+1;i++,j++){
        	a[i]=a[j];
        }
        for(i=0,j=n+1;i<n;i++,j++){
        	a[j]=b[i];
        }
        for(int e:a)
        	System.out.print(e+" ");
     
	}
}

