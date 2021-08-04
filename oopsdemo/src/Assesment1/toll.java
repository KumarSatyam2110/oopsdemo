package Assesment1;

public class toll implements TollBooth {
	
	toll()
	{
	  counttruck=0;
	  receipts=0;
	}

	@Override
	public void calculation(truck t) {
		
		int axles=t.calaxles();
		  int weight=t.calweight();
		  int dueamount=5*axles+((weight/500)*10);
		  System.out.println("No. of axles: "+axles+" axles");
		  System.out.println("weight of the truck: "+weight+"kg");
		  counttruck=counttruck+1;
		  receipts=receipts+dueamount;
		  System.out.print("Amount due for truck "+counttruck+": ");
		  System.out.println(dueamount);
		
	}
	
	public void Welcome()
	{
		System.out.println("**********Welcome to Alleghany TollBooth************");
		System.out.println("");
		System.out.println("");
	}
	
	public void resetting()
	{
		counttruck=0;
		receipts=0;
		System.out.println("No. of trucks pass the toll: "+counttruck);
		System.out.println("Total Amount of receipts when "+counttruck+
				  " trucks passes the toll: "+receipts);
	}
	@Override
	public void showdata() {
		
		System.out.println("No. of trucks pass the toll: "+counttruck);
		  System.out.println("Total Amount of receipts when "+counttruck+
				  " trucks passes the toll: "+receipts);
		}
		int receipts;
		int counttruck;
		}
		class truck1 extends toll implements truck
		{
		truck1(int axles, int weight)
		{
		  this.axles=axles;
		  this.weight=weight;  
		}

		public int calaxles()
		{
		  return axles;
		}

		public int calweight()
		{
		  return weight;
		}

		int axles;
		int weight;	

}
