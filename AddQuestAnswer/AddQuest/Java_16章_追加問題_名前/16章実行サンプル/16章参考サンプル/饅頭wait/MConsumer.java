// ����҃N���X
class MConsumer extends Thread {
	 MMyQueue queue = null;
	 
	MConsumer(MMyQueue queue) {
		this.queue = queue;
	}
	
	public void run() {
		try {
			while (true) {
				// ��ɂƂ���
				int n = queue.take();
				if (n == MProducer.END) {
					break;
				}
				// �H�ׂ�(����)
				consume(n);
			}
		} catch (InterruptedException e) {
		}
	}
	
	// ����郁�\�b�h
	void consume(int n) {
		sleepRandomly();
	}
	
	// �K���ɋx�ރ��\�b�h
	void sleepRandomly() {
		try {
			int n = (int)(Math.random() * 1000);
			Thread.sleep(n);
		} catch (InterruptedException e) {
		}
	}
}
