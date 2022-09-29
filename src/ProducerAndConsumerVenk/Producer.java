package ProducerAndConsumerVenk;

public class Producer extends Thread{
	private Shop shop;
	private int number;

	public Producer(Shop c, int number) {
		shop = c;
		this.number = number;
	}

	public void run() {
		for(int i=0; i<10; i++) {
			shop.put(i);
			System.out.println("product value " +this.number+ " = " +i);
			try {
				sleep((int)(Math.random()*100));
			}
			catch(Exception ie) {
				ie.printStackTrace();
			}
		}
	}
}