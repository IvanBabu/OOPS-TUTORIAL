import java.util.*;
class arraysum
{
	public static void main(String args[])
	{
		int num[]=new int[50];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array:");
		int length=sc.nextInt();
		for(int i=0;i<length;i++)
		{
			num[i]=sc.nextInt();
		}
		System.out.println("Enter elements of array:");
		for(i=0;i<length;i++)
		{
			sum=sum+num[i];
		}
		System.out.println("The sum ="+sum);
		sc.close();
	}
}	
