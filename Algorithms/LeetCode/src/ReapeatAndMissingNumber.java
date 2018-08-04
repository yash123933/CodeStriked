
public class ReapeatAndMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {1,2,2,4};
		/*for(int i=0;i<A.length;i++) {
			 A[i]=(int) Math.pow(A[i], 2);
		 }
		int total=0;
		for(int i=0;i<A.length;i++) {
			total+=A[i];
		}*/
		int b[]=repeatedNumber(A);
		System.out.println(b[0]+" "+b[1]);
		//System.out.println(total);

	}
	 public static int[] repeatedNumber(final int[] A) {
		 int b[]=new int[2];
		int y=A.length;
		
		int total=0;
		for(int i=0;i<A.length;i++)
			total+=A[i];
		
		 A[0]=A[0]*A[0];
		 for(int i=1;i<A.length;i++) {
			 A[i]=(int) Math.pow(A[i], 2)+A[i-1];
		 }
		 A[0]=0;
		 for(int i=1;i<=A.length;i++)	
			 A[0]+=i*i;
		 int x=A[0]-A[A.length-1];
		 int z=0;
		 for(int i=1;i<=A.length;i++)
			 z+=i;
		 int a,u;
		 for(int i=0;i<=A.length;i++) {
			if((Math.sqrt(x+i*i))%1==0) {
				a=i;
				u=(int) Math.sqrt(x+i*i);
				if(total==(z+i-u)) {
					b[0]=i;
					b[1]=u;
					break;
				}
				
			}
		 }
		 
		 return b;
	 }

}
