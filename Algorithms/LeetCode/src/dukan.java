
public class dukan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double interest=0,initial_ammount=2000000;
		for(int i=0;i<139;i++){
			interest=(double)(initial_ammount*0.005);
			initial_ammount+=interest;
			//initial_ammount-=5000;
		}
		System.out.println(initial_ammount);
		/*initial_ammount+=9100000/3+8530000/3;
		initial_ammount=7476859-2700000;
		double average=(5900000+2700000+2300000)/3;
		initial_ammount+=(average-2700000);
		System.out.println(initial_ammount);
		//System.out.println(2700000/139);
		
		
		
		double interest1=0,initial_ammount1=2000000;
		for(int i=0;i<139;i++){
			interest1=(double)(initial_ammount1*0.005);
			initial_ammount1+=interest1;
			//initial_ammount-=5000;
		}
		initial_ammount1+=9100000/3+8530000/3;
		initial_ammount1=9877150-2300000;
		double average1=(5900000+2700000+2300000)/3;
		initial_ammount1+=(average1-2300000);
		System.out.println(initial_ammount1);*/
	}

}
