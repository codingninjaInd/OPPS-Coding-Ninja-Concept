package SuperKeyWord;

public class Car extends Vehicle {
	
	String colour;
	int maxSpeed;
	
	void printCar()
	{
		System.out.println("Car colour is "+colour+" car speed is "+ maxSpeed);
	}
	
	void print()
	{
		super.maxSpeed = 150;
		System.out.println("colour is "+ super.colour+" speed is"+ super.maxSpeed);
	}

}
