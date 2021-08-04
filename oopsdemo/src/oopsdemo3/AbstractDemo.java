package oopsdemo3;

public class AbstractDemo {

	public static void main(String[] args) {
		Trainee t1=new Marks("John","New York",001,35); //upcasting
		
		t1.show(); //invoke abstract base class method
		double marks=t1.calculateMarks();
		System.out.println(t1 +" "+marks);

	}

}
