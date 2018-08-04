package practise;

import java.util.Scanner;

public class Two_characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String string=sc.next(),ne = "$";
		int v[]=new int [26];
		int o[]=new int [26];
		for(int i=1;i<string.length();i++){
			if(string.charAt(i)==string.charAt(i-1)&&string.length()>1)
				v[(int)string.charAt(i)-97]=1;
		}
		
		for(int i=0;i<string.length();i++){
			if(v[(int)string.charAt(i)-97]==0&&string.length()>1){
				ne+=Character.toString(string.charAt(i));
			}
		}
		for(int i=1;i<ne.length();i++){
			if(ne.length()>1)
			o[(int)ne.charAt(i)-97]++;
		}
		int selected1,selected2,highest1=0,highest2=0;
		for(int i=0;i<26;i++){
			if(o[i]>highest1)
			{
				highest2=highest1;
				highest1=o[i];
				
			}
			else if(o[i]>highest2&&o[i]<=highest1)
				highest2=o[i];
		}
		if(highest1==highest2+1||highest1==highest2)
		System.out.println(highest1+highest2);
		else
		System.out.println(0);	
	}
}
