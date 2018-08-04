package companyassignment;

public class ElectricityBill {
	int meterNo;
	String name;
	String address;
	public ElectricityBill(int meterNo, String name, String address) {
		// TODO Auto-generated constructor stub
		this.meterNo = meterNo;
		this.name = name;
		this.address = address;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return meterNo;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		ElectricityBill bill=(ElectricityBill) obj;
		if(this.meterNo==bill.meterNo)
			return true;
		else
			return false;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = "Meter No : "+meterNo+" \nName = "+name+"\nAddress = "+address+"\n\n";
		return str;
	}

}
