package ProducerAndConsumerVenk;

public class Consumer extends Thread {
	private Shop shop;
	private int number;

	public Consumer(Shop c, int number) {
		shop = c;
		this.number = number;
	}
	
	public void run() {
		int value = 0;
		for(int i=0; i<10; i++) {
			value = shop.get();
			System.out.println("Consumer value " +this.number+ " = " +value);
		}
	}
}