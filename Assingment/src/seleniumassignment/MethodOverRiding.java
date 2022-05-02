package seleniumassignment;



class ClassA 
{
	void method()
	{
		System.out.println("meth1() Called");
	}
	}
	public class MethodOverRiding extends ClassA
	{
		
		void method()
		{
			super.method();
			System.out.println("meth2() Called");
		}
		public static void main(String[] args) 
		{
			MethodOverRiding	 obj=new MethodOverRiding();
			obj.method();
			ClassA obj1=new ClassA();
			obj1.method();
			MethodOverRiding obj2=new MethodOverRiding();
			obj2.method();
			
			
		}
	}

	