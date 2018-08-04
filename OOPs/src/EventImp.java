
public class EventImp implements Event {
	@Override
	public void doSomething() {
		System.out.println("First event Implementation");
	}

	public static class InnerEventimpl implements Event { // A class inside another class

		@Override
		public void doSomething() {
			System.out.println("Second event Implementation");
		}

	}

	public void doingSomething() { // Aclass inside a method
		class InnerMostImpl implements Event {

			@Override
			public void doSomething() {
				System.out.println("Third event implementation");
			}
		}
		new InnerMostImpl().doSomething();
	}

	public void doingSomethingAgain() {
		new Event() {

			@Override
			public void doSomething() {
				// TODO Auto-generated method stub
				System.out.println("Forth event Implmentation");
			}
		}.doSomething();
	}

	public void doingSomethingOneLastTime() {
		Event e = () -> System.out.println("Fifth event Implementation");
		e.doSomething();
	}

	public static void main(String[] args) {
		EventImp impl = new EventImp();
		impl.doSomething();
		// InnerEventimpl innerimpl= impl.new InnerEventimpl(); if not static then
		InnerEventimpl innerImpl = new InnerEventimpl();
		innerImpl.doSomething();
		impl.doingSomething();
		impl.doingSomethingAgain();
		impl.doingSomethingOneLastTime();//lambda exp implementation
	}

}
