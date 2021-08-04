package oopsdemo1;

public class Complex {
	double real;
	double imaginary;
	
	Complex(double r, double i)
	{
		real=r;
		imaginary=i;
	}
	
	void add(Complex obj)
	{
		this.real+=obj.real;
		this.imaginary+=obj.imaginary;
		
	}
	
	void display()
	{
		System.out.println("r"+this.real+" + i"+this.imaginary);
	}

}
