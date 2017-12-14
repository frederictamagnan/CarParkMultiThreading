
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carpark carpark = new Carpark(5,0);
		Departures departures =new Departures(carpark);
		Departures departures2 =new Departures(carpark);
		Arrivals arrivals = new Arrivals(carpark);
		Arrivals arrivals2 = new Arrivals(carpark);
		
		Thread t_departures=new Thread(departures);
		Thread t_departures2=new Thread(departures2);
		Thread t_arrivals=new Thread(arrivals);
		Thread t_arrivals2=new Thread(arrivals2);
		t_departures.start();
		t_arrivals.start();
		t_arrivals2.start();
		t_departures2.start();
	
	}
	
	

}
