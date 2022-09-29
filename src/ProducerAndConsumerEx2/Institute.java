package ProducerAndConsumerEx2;

public class Institute {
	private int courses;
	private boolean available = false;
	
	public synchronized int get() {
		while(available == false) {
			try {
				wait();
			} catch(Exception ie) {
				
			}
		}
		available = false;
		notifyAll();
		return courses;
	}
	
	public synchronized void put(int value) {
		while(available == true) {
			try {
				wait();
			}
			catch (Exception ie){
				ie.printStackTrace();
			}
		}
		courses = value;
		available = true;
		notifyAll();
	}

}
