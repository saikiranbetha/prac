package Collections;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		values.add(404);
		values.add(505);
		values.add(701);
		values.add(809);
		
		
////		sorting the last by the last number
//		Comparator<Integer> c = new Comparator<Integer>() {
//			public int compare(Integer i, Integer j) {
////				if(i%10 > j%10) 
////					return 1;
////				else
////					return -1;
//				
////				using the terinary operator
//				
//				return i%10> j%10 ? 1 : -1;  //here value 1 means swap the elements -1 means do not swap the elements
//			}
//		};
		
		
		
		
		
		
//		using the lambda expression
		
//		Comparator<Integer> c = (Integer i, Integer j)  -> {
//				return i%10> j%10 ? 1 : -1;  //here value 1 means swap the elements -1 means do not swap the elements
//		};
//		

		
		
		
		
		
// using the lambda expression we cannot mention the datatype and also the return statement also
		
//		Comparator<Integer> c = (i,j)  -> i%10> j%10 ? 1 : -1;  
//		
//		
//		
//		
//		
//		
//		Collections.sort(values, c);
//		
//		or also we can write it with the single line
		
		Collections.sort(values, (i,j) -> i%10>j%10?1:-1);
		
		for (Integer o : values) {
			System.out.println(o);
		}
		
	}

}
