
public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]=new int[]{6,5,2,1,4,1};
		int temp1=nums[0],avvai = 0;
		int temp2=nums[1];
		for(int i=2;i<nums.length;i++){
			avvai=temp2;
			temp2=temp1+nums[i];
			temp1=(avvai>temp1?avvai:temp1);
		}
		//System.out.println(temp1);
		//System.out.println(temp2);
		System.out.println(temp1>temp2?temp1:temp2);
	}

}
