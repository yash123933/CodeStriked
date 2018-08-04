package practise;
import java.util.Scanner;
public class just_Strings {
	public static int top=0;
	public static String s;
	public static char stack[];
	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		s=c.next();
		stack=new char[s.length()];
		stack[top]='$';
		for(int i=0;i<s.length();i++)
		{
			if(stack[top]==s.charAt(i))
				pop();
			else
				push(i);
		}
		for(int i=1;i<=top;i++)
			System.out.print(stack[i]);
				
	}
	static void push(int i)
	{
		stack[++top]=s.charAt(i);
	}
	static void pop(){
		top--;
	}

}
