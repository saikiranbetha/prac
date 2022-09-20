package Inheritance;

//class
class Bicycle {
	
	//properties
	protected int gear;
	protected int speed;
	
	
	//constructor
	public Bicycle(int startSpeed, int startGear) {
		gear = startGear;
		speed = startSpeed;
	}
	
	
	//methods - 3
	public void setGear(int newValue) {
		gear = newValue;
	}
	
	public void applyBrake(int decrement) {
		speed -= decrement;
	}
	
	public void speedUp(int increment) {
		speed += increment;
	}

}
