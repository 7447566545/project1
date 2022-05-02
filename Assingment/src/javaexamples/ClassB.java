package javaexamples;
import java.util.Scanner;

public class ClassB {
	
	public static void main(String[] args) {
		int n, Fact=1;
		System.out.println("Enter any number");
		
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		for(int i=1;i<=n;i++)
		{
	Fact=Fact*i;
		}
		System.out.println("Factorial"+Fact);
		
		}
	}


