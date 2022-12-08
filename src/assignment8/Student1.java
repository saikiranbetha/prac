package assignment8;

import java.io.Serializable;

public class Student1 implements Serializable {
	private static final long serialVersionUID = 1L;
	int id;
	String name;

	public Student1(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
