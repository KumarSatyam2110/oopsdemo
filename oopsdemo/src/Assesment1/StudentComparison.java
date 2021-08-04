package Assesment1;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
 
public class StudentComparison {

	public static void main(String[] args) {
		
		//create student objects
				Student s1 = new Student(101, "Nayak", "Maths", 82);
				Student s2 = new Student(107, "Satyam" , "Chemistry", 73);
				Student s3 = new Student(124, "minu"  , "Commerce",95);
				Student s4 = new Student(135, "Radha","Arts",  96);
				
				
				List<Student> students = new ArrayList<Student>();
				students.add(s1); students.add(s2); students.add(s3); students.add(s4);
				
				System.out.println("***** Before Sorting *******");
				for(Student s : students)
				{
					System.out.println(s.getRollno()+" "+s.getName()+" "+s.getCourse()+" "+s.getMarks());
				}
				
				System.out.println();
				
			
				Collections.sort(students, Comparator.comparing((Student s)
				-> s.getMarks()).thenComparing(s -> s.getName()));
				
				
			System.out.println("**** Sorting based on marks of students*****");
				for(Student s : students)
				{
					System.out.println(s.getRollno()+" "+s.getName()+" "+s.getCourse()+" "+s.getMarks());
				}

	}

}
