
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String in="yabbsh";
		int i=0,j=in.length()-1;
		char ex[]=in.toCharArray(),tempx;
		while(i<j) {
			tempx=ex[i];
			ex[i]=ex[j];
			ex[j]=tempx;
			i++;j--;
		}
		System.out.println(ex);
	}

}
