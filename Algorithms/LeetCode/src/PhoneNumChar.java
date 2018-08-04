import java.awt.List;
import java.util.ArrayList;

public class PhoneNumChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="22";
		
		if(s.indexOf("1")>=0||s.equals(""))
			System.out.println("hello");
			
		ArrayList f=new  ArrayList();
		int stack[]=new int[2*s.length()];
		int top=-1;
		char a[][]=new char[][]{{},{},{'#','a','b','c','#'},{'#','d','e','f','#'},{'#','g','h','i','#'},{'#','j','k','l','#'},{'#','m','n','o','#'},{'#','p','q','r','s','#'},{'#','t','u','v','#'},{'#','w','x','y','z','#'}};
		int length[]=new int []{0,0,3,3,3,3,3,4,3,4};
		StringBuilder ans=new StringBuilder();
		for(int i=0;i<s.length();i++){
			int x=stack[++top]=(int)s.charAt(i)-'0';
			ans.append(a[x][1]);
			stack[++top]=1;
		}
		while(stack[1]!=length[(int)s.charAt(0)-'0']+1){
			if(a[stack[top-1]][stack[top]]!='#'){
				if(s.length()==(top+1)/2){
					while(a[stack[top-1]][stack[top]]!='#'){
						int r=(top-1)/2;
						char r1=a[stack[top-1]][stack[top]];
						ans.setCharAt(r, r1);
						String ans1=ans.toString();
						f.add(ans1);
						stack[top]++;
					}
				}
				else{
					ans.setCharAt((top-1)/2, a[stack[top-1]][stack[top]]);
					top+=2;
				}
			}
			else{
				stack[top]=1;
				top-=2;
				stack[top]++;
				ans.setCharAt((top-1)/2, a[stack[top-1]][stack[top]]);
			}
		}
		System.out.println(f.size());
	}

}
