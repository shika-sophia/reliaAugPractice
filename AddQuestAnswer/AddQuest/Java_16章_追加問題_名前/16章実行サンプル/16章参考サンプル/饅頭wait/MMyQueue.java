class MMyQueue {

	int[] intbuf;
	int start;
	int count;
	String vision;
	//��o�������邩�ǂ���(�C��)
	boolean isFace = true;
	
	public MMyQueue(int size) {
		intbuf = new int[size];
		start = 0;//���Ɏ�����\���̏ꏊ
		count = 0;//�l�߂��Ă����
	}
	
	//(���Y�҂�)�u�����Ƃ���
	public synchronized void put(int n) throws InterruptedException {
		//�u���ꏊ���Ȃ���΁c
		while (count >= intbuf.length) {
			System.out.println(Thread.currentThread().getName() + " wait : ���M���󂭂̂�҂�\n");
			wait();
		}
		int end = (start + count) % intbuf.length;
		intbuf[end] = n;
		count++;
		System.out.println("�a�َq���� " 
			+ (n + 1) + " �ڂ𐶎Y�����@" + faceUp(1) + draw() + "\n");
		notifyAll();
	}
	
	//(����҂�)��Ɏ�낤�Ƃ���
	public synchronized int take() throws InterruptedException {
		//�����̂�������΁c
		while (count == 0) {
			System.out.println(Thread.currentThread().getName() + " wait : �܂񂶂イ�ǉ��҂�\n");
			wait();
		}
		int n = intbuf[start];
		start = (start + 1) % intbuf.length;
		count--;
		System.out.println("����҂� "
			+ (n + 1) + " �ڂ�H�ׂĂ���@�@�@�@�@�@�@�@" + draw() + faceUp(0) + "\n");
		notifyAll();
		return n;
	}

// -------------------------------------------------------------------------------------------------------
// ��������͕`��֘A�̂��ߊ֌W�Ȃ�
	//�\���̕`��
	public synchronized String draw() {
		String t = "[��]";
		String f = "[�@]";
		String mantoo = new String("");
		int end = (start + count - 1) % intbuf.length;
		for(int i = 0; i < intbuf.length; i++) {
			//��0(�ȉ���if���͈�s�����Ȃ̂Œ���)
			if(count == 0) mantoo += f;
			//�z��
			else if(start <= end && start <= i && i<= end) mantoo += t;
			//�z�񃋁[�v
			else if(start > end && (i <= end || start <= i)) mantoo += t;
			//��
			else mantoo += f;
		}
		return mantoo/* + start + " " + count*/;
	}
	
	//�ǂ��ł��������o
	String faceUp(int n) {
		if(isFace) {
			if(n == 1) {
				return "���(�L��֥)�� ";
			} else {
				return "((�L�`�M))Ӹ�Ӹ�";
			}
		}
		return "\t";
	}
}