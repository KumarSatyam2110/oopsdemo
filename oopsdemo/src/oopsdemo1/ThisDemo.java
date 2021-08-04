package oopsdemo1;

public class ThisDemo {
	
	int age;
	
	ThisDemo(int age)
	{
		this.age=age;
	}

	public static void main(String[] args) {
		
		ThisDemo td1=new ThisDemo(22);
		System.out.println("The Value of age is : "+td1.age);
			

	}

}
