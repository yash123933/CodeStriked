package practise;

import java.util.Scanner;

public class corces {
	public static int working=0,sum=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*Scanner sc=new Scanner(System.in);
	        int T=sc.nextInt();
	        for(int i=0;i<T;i++){
	            int N=sc.nextInt();
	            int K=sc.nextInt();
	            int P=sc.nextInt(),a[]=new int[N],b[]=new int[N];
	            for(int j=0;j<N;j++)
	            {
	                a[j]=sc.nextInt();
	            }
	            for(int j=0;j<N;j++)
	            {
	                b[j]=sc.nextInt();
	            }
	            if(a[i]<=b[i]){
	                working=0;
	                sum=a[0];
	            }
	            else{
	                sum=b[0];
	                working=1;
	            }*/
	            equal();
	            //colg(a, b, N, K, P);
	        }
	
	        public static void colg(int a[], int b[], int N, int K, int P){
	        	int w[]=new int[N];
	        	int visited[]=new int[N];
	        	int index[][]=new int[N][N];
	        	for(int i=0;i<N-1;i++)
	        	{
	        		for(int j=i+1;j<N&&j<=i+K;j++){
	        			index[i][j]=1;
	        		}
	        	}
	        	if(working==0)
	        		w[0]=a[0];
	        	else
	        		w[0]=b[0];
	        		int initial=0;
	        	while(w[N-1]==0){
	        		for(int i=0;i<N;i++){
	        			if(index[initial][i]==1){
	        				if(working==0)
	        				{
	        					if(a[i]<b[i]+P)
	        						w[i]=a[i]+w[initial];
	        					else{
	        						w[i]=b[i]+P+w[initial];
	        						working=1;
	        						}
	        				}
	        				else{
	        					if(b[i]<a[i]+P)
	        						w[i]=b[i]+w[initial];
	        					else{
	        						w[i]=a[i]+P+w[initial];
	        						working=0;
	        					}
	        				}
	        					
	        					
	        			}
	        		}
	        		w[initial]=100000000;
	        		initial=getMinValue(w,N);
	        	}
	        	System.out.println(w[N-1]);
	        }
        public static int getMinValue(int a[],int N){
        	int min=100000000,selected=0;
	        	for(int i=0;i<N;i++){
	        		if(a[i]!=0&&min>a[i]){
	        			min=a[i];
	        			selected=i;
	        		}
	        	}
	        	return selected;
	        }
        public static void equal(){
        	int i=1;
        	while(16960>Math.pow(2,i)){
        		i++;
        	}
        	i-=1;
        	System.out.println(Math.pow(2, i));
        }
			
}
