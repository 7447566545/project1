package javaexamples;

 class Father 
 {
	void m1()
	{
		System.out.println("Java is awesome");
	}
	void m2()
	{
		System.out.println("Hello");
	}
}
	public class SingleInheritance extends Father 
	{
		void m3()
		{
			System.out.println("Good Mornning");
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInheritance obj=new SingleInheritance();
		obj.m1();
		obj.m2();
		obj.m3();

	}

}
