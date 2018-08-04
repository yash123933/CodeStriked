
public class roman2number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String roman="";
		int ans=0;
		for(int i=0;i<roman.length();i++){
			if(roman.charAt(i)=='M'){
				ans+=1000;
			}
		}
	}

}
