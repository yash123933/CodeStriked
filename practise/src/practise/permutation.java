package practise;

public class permutation {
	static int count =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abdc";
		int n = str.length();
		permute(str, 0, n-1);
		//System.out.println(count);
	}
	private static void permute(String str, int l, int r)
	{
		if (l == r)
			System.out.println(str);
			//count++;
		else
		{
		for (int i = l; i <= r; i++)
			{
				str = swap(str,l,i);
				permute(str, l+1, r);
				//str = swap(str,l,i);
			}
		}
	}
	public static String swap(String a, int i, int j)
	{
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i] ;
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}


}
/*
 *permutation without recurring:http://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
 *permutation with recurring:http://www.geeksforgeeks.org/print-all-combinations-of-given-length/
 * 
 */
 */