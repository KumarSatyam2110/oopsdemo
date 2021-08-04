package oopsdemo3;

public class AccountTest {

	public static void main(String[] args) {
		
		 SavingsAccount sAccountObj = new SavingsAccount("John", 500, 4);
	        System.out.println("\nSavings Account Details");
	        System.out.println("------------------------");
	        System.out.println("" + sAccountObj.getName()
	        + " has an initial Balance of: " + sAccountObj.getBalance());
	        sAccountObj.deposit(200);
	        sAccountObj.withdraw(300);
	        System.out.println("" + sAccountObj.getName()
	        + " at the end of transaction has a Balance of: "
	        + sAccountObj.getBalance());

	        System.out.println("\nChecking Account Details");
	        System.out.println("------------------------");

	        CheckingAccount cAccountObj = new CheckingAccount("Stephen", 500, 200);
	        System.out.println("" + cAccountObj.getName()
	        + " has an initial Balance of: " + cAccountObj.getBalance());
	        cAccountObj.deposit(200);
	        cAccountObj.withdraw(800);
	        System.out.println("" + cAccountObj.getName()
	        + " at the end of transaction has a Balance of: "
	        + cAccountObj.getBalance());

	}

}
