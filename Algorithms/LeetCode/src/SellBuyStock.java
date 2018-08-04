
public class SellBuyStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []prices=new int[]{2, 10, 1, 3, 8};
		int min=0,max=0,lmin=prices[0],lmax=prices[0];
		for(int i=1;i<prices.length;i++){
			if(lmin<prices[i]&&lmax<prices[i]){
				lmax=prices[i];
			}
			else if(lmin>prices[i]){
				if(max-min<lmax-lmin){
					min=lmin;
					max=lmax;
				}
				lmin=lmax=prices[i];
			}
		}
		System.out.println(max-min<lmax-lmin?lmax-lmin:max-min);
		//System.out.println(lmin+" "+lmax);
		//System.out.println(min+" "+max);
		
	}

}
