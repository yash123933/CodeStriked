
public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
String s="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
int length=s.length();
		/*s="#"+s;
	
		int initial=1,status=1,i;
		String ans1="",ans2="";
		for(i=2;i<s.length();i++){
			if((i-initial)>-1&&s.charAt(i-initial)==s.charAt(i))
			{
				if(status==1)
				ans1=Character.toString(s.charAt(i))+ans1+Character.toString(s.charAt(i));
				else
				{
					status=1;
					ans1=Character.toString(s.charAt(i))+""+Character.toString(s.charAt(i));
				}
				initial+=2;
			}
			else if(s.charAt(i-2)==s.charAt(i)&&ans1.length()<=3){
				initial=1;
				status=1;
				ans1=Character.toString(s.charAt(i-2))+Character.toString(s.charAt(i-1))+""+Character.toString(s.charAt(i));
				initial+=3;
			}
			else if(status==1)
			{
				initial=1;
				status=0;
				if(ans2.length()<ans1.length()){
					ans2=ans1;
					ans1="";
				}
			}
			else {
				status=0;
				initial=1;
			}
		}
		if(i==s.length()&&ans2.length()<ans1.length())
			ans2=ans1;
		System.out.println(ans2);*/
int len=0,reallength=0,j,start = 0,r=1;
	for(int i=0;i<length;i++){
		int k=i;
		len=0;
		r=1;
		for(j=length-1;j>k;j--)
		{
			if(s.charAt(k)==s.charAt(j)){
				k++;
				len+=2;
				if(j-k==1)
					len++;
			}
			else{
				k=i;
				/*if(reallength<len){
					reallength=len;
					start=i;
				}*/
				len=0;
				j=length-r;
				r++;
			}
		}
		if(len!=0)
			if(reallength<len){
				reallength=len;
				start=i;
			}
		
	}
	//System.out.println(reallength);
	if(s1.equals(s.substring(start, start+reallength))){
		System.out.println("hello world");
	}
	//System.out.println(s.substring(start, start+reallength));
	}
	
}






