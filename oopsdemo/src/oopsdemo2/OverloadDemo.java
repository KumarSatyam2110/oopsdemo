package oopsdemo2;

public class OverloadDemo {

	public static void main(String[] args) {
		
		Addition a1=new Addition();
		
		//invoking add() overload method
		a1.add();
		a1.add(20,30);
		a1.add(56.25f,284.89f);
		a1.add(300,400,800);
		a1.add("Hello"," World");
		

	}

}
