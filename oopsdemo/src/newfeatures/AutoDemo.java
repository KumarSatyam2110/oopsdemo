package newfeatures;

class Auto
{
	public Auto(String year,String make,String model, String...options)
	{
		System.out.println("Year :"+year);
		System.out.println("Make :"+make);
		System.out.println("Model :"+model);
		
		System.out.println("****Features****");
		for(String i:options)
		{
			System.out.println(i+" ");
		}
		
		System.out.println();
	}
}

public class AutoDemo {

	public static void main(String[] args) {
		
		Auto a1=new Auto("1969","Fiat","124 Spider","5-speed","Disk brakes");
		
		Auto a2=new Auto("1997","Ford","Expedition","Automatic","Four-Whee drive","power windows",
				"power locks"," air conditioning","stereo with cd charger","tinted glass");
		
		

	}

}
