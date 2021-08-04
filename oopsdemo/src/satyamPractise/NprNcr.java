package satyamPractise;

import java.util.Scanner;

public class NprNcr {
	
	public static int fact(int num)
	{
		int fact =1,i;
		for(i=1;i<=num;i++)
		{
			fact = fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		
		int n,r;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		n=s.nextInt();
		System.out.println("Enter the value of r : ");
		r=s.nextInt();
		
		System.out.println(" NCR " + (fact(n)/(fact(n-r)*fact(r))));
		System.out.println(" nNPR " + (fact(n)/(fact(n-r))));
		
	}

}
