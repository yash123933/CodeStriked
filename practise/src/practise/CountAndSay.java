package practise;

import java.util.Scanner;

public class CountAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ans=sc.nextInt(),current=1,count=0;
		 //int ans=n,current=1,count=0;
	        String previous="",next="1";
			char holding;
	        //if(ans==1)
	            //return "1";
			while(current!=ans){
				previous=next;
				next="";
				holding=previous.charAt(0);
				if(holding!=0)
					count=1;
				for(int i=1;i<previous.length();i++){
					if(holding==previous.charAt(i)){
						count++;
					}
					else
					{
						next+=(Integer.toString(count)+Character.toString(holding));
						holding=previous.charAt(i);
						count=1;
					}
				}
				if(count>0)
					next+=(Integer.toString(count)+Character.toString(holding));
				count=0;current++;
			}
		System.out.println(next);
	}
}
