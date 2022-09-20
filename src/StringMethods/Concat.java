package StringMethods;

public class Concat {

	public static void main(String[] args) {
		String FirstName = "Sai ";
		String MiddleName = "Kiran";
		
		String result = FirstName.concat(MiddleName);
		System.out.println(result);
		
		String LastName = " Betha";
		String FullName = result.concat(LastName);
		System.out.println(FullName);

	}

}
