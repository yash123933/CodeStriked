/*
 * Though our Head Chef retired from sport programming long back, but that did not affect his passion to contribute to the programming community. He still remains engaged by creating new problems and passing it on to the online judges. Last Night, he thought of a following problem for which he could not figure out a solution. You being his friend from the older days of programming decide to help him.

Find the number of non-empty subsequences in the given list of N integers such that the product of the values in the subsequences does not exceed K

Input
First line of the input will contain two space separated integers N and K. Next and last line of the input contains N space separated integers

Output
Print the answer to the given test case in a separate line.

Constraints
1 ≤ N ≤ 30
1 ≤ K, Ai ≤ 10^18
Subtasks
Subtask #1 : (30 points)

1 ≤ N ≤ 10
Subtask #2 : (70 points)

1 ≤ N ≤ 30
Example
Input:
3 4
1 2 3

Output:
5
 */
package practise;

import java.util.Scanner;

public class ChefandSubsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		long a[]=new long[N];
		long b[]=new long[200];
		for(int i=0;i<N;i++)
			a[i]=sc.nextLong();
		b[0]=a[0];
		int count=1,ans=0,t=1;
		for(int i=1;i<N;i++){
			int k=0;
			while(k<t){
				b[count++]=b[k++]*a[i];
			}
			b[count++]=a[i];
			t=count;
		}
		for(int i=0;i<count;i++)
			if(b[i]>K)
				ans++;
		System.out.println(count-ans);
	}

}
