package collectionsdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterationDemo {

	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<String>();
		
		names.add("James");
		names.add("Michael");
		names.add("Sahil");
		names.add("Satyam");
		names.add("Jim");
		
		System.out.println(names);
		
		//Iterator interface for traversing
		Iterator<String> itr=names.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(names.get(1));
		
		names.add(3,"Raj"); //adding element in specified index
		names.remove(0);  //delete first element
		names.set(1, "Java"); //replace existing element
		
		System.out.println("***Display collection using for each loop***");
		
		for(String i:names)
		{
			System.out.println(i);
		}
		
		ArrayList<Double> marks=new ArrayList<Double>();
		marks.add(999.25);
		marks.add(899.25);
		marks.add(450.257);
		marks.add(785.56);
		marks.add(657.17);
		
		System.out.println();
		for(Double i:marks)
		{
			System.out.println(i);
		}
		

	}

}
