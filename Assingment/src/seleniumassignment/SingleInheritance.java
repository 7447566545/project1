package seleniumassignment;

 class Parent 
{
	void m1()
	{
		System.out.println("Selenium");
	}
	void  m2()
	{
		System.out.println("Java");
	}
}
class SingleInheritance  extends Parent 
{
	void m3()
	{
		System.out.println("Communication");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInheritance obj=new SingleInheritance();
		obj.m1();
		obj.m2();
		obj.m3();

	}

}

