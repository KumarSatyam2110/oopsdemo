package oopsdemo3;

public class ObjectClass {

	public static void main(String[] args) {
		
		        Object oc=new Object();
		        System.out.println(oc.hashCode());
		        System.out.println(oc.toString());
		       
		        System.out.println(oc.getClass());
		       
		        Object oc1=new Object();
		        System.out.println(oc1.equals(oc));
		        System.out.println(oc1.hashCode());
		        System.out.println(oc1.toString());
		       
		        Object oc2=oc;
		        System.out.println(oc.equals(oc2));
		 
		        Student s1=new Student(101,"Raj");
		        Student s2=new Student(101,"Raj");
		        s1=s2;
		        
		        System.out.println(s1.getClass());
		        System.out.println(s1.equals(s2));
		        
		        String s= "Java";
		        String v= "Java";
		        String k=new String("Java");
		        
		        System.out.println(s.equals(v));
		        System.out.println(s.equals(k));
		        System.out.println(s==k);
		        System.out.println(s==v);
		        
		        
		        

	}

}
