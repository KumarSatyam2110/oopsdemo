package oopsdemo1;

class Test
{
	public void finalize()
	{
		System.out.println("Object destroyed & garbage collected");
	}
}
public class DestructorDemo {

	public static void main(String[] args) {
		
		Test t1=new Test(); // initialize object --- called default constructor
		Test t2=new Test();
		
		t1=null;  // de allocate memory
		t2=null;
		
		System.gc(); // invoke service method gc () ---> invoke finalize()
		
		System.out.println("In main method");
		

	}

}
