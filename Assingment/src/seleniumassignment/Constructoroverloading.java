package seleniumassignment;

public class Constructoroverloading 
{
	int a;
	int b;
	Constructoroverloading (int a,int b)
	{
		int sum=a+b;
		System.out.println("Addition of two no"+sum);
	}
	Constructoroverloading (int a,int b,int c)
	{
		int x=a+b+c;
		System.out.println("Addition of three no"+x);
	}
	Constructoroverloading (float a,float b,float c)
	{
		float x=a+b+c;
		System.out.println("Addition of three no"+x);
	}
	Constructoroverloading (double a,double b)
	{
		double x=a*b;
		System.out.println("Multiplication of  no " +x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructoroverloading obj=new Constructoroverloading (10.7,78.98);

	}

}
