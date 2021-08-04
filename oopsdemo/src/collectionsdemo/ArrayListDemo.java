package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// generic arrayList
		ArrayList<String> a1=new ArrayList<String>();
		
		//add elements to arraylist
		a1.add("Java");
		a1.add("Perl");
		a1.add("C++");
		a1.add("C# 5.0");
		
		System.out.println(a1);
		
		//get elements by index
		System.out.println("Elements at index 1: "+a1.get(1));
		
		System.out.println("Does list contain element Java ?:"+a1.contains("Java"));
		
		//add elements at specific index
		a1.add(2,"Oracle");
		System.out.println(a1);
		
		System.out.println("Is Array list Empty ?: "+a1.isEmpty());
		System.out.println("Index of Perl : "+a1.indexOf("Perl"));
		System.out.println("Size of ArrayList : "+a1.size());
		
		Collections.sort(a1);
		System.out.println("Array list after Sorting :"+a1);
		
		//a1.add(100); --compiler error
		
		ArrayList<Integer> a2=new ArrayList<Integer>();
		
		a2.add(100);
		a2.add(500);
		a2.add(73);
		a2.add(66);
		a2.add(350);
		
		System.out.println(a2);
		System.out.println("Size :"+a2.size());
		

	}

}
