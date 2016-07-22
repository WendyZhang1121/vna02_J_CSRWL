package vna02_J_CSRWL;

public class TestThread implements Runnable {

	public void run() {	
		Flag test = new Flag();
		test.toggle();
     	System.out.println(test.getFlag());
	}
	public static void main(String[] args) throws Exception { 
		
		TestThread t = new TestThread();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
	}
}
