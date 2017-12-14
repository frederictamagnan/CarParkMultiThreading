
public class Departures implements Runnable {

	private Carpark carPark;

	
	public Departures(Carpark carPark){
		
		this.carPark=carPark;
		
		
	}
	
	
	public void depart(){
		
		carPark.depart();
	}
	
	public void run(){
		
		while(true){
			depart();
			try
			{
			Thread.sleep((int)Math.random()*20200);
			}
			catch
			(InterruptedException e) {
			
			}
		}
	}
	
}
