import java.awt.DisplayMode;

public class SyncDemo implements Runnable {
	public void run() {
		String name = Thread.currentThread().getName();
		display(name);
	}

	private Object dummy = new Object();

	public void display(String name) { // a synchronized block will not let another thread to gain the access object.
		System.out.println("Thread Enterd");

		synchronized (dummy) {
			try {
				System.out.print("[");
				Thread.sleep(1000);
				System.out.print(name);
				Thread.sleep(1000);
				System.out.println("]");
			} catch (InterruptedException e) {
			}
		}
		System.out.println("Thread exited");
	}

	public static void main(String[] args) {
		SyncDemo s1 = new SyncDemo();
		Thread t1 = new Thread(s1, "dhiren");
		Thread t2 = new Thread(s1, "priya");
		Thread t3 = new Thread(s1, "yash");
		t1.start();
		t2.start();
		t3.start();

	}
}//we can use wait notify and notifyall with synchronized block which is of object class.
