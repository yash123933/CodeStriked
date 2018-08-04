/*
 * Shoot The Balloon
Showndarya is going to The Gregg County Fair with her family this weekend. There is a balloon shooting game here, like there is in every other fair. But the rules of this game are different. A participant has to shoot balloons, each of which is labeled with lowercase alphabetic letters. A participant has to shoot exactly k balloons the letters of which form an increasing subsequence. Also the subsequence formed should be lexographically smallest of all the increasing subsequences that are formed from the given set of balloons. The participant has to shoot the balloons from left to right. The participant will get points, which is the sum of positions of all the balloons he/she shoots from the given set of balloons. There is no guarantee that such a sequence will always be formed. In that case the participant's points will be -1, eventhough its not the participant's fault. Showndarya is participating in this game and she is given a set of balloons to shoot. Can you find out, which balloons she will shoot and how much points she will score.

Input:
First line contains T. T testcases follow.
Each test case contains 2 integers n and k which is the no of balloons in the set and the no of balloons to be shot.
The next line contains a sequence of n characters which is the letter labeled on each of the n balloons.

Output:
For each test case print the letters on the balloons Showndarya will shoot and the points she will score. 

Constraints:
1 <= T <= 100
1 <= n,k <=104

Example:

Input:
2
7 2
lakshmi
10 7
mastermind

Output:
ah 7
-1

Explanation:
Test Case 1:
For the given test case, the increasing subsequence of length k i.e 2 are: "lm","ak","as","ah","am","ai","ks","km","hi","hm". "ah" is the subsequence of length 2, which is lexographically the smallest of all the increasing subsequences from the above subsequences. Therefore Showndarya scores 2+5=7 points.

Test Case 2:
There is no increasing subsequence formed when you move from left to right. Hence the answer is -1.
 */
package practise;
import java.util.Scanner;
public class Problem_Kjscoe2 {

	public static void main(String[] args) {
		System.out.println("Enter the test cases");
		Scanner sc=new Scanner (System.in);
		int smallest=10000000;
		int T=sc.nextInt();
		int n=sc.nextInt();
		int k=sc.nextInt();
		String text=sc.next();
		String string;
		for(int i=0;i<text.length();i++){
			string=null;
			string=Character.toString(text.charAt(i));
			for(int j=i+1;j<text.length();j++){
				if(text.charAt(j)-text.charAt(i)>0&&string.length()<k){
					string+=text.charAt(j);
				}
				if(string.length()==k){
					/*int c=(int)string.charAt(string.length()-1)-(int)string.charAt(0);
					if(smallest>c)
						smallest=c;
					string=null;
					string=Character.toString(text.charAt(i));*/
				}
			}
			
		}
		if(smallest==10000000)
			smallest=-1;
		System.out.println(smallest);
	}

}
