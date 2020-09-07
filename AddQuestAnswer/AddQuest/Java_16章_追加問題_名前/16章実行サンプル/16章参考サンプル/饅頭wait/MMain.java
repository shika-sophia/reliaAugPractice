/**
* é\“ªwait&notify
*/
public class MMain {
	public static void main(String[] args) {
		MMyQueue queue = new MMyQueue(3);
		//queue.isFace=false;
		MProducer producer = new MProducer(queue);
		MConsumer consumer = new MConsumer(queue);
		producer.start();
		consumer.start();
	}
}
