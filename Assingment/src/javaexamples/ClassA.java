package javaexamples;
import java.util. Scanner;

public class ClassA 
{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Count=0;
		int n;
		System.out.println("enter any number");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		for (int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				Count++;
			}
		}
		if(Count==2)
		{
			System.out.println("Given number is prime"+n);
		}
		else
		{
			System.out.println("Given number is not prime");
			}
		}

	}


