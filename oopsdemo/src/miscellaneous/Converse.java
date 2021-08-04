package miscellaneous;

public class Converse {
	
	void tobeConvert() {
        String binary, hex, octal;
        int num = 100;
        Integer obj = Integer.valueOf(num); // Integer Wrapper class object

        binary = obj.toBinaryString(num);
        hex = obj.toHexString(num);
        octal = obj.toOctalString(num);

        System.out.println("Decimal value : " + num);
        System.out.println("Binary equivalent = " + binary);
        System.out.println("Hexadecimal equivalent = " + hex);
        System.out.println("Octal equivalent = " + octal);
    }
	

	public static void main(String[] args) {
		
		Converse c=new Converse();
		c.tobeConvert();
		
	}

}
