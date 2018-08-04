import java.io.Serializable;

public class student implements Serializable{
	private int mat, sci, eng;
	private transient int total;
	public student() {
		
	}
	public student(int mat, int sci, int eng) {
		super();
		this.mat = mat;
		this.sci = sci;
		this.eng = eng;
		total = mat+sci+eng;
	}
	public void result() {
		System.out.println("Maths: "+mat );
		System.out.println("Science: "+sci);
		System.out.println("Englisg: "+eng);
		System.out.println("total: "+total);
	}
	
}
