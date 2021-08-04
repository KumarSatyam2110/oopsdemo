package oopsdemo1;

import java.util.Scanner;

public class Employee1display {

	public static void main(String[] args) {
		
		int hours,salary;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No. of Hours per Day ");
		hours=sc.nextInt();
		System.out.println("Enter Salary ");
		salary=sc.nextInt();
			
		Employee1 emp=new Employee1();
		emp.getInfo(salary, hours);
		emp.AddSal();
		emp.AddWork();
		emp.show_salary();
		}

	}


