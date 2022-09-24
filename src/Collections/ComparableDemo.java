package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;




class Stud implements Comparable<Stud>{
	int rollno, marks;
	String name;
	public Stud(int rollno, int marks, String name) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Stud [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	
	public int compareTo(Stud s) {
		
		//based on marks sort
		//return marks>s.marks? 1: -1;
		
		//based on length of characters
		return name.length()>s.name.length() ? 1:-1;
	}
	
	
	

}



public class ComparableDemo {

	public static void main(String[] args) {
		List<Stud> students = new ArrayList<>();
		
		students.add(new Stud(01, 80, "Vasu"));
		students.add(new Stud(02, 50, "Ravi"));
		students.add(new Stud(03, 100, "Prabh"));
		students.add(new Stud(04, 70, "Koti"));
		
		
//		here collections cannot sort the students because it doesnot have implement of comparable interface 
		Collections.sort(students);
		
		// we can also override the object by comparator object even after having comparable
//		Collections.sort(students, (i,j)-> i.marks > j.marks ? 1:-1);
		
		for (Stud s : students) {
			System.out.println(s);
		}

	}

}
