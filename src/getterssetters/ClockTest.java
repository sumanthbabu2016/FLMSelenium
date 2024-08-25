package getterssetters;

public class ClockTest {

	public static void main(String[] args) {
			
		Clock C1=new Clock();
		 
		C1.setClock(7,16,55);
		
		System.out.println();
		
		
		Clock C2=new Clock();
		
		C2.setClock(1, 5, 8);
		
		C2.getClock();
		
		
	}

}
