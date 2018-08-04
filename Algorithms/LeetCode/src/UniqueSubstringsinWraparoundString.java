
public class UniqueSubstringsinWraparoundString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p = "eghiefgh";
		/*int count=0,sum=0,already=0;
		boolean a[]=new boolean [26];
		p=p+"#";
		int temp=0;
		for(int i=0;i<p.length()-1;i++){
			int x=(int)p.charAt(i);
			if(!a[x-97]){
				a[x-97]=true;
				if(already>0){
					sum-=getvalue(already);
					temp=0;
					already=0;
				}
			}
			else
			{
				already++;
				temp=1;
			}
			int r=p.charAt(i+1)-p.charAt(i);
			if(r==1||r==-25){
					count++;
			}
			else{
				count++;
				sum=sum+getvalue(count)-getvalue(already);
				count=0;
				already=0;
				temp=0;
			}
		}*/
int[] count = new int[26];
        
        // store longest contiguous substring ends at current position.
        int maxLengthCur = 0; 

        for (int i = 0; i < p.length(); i++) {
            if (i > 0 && (p.charAt(i) - p.charAt(i - 1) == 1 || (p.charAt(i - 1) - p.charAt(i) == 25))) {
                maxLengthCur++;
            }
            else {
                maxLengthCur = 1;
            }
            
            int index = p.charAt(i) - 'a';
            count[index] = Math.max(count[index], maxLengthCur);
        }
        
        // Sum to get result
        int sum = 0;
        for (int i = 0; i < 26; i++) {
            sum += count[i];
        }
		System.out.println(sum);
		
	}

	private static int getvalue(int count) {
		// TODO Auto-generated method stub
		
		return ((count)*(1+count))/2;
	}

}
