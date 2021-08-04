package oopsdemo2;
//Java program to implement inheritance

class Doctor
{
	int idNumber; 
	String name;
	String address;
	
	public Doctor(int idNumber, String name, String address) {
		this.idNumber = idNumber;
		this.name = name;
		this.address = address;
	}
	
	void display() {
	    System.out.println("********* Doctor Details ***********");
	        System.out.println("The name is :" + name);
	        System.out.println("The number is :" + idNumber);
	        System.out.println("The address is :" + address);
	    }
}

class Specialist extends Doctor
{
	String speciality;
	

	public Specialist(int idNumber, String name, String address,String sp) {
		super(idNumber, name, address); //invoke base class constructor
		this.speciality=sp;	
		
	}
	void display() {
	    super.display(); // call base class method
	    System.out.println("The speciality is :" +speciality);
	    }
	
}
class NonSpecialist extends Doctor 
{
		public NonSpecialist(int idNumber, String name, String address) {
			super(idNumber, name, address); //invokes base class constructor
		
	}
}

public class TestDoctor {

	public static void main(String[] args) {
		
		//invoke child class specialist constructor
		Specialist spObj=new Specialist(1001,"Marry","New York","Cardiologist");
		
		spObj.display(); // invoke child class specialist display method
		
		//invoke child class Nonspecialist constructor
		NonSpecialist nspObj=new NonSpecialist(1005,"John","Sydney");
		
		nspObj.display(); // invoke base class Doctor display() method
		
	}
}


