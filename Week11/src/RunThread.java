
public class RunThread extends Thread {
	
	public void run() {
		for(int i=0; i<50; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}

	public static void main(String[] args) {
		RunThread t1 = new RunThread();
		t1.run();
		t1.start();
		
		//run�� Ŭ������ ����� �޼ҵ带 ȣ���ؼ� ���� �����忡�� �۾�
		//start�� ���ο� �����带 ���� �װ����� �۾��� ������
	}

}
