
public class DeleteAndEarn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[]{2,2,1,3,3,3,4,4};
		int b[]=new int[10];
		for(int i=0;i<a.length;i++){
			b[a[i]]+=a[i];
		}
		int pre=0;
		for(int i=2;i<=9;i++){
			if(b[i]+b[i-2]>b[i]+pre){
				b[i]+=b[i-2];
			}
			else
				b[i]+=pre;
			pre=pre>b[i-2]?pre:b[i-2];
		}
		System.out.println(b[9]>b[8]?b[9]:b[8]);
	}

}
