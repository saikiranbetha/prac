package StringMethods;

public class Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String FirstName = "Sai ";
		String MiddleName = "Kiran ";
		
		String result = FirstName.concat(MiddleName);
		System.out.println(result);
		
		String LastName = "Betha";
		String result1 = result.concat(LastName);
		System.out.println(result1);

	}

}
