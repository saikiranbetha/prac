package assignment8;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class serialization {

	public static void main(String args[]) {
		try {
			// Creating the object
			Student1 s1 = new Student1(211, "ravi");
			// Creating stream and writing the object
			FileOutputStream fout = new FileOutputStream("f.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(s1);
			out.flush();
			// closing the stream
			out.close();
			System.out.println("success");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
