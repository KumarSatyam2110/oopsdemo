package satyamPractise;

//Write a Java program to calculate Fibonacci Series up to n numbers.
public class Fibonacci {

	public static void main(String[] args) {
		
		int n=100,t1=0,t2=1;
		System.out.println("Upto " +n+ ":");
		while(t1<=n)
		{
			System.out.println(t1+"+");
			int sum = t1+t2;
			t1=t2;
			t2=sum;
		}

	}

}
