package pac1;

import java.util.*;

class Pract   {
	public static void main(String[] args) throws Exception { 
		 Prac prac=new Prac();
		 prac.run("hello");
}
}
class Prac{
	int x=12;
	void run(String m) throws Exception {
		
			throw YashNewException(m);
		
	}
	
	private Exception YashNewException(String m) {
		// TODO Auto-generated method stub
		System.out.println("Congrats your new exception "+ m);
		return null;
	}
}

