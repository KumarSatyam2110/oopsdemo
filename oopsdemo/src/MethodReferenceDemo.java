interface Hello
{
	void welcome();
}
public class MethodReferenceDemo {
	
	public static void display()
	{
		System.out.println("Hello from Method Reference");
	}
	public void print()
	{
		System.out.println("Instance Method call using Method Reference");
	}
	MethodReferenceDemo()
	{
		System.out.println("In Constructor");
	}
	
	public static void main(String[] args) {
		
		Hello h= MethodReferenceDemo::display; //invoke static method
		h.welcome();
		
		MethodReferenceDemo d1=new MethodReferenceDemo();
		Hello h1=d1::print; //invoke instance method
		h1.welcome();
		
		Hello h2=MethodReferenceDemo::new; //method reference to constructor
		h2.welcome();

	}

}
