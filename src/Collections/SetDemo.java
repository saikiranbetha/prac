package Collections;

import java.util.HashSet;
import java.util.Set;
//import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		
//		Set does not contains any duplicate values
//		HashSet randomly prints the values and TreeSet prints in sorted
		Set<Integer> values = new HashSet<>();
		
//		Set<Integer> values = new TreeSet<>();
		
		
		values.add(18);
		values.add(57);
		values.add(24);
		values.add(54);
		
		for (int i : values) {
			System.out.println(i);
		}

	}

}
