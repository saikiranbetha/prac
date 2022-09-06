package practice_examples;

public class objectCreationExamples {
	//using new keyword
	String value = null;
	
	public objectCreationExamples(String value) {
		this.value = value;
	}
	
	public void display() {
		System.out.println("Printing the value " + value);
	}
 
	public static void main(String[] args) {
		objectCreationExamples s1 = new objectCreationExamples("Java");
		s1.display();
		
	}

}
