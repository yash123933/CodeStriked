package practise;
import java.util.Scanner;
public class Problem_kjscoe2_2 {
	static Scanner sc=new Scanner (System.in);
	static int T=sc.nextInt(),count=0;
	static int n=sc.nextInt();
	static int k=sc.nextInt();
	static String text=sc.next(),store[]=new String[1000];
	public static void main(String[] args) {
		int a[][]=new int [1000][n];
		for(int i=0;i<text.length();i++)
		{
			String s=Character.toString(text.charAt(i));
			subsequence(i,s,1);
		}
		for(int i=0;i<count;i++){
			System.out.println(store[i]);
		}
		int smallest=0;
		/*for(int i=0;i<n;i++){
			a[smallest][i]=(int)store[0].charAt(i);
		}*/
		int i,j;
		for(i=1;i<count;i++)
		{
			for(j=0;j<k;j++){
				if((int)store[smallest].charAt(j)>(int)store[i].charAt(j))
					break;
			}
			if(j<=k-1){
				smallest=i;
			}
		}
		System.out.println(store[smallest]);
		//System.out.println((int)store[smallest].charAt(1)-(int)store[smallest].charAt(0));
	}
	public static int subsequence(int i,String s,int set){
		if(set!=1){
			s+=text.charAt(i);
		}
		if((s).length()==k){
			store[count++]=s;
			return 0;
		}
		else{
			for(int j=i+1;j<text.length();j++){
				int c=(int)s.charAt(s.length()-1)-(int)text.charAt(j);
				if(c<0){
					subsequence(j,s,0);
				}
			}
			return 0;
		}
	}
}

