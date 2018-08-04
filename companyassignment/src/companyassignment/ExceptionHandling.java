package companyassignment;

public class ExceptionHandling {

	public static void main(String[] args)// throws InterruptedException
	{
		// TODO Auto-generated method stub
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			throw new MyThreadException("interrupted");

		}
	}
}

class MyThreadException extends RuntimeException {
	MyThreadException(String message) {
		super(message);
	}
}
