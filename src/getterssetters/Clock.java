package getterssetters;

public class Clock {
	
	private int Hr,Min,Sec;
	// Setters
	public void setClock (int h,int m,int s)
	{
		Hr=h;
		Min=m;
		Sec=s;
	}
	
	//Getters
	public void getClock()
	{
		System.out.printf("%02d:%02d:%02d",Hr,Min,Sec);
	}
	
	
	

}
