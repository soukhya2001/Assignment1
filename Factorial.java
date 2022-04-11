package cal;

public class Factorial {
	void fact(int n)
	{
		int factorial=1;
		for(int i=1;i<=n;i++)
		{
			factorial*=i;
		}
		System.out.println(factorial);
	}
	void  perfect(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			sum=sum+i;
		}
		if(sum==n)
		{
			fact(sum);
		}
		else
		{
			System.out.println(" The Number is not a perfect number");
			
		}
	}
	public static void main(String[] args)
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int a=sc.nextInt();
		Factorial obj=new Factorial();
		obj.perfect(a);
		
		
	}

}