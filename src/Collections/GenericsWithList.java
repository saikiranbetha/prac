package Collections;

//Genrics with list and Collections class

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericsWithList {

	public static void main(String[] args) {
		
//		List<Integer> values = new ArrayList<Integer>();  //Integer is a generics here we can add the datatype with the wrapper class word like String etc.
		
		//we can write like this also from 1.7
		
		List<Integer> values = new ArrayList<>();  //List is mutable
		values.add(4);
		values.add(8);
		values.add(1);
		
		Collections.sort(values);
		Collections.reverse(values);
		Collections.shuffle(values);
		
		for (Integer o : values) {
			System.out.println(o);
		}
		

	}

}
