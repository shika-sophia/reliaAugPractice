// ���Y�҃N���X
class MProducer extends Thread {
	static final int END = -1;
	MMyQueue queue = null;
	MProducer(MMyQueue queue) {
		this.queue = queue;
	}
	public void run() {
		try {
			//100�񐻑�
			for (int i = 0; i < 100; i++) {
				//��������
				int n = produce(i);
				//�z�u
				queue.put(n);
			}
			queue.put(MProducer.END);
		} catch (InterruptedException e) {
		}
	}
	
	//�������郁�\�b�h
	int produce(int n) {
		sleepRandomly();
		return n;
	}
	
	//�K���ɋx�ރ��\�b�h
	void sleepRandomly() {
		try {
			int n = (int)(Math.random() * 1000);
			Thread.sleep(n);
		} catch (InterruptedException e) {
		}
	}
}
