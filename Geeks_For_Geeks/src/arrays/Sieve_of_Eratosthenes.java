package arrays;
import java.util.ArrayList;
public class Sieve_of_Eratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
        int c=0;int N=7507;int k=0;
        list.add(2);
        for(int i=3;i<N;i+=2)
        {c=0;
        	//System.out.println(i+" ");
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
            	list.add(i);
            }
        }
        for(int a:list)
        System.out.print(a+" ");
	}

}
