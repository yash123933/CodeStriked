package college;

import java.util.Scanner;

public class leftR {
	static String a[] = new String[5];
	static int u=0;
	static String b[] = new String[5];
	public static void main(String[] args) {
		int set=0;
		System.out.println("Enter the number of grammer statements");
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		for(int i=0;i<n;i++){
			System.out.println("Enter a grammer ");
			a[i] = reader.next(); 
		}
		for(int i=0;i<n;i++){
			set=0;
			for(int j=1;j<a[i].length();j++){
				if(a[i].charAt(j-1)=='='||a[i].charAt(j-1)=='/')
				if(a[i].charAt(0)==a[i].charAt(j)){
					set=1;
					makeproper(a[i]);
				}
			}
			if(set==0)
				b[u++]=a[i];
		}
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
	}
	static void makeproper(String string) {
		// TODO Auto-generated method stub
		String c=null,d=null,root=String.valueOf(a[0].charAt(0));
		int r=0,start = 0;
		for(int i=2;i<string.length();i++){
			if(string.charAt(i)==string.charAt(0)){
				r=1;
				start=i;
			}
			else if(r==1){
				if(string.charAt(i)=='/')
				{
					r=0;
					c=string.substring(start+1, i);
					d=string.substring(i+1);
					break;
				}
			}
		}
		b[u++]=root+"="+d+root+"1";
		b[u++]=root+"1"+" = "+c+root+"1"+" /"+" [";
	}

}
