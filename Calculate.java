package cal;

public class Calculate {

	double pi=3.14;
	double r;
	double a;
	double len;
	double bre;
	double hi;
	double wid;
	
	
	Calculate()
	{
	    r=10;
	     a=pi*r*r;
		
	}
	Calculate(double l,double b)
	{
	        len=l;
	        bre=b;
	        a=l*b;
	}
	Calculate(double l,double h,double w)
	{
		len=l;
		hi=h;
		wid=w;
		a=(2*len*wid)+(2*len*hi)+(2*hi*wid);
	}
	void display()
	{
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		Calculate obj=new Calculate();
		Calculate abc=new Calculate(5,10);
		Calculate xyz=new Calculate(3,5,8);
		obj.display();
		abc.display();
		xyz.display();
				
		
	}
}
