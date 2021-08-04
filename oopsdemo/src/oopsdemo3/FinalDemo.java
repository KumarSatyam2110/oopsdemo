package oopsdemo3;

final class Hello
{
	final void display()
	{
		System.out.println("This is a final method");
	}
}

/* class World extends Hello  //final class cannot be extended
{
	//final methods cannot be overridden
	final void display()
	{
		System.out.println("This is a final method");
	}  
} */


public class FinalDemo {

	public static void main(String[] args) {
		
		final int AGE=20;
		final float PI=3.142f;
		//AGE=30; -- COMPILATION ERROR
		
		
		

	}

}
