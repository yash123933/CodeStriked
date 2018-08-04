package practise;

public class numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        int arr[] = {1, 2, 3, 4, 5};
	        int r = 3;
	        int n = arr.length;
	        printCombination(arr, n, r,"",0);
	   }
	public static void printCombination(int arr[],int n,int r,String prefix,int l)
	{
		if(r==0){
			System.out.println(prefix);
		return;
		}
		else if(l==n)
			return;
		else
		{
			for(int i=l;i<n;i++)
			{
				String newprefix=prefix+arr[i];
				printCombination(arr, n, r-1, newprefix,i+1);
			}
		}
	}
}

/*
 * link:http://www.geeksforgeeks.org/print-all-combinations-of-given-length/
 */
*/