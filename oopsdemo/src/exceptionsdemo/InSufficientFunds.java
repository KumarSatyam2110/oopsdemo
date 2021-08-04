package exceptionsdemo;

public class InSufficientFunds extends Exception{
	
	private double amount;

	public InSufficientFunds(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}
	
	

}
