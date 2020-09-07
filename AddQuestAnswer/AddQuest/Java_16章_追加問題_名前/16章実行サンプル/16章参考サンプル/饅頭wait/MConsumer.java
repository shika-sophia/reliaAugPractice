// 消費者クラス
class MConsumer extends Thread {
	 MMyQueue queue = null;
	 
	MConsumer(MMyQueue queue) {
		this.queue = queue;
	}
	
	public void run() {
		try {
			while (true) {
				// 手にとって
				int n = queue.take();
				if (n == MProducer.END) {
					break;
				}
				// 食べる(消費)
				consume(n);
			}
		} catch (InterruptedException e) {
		}
	}
	
	// 消費するメソッド
	void consume(int n) {
		sleepRandomly();
	}
	
	// 適当に休むメソッド
	void sleepRandomly() {
		try {
			int n = (int)(Math.random() * 1000);
			Thread.sleep(n);
		} catch (InterruptedException e) {
		}
	}
}
