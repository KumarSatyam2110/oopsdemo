package oopsdemo2;

public class AggregationDemo {

	public static void main(String[] args) {
		
		Address ad1= new Address("Bengaluru","Karnataka","India",566016);
		Address ad2= new Address("Prague","Bihar","China",800003);
		
		Student s1=new Student(101,"Satyam",ad1);
		Student s2=new Student(102,"Wilson",ad2);
		
		s1.display();
		s2.display();
		
	}

}
