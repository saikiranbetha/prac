package Collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		List values = new ArrayList();
		//Collection values = new ArrayList();
		values.add(4); //Integer v = new Integer(4) here it is an object and it is a wrapper class
		values.add(5);
		values.add(6);
		values.add("2");
//		values.add(2, 10);	//adding the number in the list here 2 is the index and 10 is the value
		
//		Iterator i = values.iterator();  //1st "Iterator" is an interface and 2nd "iterator" is method
//
////		System.out.println(i.next());
////		System.out.println(i.next());
////		System.out.println(i.next());
//		
//		
//		
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
//		
		
//		for(int i=0; i<values.size(); i++) {
//			System.out.println(values.get(i));
//		}
//		
		
		for(Object o : values) {
			System.out.println(o);
		}
		
		
		
		
		
	}

}
