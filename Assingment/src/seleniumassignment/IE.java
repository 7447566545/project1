package seleniumassignment;

 interface interface1
{
	 
	
		int x=90;
		void method1();
		void method2();
	}
	interface interface2 extends interface1
	{
		void m3();
	}
	interface interface3
	{
		void m4();
	}
	public class IE implements interface2,interface3 
	{

		public static void main(String[] args) 
		{
			IE obj=new IE();
			obj.method1();
			obj.method2();
			obj.m3();
			obj.m4();
		}
		 public void method1()
		{
			System.out.println("Method1 defination");
			
		}
		 public void method2()
		 {
			 System.out.println("Method2 defination");
		 }
		 public void m3()
		 {
			
			 System.out.println("Method3 defination");
		 }
		 public void m4()
		 {
			 System.out.println("Method4 defination");
		 }
	}
	


