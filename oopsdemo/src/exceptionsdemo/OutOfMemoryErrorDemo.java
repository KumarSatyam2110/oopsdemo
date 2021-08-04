package exceptionsdemo;

import java.io.IOException;

public class OutOfMemoryErrorDemo {
	
	public void createArray(int size)
	{
		try
		{
			Integer[] a=new Integer[size];
			
		}
		catch(OutOfMemoryError e)
		{
			System.err.println("Array Size too Large :"+e);
			System.err.println("Maax JVM Memory: "+Runtime.getRuntime().maxMemory());
			System.out.println("Java Version :"+Runtime.version());
			
			
		}
	}
	
	public static void main(String[] args) {
		
		OutOfMemoryErrorDemo d1=new OutOfMemoryErrorDemo();
		d1.createArray(1000*1000*1000);
		
		//open notepad
		try
		{
			Runtime.getRuntime().exec("mspaint");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}

}
