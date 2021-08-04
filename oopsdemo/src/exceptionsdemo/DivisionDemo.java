package exceptionsdemo;

import java.util.Scanner;

public class DivisionDemo {

	public static void main(String[] args) {

		int a, b, result;  
        Scanner input = new Scanner(System.in);
         System.out.println("Input two integers");
         a = input.nextInt();
         b = input.nextInt();
         
         try  //statements to be monitored
         {
        	 result = a / b;  
             System.out.println("Result = " + result);
         }
         catch(ArithmeticException e) //Exception thrown is handled in catch block
         {
        	 System.out.println("Divide by zero Error");
        	 System.out.println("Exception Description :"+e.getMessage());
        	 System.out.println("Exception Name & Description :"+ e.toString());
        	 e.printStackTrace();  //Details about exception, description,
        	 //Line no of code which generated exception
         }
         finally   //clean-up operations
         {
        	 input.close();
        	 System.out.println("In Finally Block- Program Execution Ended");
         }

	}

}
