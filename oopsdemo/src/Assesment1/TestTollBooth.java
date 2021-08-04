package Assesment1;

public class TestTollBooth {

	public static void main(String[] args) {
		
		toll booth=new toll();
		truck1 Ford=new truck1(5,12500);
		truck1 nissan=new truck1(2,5000);
		truck1 daewoo=new truck1(6,17000);
		
		booth.Welcome();
		
		System.out.println("FORD TRUCK ARRIVAL:");
		booth.calculation(Ford);
		booth.showdata();
		System.out.println("");
		
		System.out.println("***************");
		System.out.println("NISSAN TRUCK ARRIVAL:");
		booth.calculation(nissan);
		booth.showdata();
		System.out.println("");
		
		System.out.println("***************");
		System.out.println("DAEWOO TRUCK ARRIVAL:");
		booth.calculation(daewoo);
		booth.showdata();
		System.out.println("");
		
		System.out.println("*********Reset Receipts**********");
		System.out.println(" ");
		booth.resetting();

	}

}
