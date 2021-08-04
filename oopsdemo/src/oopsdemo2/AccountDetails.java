package oopsdemo2;

/* Multi Level Inheritance
 *  Account  --- > SavingsBank ---> AccountDetails
 */

public class AccountDetails extends SavingsBank{ //child class of Savings Bank
	
	int withdrawl,deposit,finalBalance;

	public AccountDetails(int accNo, String name, int mb, int b,int w, int dep)
	{
		super(accNo, name, mb, b);
		this.withdrawl=w;
		this.deposit=dep;		
	}
	
	void display()
    {
            super.display(); //invokes savings bank
            System.out.println ("Deposit: "+deposit);
            System.out.println ("Withdrawals: "+withdrawl);
            finalBalance=(balance+deposit)-withdrawl;
            
            
            System.out.println("FinalBalance: "+finalBalance);
    }

}
