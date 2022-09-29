package ProducerAndConsumerEx2;

public class Training {
	public static void main(String[] args) {
		Institute c = new Institute();
		Lecturer p = new Lecturer(c, 1);
		Student co = new Student(c, 1);
		p.start();
		co.start();
	}

}
