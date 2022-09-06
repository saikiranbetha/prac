package practice_examples;

public class ClassesAndObject {
	
	// Instance Variables
	String name;
	String gender;
	int age;
	String phoneNo;
	
	
	//Constructor declaration of class
	public ClassesAndObject(String name, String gender, int age, String phoneNo) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phoneNo = phoneNo;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}
	
	public String toString() {
		return ("Hi my name is " + this.getName()+ ".\nMy gender, age and phone number are " + this.getGender()
		+ ", " + this.getAge() + ", " + this.getPhoneNo() + ".");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassesAndObject details = new ClassesAndObject("Kiran", "Male", 24, "8520949622");
		System.out.println(details.toString());
	}

}
