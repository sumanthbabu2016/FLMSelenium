package bank;

public class Hacker {

	public static void main(String[] args) {
		FlmBank h1=new FlmBank();
		
		h1.getBalance(1234);
		
		FlmBank c1=new FlmBank();
		c1.setBalance(100);
		c1.getBalance(3214);
		
		
	}

}
