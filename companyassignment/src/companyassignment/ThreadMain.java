package companyassignment;

public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenThread t1 = new EvenThread();
		OddThread t2 = new OddThread();
		t1.start();
		for (int i = 0; i <= 10; i++)
			System.out.println("Main Thread: " + i);
		t2.start();

	}

}

class EvenThread extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i += 2)
			System.out.println("Even Thread: " + i);
	}
}

class OddThread extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i += 2)
			System.out.println("Odd Thread: " + i);
	}
}
