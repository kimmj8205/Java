
public class Run implements Runnable {
	private String threadname;
	
	public Run(String str)
	{
		threadname = str;
	}
	
	public void run() {
		for(int i=0; i<50; i++) {
			System.out.print(Thread.currentThread().getName()+" "+i);
			System.out.println(" " + i*i);
		}
	}

	public static void main(String[] args) {
		Run p = new Run("Thread-0");
		Thread t1 = new Thread(p);
		t1.run();
		t1.start();
		
		//Thread�� Ŭ�����̱� ������ �ٸ� Ŭ������ ��ӹ��� �� ������
		//Runnable�� �������̽��̱� ������ ������ �ϸ� �ǰ� �ٸ� Ŭ������ ��ӹ��� �� �ִ�.
	}

}
