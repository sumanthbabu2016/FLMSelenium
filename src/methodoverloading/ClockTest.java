package methodoverloading;

public class ClockTest {

	public static void main(String[] args) {

		Clock c1=new Clock();
		
//		c1.setClock(5);
//		c1.getClock();
		
		c1.setClock(5, 20);
		c1.getClock();
		
	}

}
