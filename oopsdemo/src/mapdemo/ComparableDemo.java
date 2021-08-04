package mapdemo;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> a1=new ArrayList<Student>();
		
		Student s1= new Student(101,"Mike",19);
		Student s2= new Student(102,"Mike",15);
		Student s3= new Student(103,"Mike",13);
		Student s4= new Student(104,"Mike",10);
		Student s5= new Student(105,"Mike",17);
		
		//adding student to list
		a1.add(s2);a1.add(s3);a1.add(s1);a1.add(s4);a1.add(s5);
		
		Collections.sort(a1); //invoke CompareTo() method of student class
		
		System.out.println("*******Student Sorted List based on Age");
		for(Student s:a1)
		{
			System.out.println(s.rollNo+" "+s.name+" "+s.age);
		}
		

	}

}
