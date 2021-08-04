package miscellaneous;

class sample <T>   //Generic class/Parameterized class
{
	private T data;  //generic variable declaration

	public sample(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
		
}

public class GenericsClassDemo {

	public static void main(String[] args) {
		
		sample<String> s1=new sample<String>("Java Generics");
		System.out.println("Display from Generic class by passing String Object : "+s1.getData());
		
		sample <Integer> s2=new sample <Integer>(200);
		System.out.println("Display from Generic class by passing Integer Object : "+s2.getData());
		
		sample<Double> s3=new sample<Double>(555.50);
		System.out.println("Display from Generic class by passing Double Object : "+s3.getData());
		
		
		

	}

}
