package mapdemo;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		
		 Hashtable<Integer,String> map=new Hashtable<Integer,String>();          
	     map.put(100,"Amit");    
	     map.put(102,"Ravi");   
	     map.put(101,"Vijay");    
	     map.put(103,"Rahul");    
	     System.out.println("Map contents: "+map);

	     //Here, we specify the if and else statement as arguments of the method  
	     System.out.println(map.getOrDefault(101, "Not Found"));  
	     System.out.println(map.getOrDefault(105, "Not Found"));  

	      map.remove(102);  
	       System.out.println("After remove: "+ map); 

	//Inserts, as the specified pair is unique  
	     map.putIfAbsent(104,"Gaurav");  
	     System.out.println("Updated Map: "+map);
	     
	     //Enumeration for traversing in HashTable
	     Enumeration e=map.keys();
	     
	     while(e.hasMoreElements())
	     {
	    	 Integer key=(Integer) e.nextElement();
	    	 	System.out.println(key+"---> "+map.get(key));
	     }
	    	
	}

}
