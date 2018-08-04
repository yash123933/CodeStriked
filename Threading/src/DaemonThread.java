
public class DaemonThread extends Thread {
	private int limit;

	@Override
	public void run() {
		String name = currentThread().getName();
		for (int c = 1; c <= limit; c++)
			System.out.println(name + ":" + c);
	}

	public DaemonThread(String name, int limit) {
		super(name);
		this.limit = limit;
	}

	public static void main(String[] args) {
		DaemonThread t1 = new DaemonThread("dhiren", 50);
		DaemonThread t2 = new DaemonThread("yash", 25);
		DaemonThread t3 = new DaemonThread("priya", 70);
		DaemonThread t4 = new DaemonThread("Daemon", 5000000);
		t4.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
