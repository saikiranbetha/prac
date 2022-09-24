package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		 Map<String, String> map = new HashMap<>();
		 
		 map.put("name" , "Sai");
		 map.put("age", "24");
		 map.put("place", "Vizag");
		 
		 //we can repeat the values but not the keys and if it is done like that then new value is printed
		 
		 //HashTable has more thread safety and synchronized when compare to the hashmap
		 
		 Set<String> Keys = map.keySet();
		 
		 for(String key : Keys) {
			 System.out.println(key + " " + map.get(key));
		 }

	}

}
