public class ThreadYield {
	static class HelloThread extends Thread {

		@Override
		public void run() {
			while (true) {
				System.out.println("Hello");
				yield();
//				try {
//					Thread.sleep(1);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
			}
		}
	}

	static class WorldThread extends Thread {
		public void run() {
			while (true) {
				System.out.println("world");
				yield();
//				try {
//					Thread.sleep(1);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
			}
		}
	}

	public static void main(String[] args) {
		HelloThread hello = new HelloThread();
		hello.start();
		WorldThread worldThread = new WorldThread();
		worldThread.start();
	}
}
