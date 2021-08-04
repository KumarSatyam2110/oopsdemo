package oopsdemo3;

class Count
{
	static int cnt;
	int a;
	
	Count()
	{
		cnt+=1;
		a=100;
	}
	
	static void  display()  //static method
	{
		System.out.println("Number of objects created :"+cnt );
	}
	
	void print()  //instance method
	{
		System.out.println("Instance Method");
	}
	
}
public class StaticDemo {

	public static void main(String[] args) {
		
		Count c1=new Count();
		Count c2=new Count();
		Count c3=new Count();
		
		c1.print();
		c2.print();
		c3.print();
		
		Count.display();
		

	}

}
