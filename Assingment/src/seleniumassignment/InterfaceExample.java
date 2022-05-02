package seleniumassignment;

 interface asmita
{
	 int x=10;
		void method1();
	}
	interface pranali
	{
		int y=90;
		void method2();
	}
	public class InterfaceExample implements asmita,pranali
	{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			InterfaceExample obj=new InterfaceExample();
			obj.method1();
			
		}
		public void method1()
		{
			System.out.println("Defination of method");
		}
		public void method2()
		{
			System.out.println("Method 2 defination");
		}
	}
	