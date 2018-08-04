
public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ar="cdd",ans="",ansreal="";
		//ar+="#";
		for(int i=0;i<ar.length();i++){
			if(ans.indexOf(ar.charAt(i))==-1){
				ans+=ar.charAt(i);
			}
			else {
				if(ansreal.length()<ans.length())
					ansreal=ans;
				ans=ans.substring(ans.indexOf(ar.charAt(i))+1);
				ans+=ar.charAt(i);
			}
			
		}
		if(ansreal.length()<ans.length())
			ansreal=ans;
		System.out.println(ansreal);
	}

}
