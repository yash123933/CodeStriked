package practise;

import java.util.Scanner;

public class Gotham_pd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int Q=sc.nextInt();
		int key[]=new int [1000000];
		int conn[]=new int [1000000];
		for(int i=0;i<N-1;i++)
		{
			int u=sc.nextInt();
			int v=sc.nextInt();
			int k=sc.nextInt();
			conn[u]=v;
			key[u]=k;
		}
		int exor=0;
		for(int i=0;i<Q;i++)
		{
			int type=sc.nextInt();
			if((type^exor)==0){
				int u=sc.nextInt();
				int v=sc.nextInt();
				int k=sc.nextInt();
				conn[u^exor]=v^exor;
				key[u^exor]=k^exor;
				
			}
			else
			{
				int v=sc.nextInt()^exor;
				int k=sc.nextInt()^exor;
				
				
			}
		}
		
	}

}
