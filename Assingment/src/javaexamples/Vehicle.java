package javaexamples;

  class Bike {
	void run()
	{
	System.out.println("Vehicle is running");
	}
}
	 public class Vehicle extends Bike{
	
		
	  
		void run()
		{
			 super.run();
		System.out.println("Bike is awesome");
		}
	
		public static void main(String[] args) {
			
		
		Vehicle obj=new Vehicle();
		obj.run();
		

		

		}
	 }
	 


