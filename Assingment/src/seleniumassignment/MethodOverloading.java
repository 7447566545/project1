package seleniumassignment;

public class MethodOverloading 
{
	int a;
	int b;
	
void Addition(int a,int b)
{
	int sum=a+b;
	System.out.println("Addition of two number"+sum);
}
void Addition(int a,int b,int c)
{
	int x=a+b+c;
	System.out.println("Addition of three no is :"+x);
}
void Addition(double a,double b)
{
	double mul=a*b;
	System.out.println("Multiplication of two no is :"+mul);
}
void Addition(float a,float b)
{
	float sub=a-b;
	System.out.println("Substraction of two no is :"+sub);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj=new MethodOverloading ();
		//obj.Addition(10,20);
	//	obj.Addition(10,20,30);
		//obj.Addition(0.5,0.0);
		obj.Addition(0.5f,0.0f);
		
	

	}

}
