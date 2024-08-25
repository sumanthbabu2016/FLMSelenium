package bank;

public class FlmBank {
	
	private double balance =1000;
		
	
	public void getBalance(int pin) {
		
		if (pin==3214)
		{
			System.out.println("Your Current Balance is "+balance);			
		}
		else
		{
			System.out.println("You have entered wrong pin");
		}
		public void setBalance(int depositAmount)
		{
			balance=balance+depositeAmount;
		}
	
	}
}