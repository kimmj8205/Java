
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
		
		//Thread는 클래스이기 때문에 다른 클래스를 상속받을 수 없지만
		//Runnable은 인터페이스이기 때문에 구현만 하면 되고 다른 클래스를 상속받을 수 있다.
	}

}
