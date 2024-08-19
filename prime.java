import java.util.*;
class prime
{
	public static void main (String args[])
	{
		int i,n,j,s;
		int p[]=new int[50];
		Scanner s1=new Scaner(System.in);
		System.out.println("Enter the limit");
		n=s1.nextInt();
		for(i=2;i<n;i++)
		{
			for(j=2;j<n;j++)
			{
				if(i%j==0)
				{
					s=1;
					break;
				}
				else
				{
					s=0;
					continue;
				}
			if(s==0)
			{
				p[i]=i;
			}
		}
		System.out.println("the prime number upto "+n+":");
		for(i=2;i<n;i++)
		{
			if(p[i]!=i;
		}	
	}
}
