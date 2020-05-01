package Polymorfism;

public class Car extends Vehyicle {
	int door;
	
	public Car(int Speed,String name,int door)
	{
		super(Speed,name);
		this.door = door;  //passing value to super constractor vehicle
		System.out.println(door);
		
	}
	
	
	

}
