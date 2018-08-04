
public class PartitiontoKEqualSumSubsets {

	public static void main(String[] args) {
		int nums[]=new int[]{7628,3147,7137,2578,7742,2746,4264,7704,9532,9679,8963,3223,21337792,5911,3979},sum=0,k=6;
		for(int i=0;i<nums.length;i++){
			sum+=nums[i];
		}
		int sumvalue;
		if(sum%k!=0)
			System.out.println("Faslse");
		else{
			sumvalue=sum/k;
			System.out.println(getNumberofSubsets(k,nums,sumvalue));
		}
	}

	private static boolean getNumberofSubsets(int k, int[] nums,int sumvalue) {
		int a[]=new int[10000],count=0;
		for(int i=0;i<nums.length;i++){
			int r=sumvalue-nums[i];
			if(r>0&&a[r]==0){
				a[nums[i]]++;
			}
			else{
				if(r>0)
					a[r]--;
				count++;
			}
		}
		if(count==k)
			return true;
		else 
			return false;
	}

}
