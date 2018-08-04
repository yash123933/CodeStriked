package companyassignment;

public interface TouchScreenLaptop {
	void Scroll();
	void Click();
}
abstract class Hp implements TouchScreenLaptop{
	public void Scroll() {
		System.out.println("Scroll method of Hp");
		
	}
	 public abstract void Click();
}
class HPNotebook extends Hp{

	@Override
	public void Click() {
		System.out.println("Click method of HPNotebook");
		
	}
	
}
abstract class DELL implements TouchScreenLaptop{
	public void Scroll() {
		System.out.println("Scroll method of DELL");
		
	}
	 public abstract void Click();
}
class DELLNotebook extends DELL{

	@Override
	public void Click() {
		System.out.println("Click method of DELLNotebook");
		
	}
	
}
class setup {

	public static void main(String[] args) {

		DELLNotebook click1=new DELLNotebook();
		click1.Click();
		click1.Scroll();
		HPNotebook click2=new HPNotebook();
		click2.Click();
		click2.Scroll();
				
	}

}