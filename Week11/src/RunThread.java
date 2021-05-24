
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
		
		//run은 클래스에 선언된 메소드를 호출해서 현재 쓰레드에서 작업
		//start는 새로운 쓰레드를 만들어서 그곳에서 작업을 수행함
	}

}
