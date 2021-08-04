package exceptionsdemo;

public class Bankdemo {

	public static void main(String[] args) {
		
		CheckingAccount c1=new CheckingAccount(101);
		System.out.println("Deposit 500$......");
		c1.deposit(5000);
		
		try
		{
			System.out.println("Withdraw 1000$");
			c1.withdraw(1000);
			
			System.out.println("Withdrawing 6000$");
			c1.withdraw(6000);
		}
		catch(InSufficientFunds e)
		{
			System.out.println("Sorry InSufficient Balance : "+c1.getBalance());
			e.printStackTrace();
		}
			
	}

}
