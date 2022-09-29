package ProducerAndConsumerVenk;

public class ProducerAndConsumer {
	public static void main(String[] args) {
		Shop c = new Shop();
		Producer p = new Producer(c, 1);
		Consumer co = new Consumer(c, 2);
		p.start();
		co.start();
	}
}
