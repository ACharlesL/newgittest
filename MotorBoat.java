import java.util.Scanner;


public class MotorBoat {
	
	private double fuelTankCap;
	private int presentFuel;
	private double maxSpeed;
	private int currentSpeed;
	private int efficiency;
	private int distanceTrav;
	private int speed;
	private int traveltime;
	private Scanner keyboard;

	//change boats speed
	public void boatSpeed(int speed){
		currentSpeed = speed;
	}
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	
	//amount of fuel in tank
	public void refuel(int newFuel){
		System.out.println ("present fuel level "+presentFuel);
		presentFuel=newFuel+presentFuel;
		System.out.println ("after refueling, fuel level is "+presentFuel);
	}
	public int getFuel(){
		return presentFuel;
	}
	
	
	//input method
	public void input()
	{
		keyboard = new Scanner(System.in);
		System.out.println("Enter motor Efficiency");
		efficiency=keyboard.nextInt();
		System.out.println("Enter fuel used at speed ");
		speed=keyboard.nextInt();
		System.out.println("Enter travel time");
		traveltime=keyboard.nextInt();		
	}
	
	//  distance traveled
	public void traveleddist(){
		double dist=efficiency*speed*speed*traveltime;
		System.out.println("Distance travele : "+dist);
	}
	
}	



