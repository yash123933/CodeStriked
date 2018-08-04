package practise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class ZigZag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String v=convert(s,1);
		System.out.println(v);
	}
	
@SuppressWarnings("null")
public static String convert(String s, int numRows) {
    /*int r=((numRows-1)*(s.length())),initial=0,length=0,strlength=s.length(),i=0,set=0;
    int x=(numRows/2);
    		r/=(numRows+x);
    		String final1="";
    char a[][]=new char[numRows][r+2];
    while(length!=strlength){
    	a[i][initial]=s.charAt(length++);
    	if(set==0&&i<numRows)
    		i++;
    	if(i==numRows&&set==0){
    		if(i-2>=0)
    		i-=2;
    		else
    			i--;
    		set=1;
    		initial++;
    	}
    	else if(set==1&&i>0)
    	{
    		if(length!=strlength)
    		initial++;
    		i--;
    	}
    	else if(i==0&&set==1){
    		set=0;
    		i++;
    	}
    }
    
    for(i=0;i<numRows;i++)
    	for(int j=0;j<=initial;j++)
    		if(a[i][j]!='\u0000')
    		final1+=Character.toString(a[i][j]);
    		*/
    //int c[]=new int[]{1,3,2,7,4,5};
    //Arrays.sort(c);
    //int key=2;
    //System.out.println(Arrays.binarySearch(c,12));
	//for(int k:s.toCharArray())
		//System.out.println(k);
	//Stack<Integer> stack=new Stack<Integer>();
	//stack.push(5);
	//if(!stack.isEmpty())
	//System.out.println(stack.peek());
    
    String a="12345",b="1";
    a= a.substring(0, 2);
    System.out.println(a);
	return "final1";
}
}
