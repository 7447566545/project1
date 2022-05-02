package javaexamples;

 class StaticDemo{
	static int x=10;
	static int y;
	static void display()
	{
	
		System.out.println("x is"+x);
	System.out.println("y is"+y);
}

static
{

	y=x+100;
}
}
class A
{
public static void main(String[] args) {
		// TODO Auto-generated method stub
	StaticDemo.display();
}
}

	



