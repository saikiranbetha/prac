package Inherit;


//Accessing members of a class
class Bicycle {
	
	void braking() {
		String a = "Stopped";
		System.out.print(a);
		return;
	}
	

	public static void main(String[] args) {
			Bicycle sportsBicycle = new Bicycle();
			sportsBicycle.braking();
	}
}