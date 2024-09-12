package sqrt;

public class sqrt2 
{
	public static void main(String[] args) 
	{
		int n = 40;
		double val = 0;
		double precision=1;
		
		for(int i=1;i<=4;i++)
		{
			while(val*val<=n)
			{
				val+=precision;
			}
			val-=precision;
			precision/=10;
		}
		
		System.out.println(val);
	}
} // TC - somewhere around O(root n)
