package cal;

public class Summation {
	
public static void main(String[] args)
{
	java.util.Scanner sc=new java.util.Scanner(System.in);
	 int a=sc.nextInt();
	 int sum=0;
	 while(a>0)
	 {
		 int rem=a%10;
		 sum=sum+rem;
		 a/=10;
	 }
	 System.out.println(sum);
	
	
}
}
