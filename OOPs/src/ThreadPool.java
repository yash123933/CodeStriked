/*
 * Introduced in java 6. Thread pool will have a n numbers of threads running concurrently.
 */
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread running from pool");
	}
	public static void main(String[] args) {
		ThreadPool rable =new ThreadPool();
		ExecutorService service=Executors.newFixedThreadPool(10);
//		Executor pool=Executors.newFixedThreadPool(10);
		for(int i=0;i<=10;i++)
			service.execute(rable);
		service.shutdown();
	}
	
}	
