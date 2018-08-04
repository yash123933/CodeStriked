package college;

import java.util.Scanner;

public class operator_presedance {
	static int a[][]=new int [][]{{123,1,1,1,1},{0,1,1,0,1},{0,1,1,0,1},{0,1,1,1,1},{0,0,0,0,123}};
	public static void main(String[] args) {
		char array[] = new char[10];
		int top=0;
		array[0]='$';
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String grammer=sc.next();
		grammer+="$";
		for(int i=0;i<grammer.length();i++){
			if(myfunction(array[top],grammer.charAt(i))==0&&top>-1){
				array[++top]=grammer.charAt(i);
			}
			else
			{
				if(myfunction(array[top],grammer.charAt(i))==123&&top>-1){
					break;
				}
				while(myfunction(array[top],grammer.charAt(i))==1&&top>-1){
					top--;
				}
				if(myfunction(array[top],grammer.charAt(i))==1&&top>-1){
					array[++top]=grammer.charAt(i);
				}
			}
		}
		if(array[top]=='$')
			System.out.println("Accepted");
		
	}
	static int myfunction(char op1, char op2){
		int val1 = 0,val2 = 0;
		if(op1=='A')
			val1=0;
		if(op2=='A')
			val2=0;
		if(op1=='$')
			val1=4;
		if(op2=='$')
			val2=4;
		if(op1=='+')
			val1=1;
		if(op2=='+')
			val2=1;
		if(op1=='-')
			val1=2;
		if(op2=='-')
			val2=2;
		if(op1=='*')
			val1=3;
		if(op2=='*')
			val2=3;
		return a[val1][val2];
	}
}
