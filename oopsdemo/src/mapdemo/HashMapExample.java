package mapdemo;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<String,Double> hm=new HashMap<String,Double>();
		
		hm.put("john", 5000.20);
		hm.put("sahil", 7540.40);
		hm.put("raja", 4986.20);
		hm.put("minu", 5550.10);
		hm.put("srishti", 6000.80);
		
		System.out.println("Display Customers & Balance Amount: ");
		for(String k:hm.keySet())
		{
			System.out.println(k+" "+hm.get(k));
			
		}
		
		//deposit 1000 to raja accounts
		double bal=hm.get("raja");
		hm.put("raja", bal+1000);
		System.out.println("raja new balance is :"+hm.get("raja"));
		
		hm.putIfAbsent("sahil", 500.00);
		System.out.println(hm);
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter Customer name for his balance: ");
		String name=s.next();
		System.out.println("The Balance of "+name+ "is :"+hm.get(name));
		
		
				
				

	}

}
