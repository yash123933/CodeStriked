/*
Vinitra wanted to watch attack of the Titans. Her dad hates anime. He has asked Vinitra to solve a problem in order to watch the anime.
Vinitra is given a tree of N nodes. Node 1 is the root. Each node has a value assigned to it. Vinitra has to perform two queries on the tree: 
Query 1: find and print sum of all values of all nodes on a path from node u to v. It is of the form 1 u v
Query 2: change value of node u to x. It is of the form 0 u x

Can you help her?
Input:
First line contains T. T testcases follow.
First line of each test case contains N - number of nodes, Q - number of Queries
Next N-1 lines contain two space seperated integers u and v denoting an edge between them
Next line contains N values denoting the values of the ith node
Next Q lines contain queries of the form 1
Output:
For each testcase, print the desired result for Query 1

Constraints:
1 <= T <= 10
1 <= N, Q, X <=103

1 <= U, V <= N
Example:
Input:
1
6 7
1 2
2 4
2 5
1 3
3 6
1 1 2 1 2 2
1 4 6
0 4 5
1 4 6
0 6 9
1 4 6
0 2 4
1 1 1
Output:
7
11
18
1
 */
package practise;
import java.util.Scanner;

public class problem_kjscoe {
	static Scanner sc=new Scanner (System.in);
	static int T=sc.nextInt(),N=sc.nextInt(),Q=sc.nextInt();
	static int []gr=new int[N+1];
	static int value[]=new int[N+1];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of test cases");
		gr[1]=1;
		for(int i=1;i<=N-1;i++)
		{
			int first=sc.nextInt();
			int second=sc.nextInt();
			gr[second]=first;
		}
		System.out.println("Enter the node value");
		for(int i=1;i<=N;i++)
			value[i]=sc.nextInt();
		int i;
		for(i=1;i<=Q;i++);
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			if(a==1){
				findpath(b,c,N);
			}
			else if(a==0)
				value[b]=c;
		}
	}
	
	public static void findpath(int node1,int node2,int N){
		int current1=node1,current2=node2,sum=0,node = node1,visited[]=new int[N+1];
		while(node!=1){
			sum+=value[node];
			visited[node]=sum;
			node=gr[node];
		}
		sum+=value[node];
		visited[node]=sum;
		node=node2;
		sum=0;
		while(node!=1&&visited[node]==0){
			sum+=value[node];
			node=gr[node];
		}
		sum+=visited[node];
		System.out.println(sum);
	}
}
