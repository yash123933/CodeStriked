
public class MyMainClass {
		// TODO Auto-generated constructor stub
		public static void main(String args[]) {
			Holder h=MySingleton.mymethod();
			h.viewStock();
			Broker b=MySingleton.mymethod();
			b.getStock();
			System.out.println(h==b);
		}
	}

	class MySingleton  {
		private static Stock myobj=null;
		private MySingleton() {
		}
		public static Stock mymethod() {
			if (myobj == null) 
				myobj = new Stock();
			return myobj;
		}
	}


interface Holder {
	void viewStock();
}

interface Broker extends Holder {
	void getStock();
}

interface Exchange extends Broker {
	void setStock();
}
class Stock implements Exchange{
	public void viewStock() {
		System.out.println("ViewStock");
	}
	public void getStock() {
		System.out.println("GetStock");
	}
	public void setStock() {
		System.out.println("SetStock");
	}
}
