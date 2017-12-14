
public class Carpark {

	private int nbCarMax;
	private int nbCar;
	
	public Carpark(int nbCarMax, int nbCar){
	
	this.nbCarMax=nbCarMax;
	this.nbCar=nbCar;

	}
	
	public boolean invariant(){
		
		return nbCar<=nbCarMax && nbCar>=0;
		
	}
	
	public void simulateArrive(){
		nbCar++;
	}
	
	public void unsimulateArrive(){
		nbCar--;
	}
	
	public boolean canArrive(){
		boolean res;
		simulateArrive();
		res=invariant();
		unsimulateArrive();
		return res;
		
	}
	
	public synchronized void arrive(){
		while(!canArrive()){
			try{
			wait();
			}
			catch(InterruptedException e){
				System.out.println("arrive blocked");
				
			}
		}
		
		nbCar++;
		System.out.println("arrive -> nbCar = " +nbCar);
		notifyAll();
		
	}
	
	
	public void simulateDepart(){
		nbCar--;
	}
	
	public void unsimulateDepart(){
		nbCar++;
	}
	
	public boolean canDepart(){
		boolean res;
		simulateDepart();
		res=invariant();
		unsimulateDepart();
		return res;
		
	}
	
	public synchronized void depart(){
		while(!canDepart()){
			try{
			wait();
			}
			catch(InterruptedException e){
				System.out.println("depart blocked");
				
			}
		}
			
			
		nbCar--;
		System.out.println("depart ! nbCar = "+nbCar); 
		notifyAll();
		
	}
	
	
	
	}
