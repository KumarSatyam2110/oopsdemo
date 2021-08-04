package miscellaneous;

public class WrapperDemo {

	public static void main(String[] args) {
		
		//craete primitive type
		int a=5;
		float b=10.10f;
		
		//convert it into wrapper objects
//		Integer aObj=new Integer(a);
//		Double bObj=new Double(b);
		
		//convert it into wrapper objects
		Integer aObj=a;  //Auto boxing--converting value to object type
		Float bObj=b;
		
		//create wrapper class objects
		
		Integer x=Integer.valueOf(100);
		Double y=Double.valueOf(20000.00);
		
		//convert into primitive types
		int p=x.intValue(); //Auto-unboxing--convert object to value type
		double q=y.doubleValue();
		
		System.out.println(p +" "+q);
		System.out.println(aObj+ " "+bObj);
		
		char e='a';
		Character objE=e;
		System.out.println(objE);
		System.out.println(objE.isUpperCase(e));
		
		Double d=200.55;
		Double objD=Double.valueOf(d);
		System.out.println(objD);
		System.out.println(Double.toHexString(d));
		
		String hex="0xff";
		String oct="005";
		
		System.out.println(Integer.decode(oct));
		System.out.println(Integer.decode(hex));

	}

}
