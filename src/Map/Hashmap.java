package Map;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<Integer, String> languages = new HashMap<>();
		languages.put(1, "Java");
		languages.put(2, "Python");
		languages.put(3, "JavaScript");
		
		System.out.println("HashMap: " + languages);
		
		String value1 = languages.get(1);
		System.out.println("Value at index 1: " + value1);
		
		System.out.println("Keys: " + languages.keySet());
		
		System.out.println("Values: " + languages.values());
		
		System.out.println("Key/Value Mappings: " + languages.entrySet());
	}

}
