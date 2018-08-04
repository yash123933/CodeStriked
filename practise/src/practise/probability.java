package practise;
import java.util.*;
public class probability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		convert(s,3);
	}
	public static boolean isPalindrome(String s) { 
		 int total=s.length(),top=0;
		 char a[]=new char[1000000];
	        if(total%2!=0)
	            return false;
	        for(int i=0;i<total;i++){
	        	char x=s.charAt(i);
	        		if(x=='(')
	        			a[top++]=')';
	        		else if(x=='[')
	        			a[top++]=']';
	        		else if(x=='{')
	        			a[top++]='}';
	        	else
	        	{
	        		if(top>0){
	        			if(x==a[top-1])
	        				top--;
	        		}
	        		else
	        			return false;
	        	}
	        }
	        return true;
	}
	public static boolean isValid(String s) {
	       int total=s.length(),top=0;
			 char a[]=new char[1000000];
		        if(total%2!=0)
		            return false;
		        for(int i=0;i<total;i++){
		        	char x=s.charAt(i);
		        		if(x=='(')
		        			a[top++]=')';
		        		else if(x=='[')
		        			a[top++]=']';
		        		else if(x=='{')
		        			a[top++]='}';
		        	else
		        	{
		        		if(top>0){
		        			if(x==a[top-1])
		        				top--;
		        		}
		        		else
		        			return false;
		        	}
		        }
		        System.out.println(top);
		        if(top<=0)
			        return true;
	            else
	                return false;
	    }
	
}
