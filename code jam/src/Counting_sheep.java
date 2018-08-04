
public class Counting_sheep {
	static int a[] =new int[]{0,0,0,0,0,0,0,0,0,0};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num="1234567",z;
		z=num;
		int t=1,k=0,q,r=1;
		for(int i=0;i<t;i++){
			while(check()==0){
				if(num.equals("0")!=true)
			while(k<num.length()){
				q=((int)num.charAt(k))-48;
				a[q]=1;
				k++;
			}
			k=0;
			num=String.valueOf(++r*Integer.parseInt(z));
			}
		}
		System.out.println(Integer.parseInt(num)-Integer.parseInt(z));
	}
	static int check(){
		 
	}
}
