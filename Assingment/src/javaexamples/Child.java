package javaexamples;

class MultilevelInheritance 
{
	void m1()
	{
		System.out.println("Good morning");
	}
	void m2()
	{
		System.out.println("Good Afternoon");
	}
}
	class Parent extends MultilevelInheritance
	{
		void m3()
		{
			System.out.println("Good Evenning");
		}
	}
		public class Child extends Parent 
		{
			void m4()
			{
				System.out.println("Good Night");
			}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Child obj=new  Child();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();

	}

}