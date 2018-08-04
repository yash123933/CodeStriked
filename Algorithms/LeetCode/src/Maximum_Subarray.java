//kadanes algorithm.(to find maximum contigious subarray)
public class Maximum_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};
		int maxsofar=num[0];
		int maxendhere=0;
		for(int i=0;i<num.length;i++){
			maxendhere=maxendhere+num[i];
			if(maxsofar<maxendhere){
				maxsofar=maxendhere;
			}
			else if(maxendhere<0)
				maxendhere=0;
		}
		System.out.println(maxsofar);
	}

}
