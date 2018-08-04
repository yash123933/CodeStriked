
public class TwoKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=65,sum=0,i;
		while(n!=1){
			int x=(int)Math.sqrt(n); 
			for(i=2;i<=x;i++){
				if(n%i==0){
					n=n/i;
					sum+=i;
					break;
				}
				
			}
			if(i==x+1){
				sum+=n;
				n=n/n;
			}
			/*if(n%2==0){
				n=n/2;
				sum+=2;
			}
			else if(n%3==0){
				n=n/3;
				sum+=3;
			}
			else if(n%5==0){
				n=n/5;
				sum+=5;
			}
			else if(n%7==0){
				n=n/7;
				sum+=7;
			}
			else{
				sum+=n; 
				n=n/n;
			}*/
		}
		System.out.println(sum);
	}

}
