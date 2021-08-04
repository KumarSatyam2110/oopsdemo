package collectionsdemo;

import java.util.HashSet;
import java.util.Set;

//hashSet with user defined objects

public class HashSetDemoUserDefined {

	public static void main(String[] args) {
		
		Set<Customer> customers = new HashSet<Customer>();
		
		//add new customer Object to set
		customers.add(new Customer(101,"Arun","Bengaluru"));
		customers.add(new Customer(102,"Sahil","Patna"));
		customers.add(new Customer(103,"Satyam","Ranchi"));
		customers.add(new Customer(104,"Minu","Karnal"));
		customers.add(new Customer(105,"Siddharth","Mumbai"));
		
		//add duplicate customer
		/*
        HashSet will use the `equals()` & `hashCode()` implementations 
        of the Customer class to check for duplicates and ignore them
      */

		customers.add(new Customer(102,"Sahil","Patna"));
		
		System.out.println(customers);
		
		for(Customer i:customers)
		{
			System.out.println(i.getId()+" "+i.getName()+" "+i.getCity());
			
		}

	}

}
