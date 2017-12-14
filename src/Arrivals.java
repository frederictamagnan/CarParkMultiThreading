
public class Arrivals implements Runnable {
	
	private Carpark carPark;
	private int waitingTime;

	public Arrivals(Carpark carPark){
		
		this.carPark=carPark;
		
		
		
	}
	
	
	public void arrive(){
		
		carPark.arrive();
	}
	
	public void run(){
		
		while(true){
			arrive();
			
			try
			{
			Thread.sleep((int)Math.random()*22700);
			}
			catch
			(InterruptedException e) {
			
			}
		}
	}
		
	
}
