package javaexamples;

import java.util.Scanner;

public class ClassC 
{
	public static void main(String[] args) 
	{
		int n,r;
		System.out.println("Enter any number");
		Scanner ref=new Scanner (System.in);
		n=ref.nextInt();
		while(n>0)
		{
			r=n%10;
			System.out.print(r);
			n=n/10;
		}
		
	}

}
