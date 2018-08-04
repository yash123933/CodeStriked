package practise;

import java.util.Scanner;

public class Roman2Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int sum=romanToInt(s);
		System.out.println(sum);
	}
	public static int romanToInt(String s) {
        int sum=0,val1=choice(s.charAt(0)),val2=0,len=s.length();
        for(int i=0;i<len;i++)
        {
            if((i+1)<len)
                val2=choice(s.charAt(i+1));
            if(val1>=val2){
                sum+=(val1);
                val1=val2;
            }
            else
            {
                sum+=(val2-val1);
                i+=1;
                val1=choice(s.charAt(i+1));
            }
            
        }
        return sum;
    }
    public static int choice(char i)
    {
        if(i=='C')
            return 100;
        else if(i=='D')
            return 500;
        else if(i=='L')
            return 50;
        else if(i=='M')
            return 1000;
        else if(i=='X')
            return 10;
        else if(i=='V')
            return 5;
        else if(i=='I')
            return 1;
        else
            return 0;
    }

}
