package string;
import java.util.Scanner;


public class String_Rev {

	public static void reverse(char[]str,int start,int end) {
		char temp;
		while(start<=end)
		{
		    temp=str[start];
			str[start]=str[end];
			str[end]=temp;
			start++;
			end--;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String nam="";
		
		System.out.print("Enter String : ");
		nam=sc.nextLine();
		nam=nam+" ";
		char str[]=nam.toCharArray();
		int start=0;
		for(int end=0;end<str.length;end++) {
			
			if(str[end]==' ')
			{
				reverse(str,start,end);
				start=end+1;
			}
		}
		// Reverse the whole string.
		reverse(str,0,str.length-1);
		System.out.print(str);
		
	}

}
