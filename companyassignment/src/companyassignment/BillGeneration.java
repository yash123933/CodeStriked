package companyassignment;

public class BillGeneration {

	public static void main(String[] args) {
		ElectricityBill bill1 = new ElectricityBill(10, "abc","bhandup");
		ElectricityBill bill2 = new ElectricityBill(11, "xyz","Mulund");
		ElectricityBill bill3 = new ElectricityBill(11,"xyz","Mulund");
		
		System.out.println(bill1);
		System.out.println(bill2);
		System.out.println(bill3);
		
		System.out.println(bill1.equals(bill2));
		System.out.println(bill2.equals(bill3));
		
		System.out.println("Hashcode of bill1 : "+bill1.hashCode());

	}

}
