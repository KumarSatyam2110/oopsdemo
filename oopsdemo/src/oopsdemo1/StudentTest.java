package oopsdemo1;

public class StudentTest {

	public static void main(String[] args) {
		//Create a object of Student Class
		Student s1=new Student();
		Student s2=new Student();
		
		//invoke methods of student class using dot operator
		s1.input();
		float tot=s1.calculate();
		s1.display();
		System.out.println("Total displayed from main:"+tot);
		
		//invoke methods of student class using dot operator
		s2.input();
	    float tot1=s2.calculate();
		s2.display();
		System.out.println("Total displayed from main:"+tot1);
	}

}
