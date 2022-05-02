package seleniumassignment;

public class StaticKeyword
{
 int a=10;
static void meth1(int a)
{
System.out.println("Static");
System.out.println("The value of "+new StaticKeyword().a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticKeyword obj=new StaticKeyword();
		StaticKeyword.meth1(10);
		
		

	}

}
