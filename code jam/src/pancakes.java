
public class pancakes {
static  String a="++-+";
	public static void main(String[] args) {
		int pass=0,t=0,q=-1;
		
		while(true){
			for(int i=0;i<a.length();i++){
				if(a.charAt(i)=='+'){
					if(a.charAt(++i)=='-'){
						t++;
						pass++;
						break;
					}
				}
				if(a.charAt(i)=='-'){
					q++;
				}
			}
			if(pass==0&&q==-1)
				System.out.println("0");
			else if(pass!=0){
				shift(i);
			}
			else if(pass==0&&q>-1)
				shift(q);
		}
	}

}
