
public class MyRunnable implements Runnable {

	private int data;
	public void run() {
		String name=Thread.currentThread().getName();
		for(int c=1;c<=50;c++)
		{
			System.out.println(name+": "+ ++data);
		}
		
	
	}
	public static void main(String[] args) {
		MyRunnable mr= new MyRunnable();
		Thread t1 = new Thread(mr,"First");
		Thread t2 = new Thread(mr,"First");
		Thread t3 = new Thread(mr,"First");
		
		t1.start();
		t2.start();
		t3.start();

		
	}
}
