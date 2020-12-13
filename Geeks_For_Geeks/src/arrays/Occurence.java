package arrays;

public class Occurence {

	static int count(int arr[],int n,int x)
	{
		int i,c=0;
		for(i=0;i<n;i++)
		{
			if(arr[i]==x){
				c++;}
		}
		if(c>0)
		return c;
		else
		return 0;
	}
	public static void main(String[] args) {
		int arr[]={1,1,1,2,2,3,3,3,3,3};
		int size=arr.length;
		int x=4;
		System.out.println(count(arr,size,x));

	}

}
