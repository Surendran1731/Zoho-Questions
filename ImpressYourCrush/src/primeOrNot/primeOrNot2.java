package primeOrNot;

public class primeOrNot2 
{
	public static void main(String[] args) 
	{
		int n=11,count=0;
		
		for(int i=1;i*i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		
		if(count==1)
		{
			System.out.println("Prime");
		}
		else
			System.out.println("Not a prime");
	}
}
//O(root n)