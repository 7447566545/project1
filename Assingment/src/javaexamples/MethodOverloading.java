package javaexamples;

public class MethodOverloading {
	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
	obj.add(10.30,30.60);
	obj.add(10,20,30);
	obj.add(40.10f,50.70f);
	obj.add(70,80);
	}

	void add(int x,int y, int z)
	{
	int sum=x+y+z;
	System.out.println("Addition of three no."+sum);
}
	void add(float i,float j)
	{
		float sub=i-j;
		System.out.println("Substraction of two no."+sub);
	}
	void add(double a,double b)
	{
		double mul=a*b;
		 System.out.println("Multiplication of two no."+mul);
	}
	void add(int j,int k)
	{
	int div=j/k;
	System.out.println("Division of two no."+div);
	
	}
}
	
