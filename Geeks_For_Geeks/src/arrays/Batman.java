package arrays;
//Question is fighting the darkness : #Batman. 
public class Batman {
static int Fight_the_dark(int arr[],int n)
{
	int i,max=0;
	max=arr[0];
	for(i=1;i<n;)
	{ 
		if(arr[i]>=max){
			max=arr[i++];
			}
		
		else 
		{
			i++;		
		}
		
	}
	return max;
		
}

	public static void main(String[] args) {
		
int arr[]={8,7,5,4};
int n=arr.length;
System.out.print(Fight_the_dark(arr, n));

	}

}
