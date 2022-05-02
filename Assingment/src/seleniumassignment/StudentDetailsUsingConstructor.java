package seleniumassignment;

public class StudentDetailsUsingConstructor
{
	StudentDetailsUsingConstructor (String name,int rollno,String Group)
	{
		System.out.println("Student Details :" +name+" " +rollno+" "+Group);
		//System.out.println("Student roll No is :"    +rollno);
		//System.out.println("Student Group is :"    +Group);
	}
	StudentDetailsUsingConstructor()
	{
		System.out.println("Student Details :"+"Megha"+" "+1+" "+"Mpc");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentDetailsUsingConstructor obj= new StudentDetailsUsingConstructor("Asmita",1,"Mpc");
		new StudentDetailsUsingConstructor ("Pranali",2,"Bpc");
		
	}

}
