package seleniumassignment;

public class ExceptionHandling 
{
	public static void main(String[] args) {
		
	
	try
	{  
	   int a[]=new int[5];
	   a[9]=30/0;
 	} 
	
 	
 catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("There is no index to which you are trying to store value");	
 		System.out.println("ArrayIndexOutOfBoundsException exception is executed");
	}
 	
 	catch(ArithmeticException e)
 	{
		System.out.println("Please do not enter zero");
		//code-- take input values from user;
 		System.out.println("ArithmeticException exception is executed");
		
    }
	catch(Exception e)
	{
		System.out.println("There is no index to which you are trying to store value");	
 		System.out.println("ArrayIndexOutOfBoundsException exception is executed");
	}
 	
 

 			 	  	 //	f
	 //System.out.println("rest of the code...");  
 

}

}





