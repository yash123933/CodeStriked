
public class Car {
	private String model;
	private String[] features;
	public Car(String model, String...features) {
	
		this.model = model;
		this.features = features;
	}
	public void specs()
	{
		System.out.println("\nFeatures of: "+model);
		for(String feature : features)
			System.out.print(feature+" ");

	}
	public static void main(String[] args) {
//		String[] altof= {"alto","Dhiren","yash","window","handle"};
		Car alto= new Car("alto","Dhiren","yash","window","handle");
		alto.specs();
//		String[] jazzf= {"alto","Dhiren","yash","window","handle"};
		Car jazz= new Car("jazzf","power","abs","pano roof","gear");
		jazz.specs();
		
	}
	
	
	
}
