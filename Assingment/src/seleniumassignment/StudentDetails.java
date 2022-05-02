package seleniumassignment;

public class StudentDetails
{
	
	
	
	void meth1(String name,int rollno,String Group)
	{
	System.out.println("Student Details :" +name+" " +rollno+" "+Group);
	//System.out.println("Student roll No is :"    +rollno);
	//System.out.println("Student Group is :"    +Group);
	}
/*	void meth2()
	{
		
	}
	void meth3()
	{
		
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails obj=new StudentDetails();
		obj.meth1("Asmita",1,"Mpc");
		obj.meth1("Ankita",2,"Bpc");
		obj.meth1("Pooja",3,"Bpc");
		obj.meth1("Sneha",4,"Mpc");
		

	}

}
