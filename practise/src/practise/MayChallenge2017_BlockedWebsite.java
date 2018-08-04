/*
 * Blocked websites
 * Mike is a network administrator in a university. One of his primary responsibilities in the job is to create an effective firewall so that the students are not able to visit the blocked sites in the network.

The network have access to exactly N sites. Some of these can be blocked. The names of the sites will be given in lowercase English letters.

The firewall will consist of several filters. A filter is a string that should be a prefix of some blocked site, and it should not be a prefix of any unblocked site. You want to minimize the sum of length of filters in the firewall so that for each of the blocked site, there should be a filter that contains the name of blocked site(filter is a prefix of blocked site).

Input
The first line of the input contains an integer N denoting the number of sites in the network.

Then N lines follow, each of them describes the site. Each line starts from the char С. If the site is unblocked, С is equal to '+', otherwise С is equal to '-'., followed by a string denoting the name of the site.

Output
If it is not possible to choose set of filters and satisfy all constraints, output a single line containing an integer -1.

Otherwise, in the first line print the number of filters K in the firewall. Then print K lines, in each line print the chosen filter. Please dislpay them in lexicographical order. You can prove that answer will be unique.

Constraints
1 ≤ N ≤ 2 * 105
The sum of lengths of names of sites does not exceed 2*105
No two sites have same name.
Subtasks
Subtask #1 (30 points) 1 ≤ N, the sum of lengths of names of sites ≤ 3 * 103
Subtask #2 (70 points) Original constraints
Example
Input:
4
- codeforces
+ codechef
- youtube
+ google

Output:
2
codef
y
 */
package practise;

import java.util.Scanner;

public class MayChallenge2017_BlockedWebsite {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int count=0;
		String web[]=new String[N];
		String ans[]=new String[N];
		for(int i=0;i<N;i++){
			String a=sc.next();
			String b=sc.next();
			web[i]=a+b;
		}
		for(int i=0;i<N;i++){
			int selected=0,d=web[i].length()-1;
			int current=2;
			if(web[i].charAt(0)=='-'){
				for(int j=0;j<N;j++){
					String a = null,b = null;
					int c=web[j].length()-1;
					if(current<c&&current<d){
					a=web[j].substring(1, current);
					b=web[i].substring(1, current);}
					if(a!=null&&a.equals(b)){
						int k;
						for(k=current;k<web[j].length()&&k<web[i].length();k++){
							if(web[i].substring(1,current).equals(web[j].substring(1, current))&&web[j].charAt(0)=='+')
								current++;
							else
							{	selected=1;
								break;
							}
						}
						if(k==web[i].length())
							selected=0;
					}
				}
				if(selected==1)
				ans[count++]=web[i].substring(1, current);
			}
		}
		if(count>0){
			System.out.println(count);
		for(int i=0;i<count;i++){
			System.out.println(ans[i]);
		}
		}
		else
			System.out.println("-1");
	}
}
