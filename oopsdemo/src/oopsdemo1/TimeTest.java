package oopsdemo1;

public class TimeTest {

	public static void main(String[] args) {
		Time t1=new Time(10,25,43);
		Time t2=new Time(8,10,30);
		t1.add(t2);
		
		System.out.println("The addition of two time no is");
		t1.display();

	}

}
