import java.util.HashMap;

public class countSubsequence {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap< String, Integer> hm=new HashMap<String, Integer>();
		String s="babab";
		for(int i=0;i<s.length();i++)
			hm.put(Character.toString(s.charAt(i)), 1);
		//System.out.println(hm.get("b"));
		for(int i=1;i<s.length();i++){
			for(int j=0;j<s.length()-i;j++)
			{
				String r=s.substring(j, j+i+1);
				if(s.charAt(j)==s.charAt(j+i))
				{
					if(j+1>(j+i-1))
						hm.put(r,2);
					else
						hm.put(r, 2*hm.get(s.substring(j+1,j+i))+2);
				}
				else
				{
					if(j+1>(j+i-1)){
						hm.put(r, hm.get(s.substring(j,j+i))+hm.get(s.substring(j+1,j+i+1)));
						//System.out.println(hm.get(r));
					}
					else
						hm.put(r, hm.get(s.substring(j,j+i))+hm.get(s.substring(j+1,j+i+1))-hm.get(s.substring(j+1,j+i)));
				}
			}
		}
		System.out.println(hm.get(s));
	}
}