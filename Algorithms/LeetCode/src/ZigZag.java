
public class ZigZag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String final1=convert("A",1);
			System.out.print(final1);
	}
	public static String convert(String s, int numRows) {
        String final1="";
        int rowlength=numRows,totalLength=s.length(),firstAndLast=0,adding,diff=2;
		for(int i=1;i<rowlength;i++)
			firstAndLast+=2;
		adding=firstAndLast-2;
		if(firstAndLast==0)
			firstAndLast=1;
		for(int i=0;i<totalLength;i+=firstAndLast)
			final1+=s.charAt(i);
		for(int i=1;i<rowlength-1&&i<totalLength;i++){
			final1+=s.charAt(i);
			for(int j=i+adding;j<totalLength;j+=adding)
			{
				final1+=s.charAt(j);
				j+=diff;
				if(j<totalLength)
					final1+=s.charAt(j);
			}
			diff+=2;
			adding-=2;
		}
		for(int i=rowlength-1;i<totalLength&&i>0;i+=firstAndLast)
			final1+=s.charAt(i);
	
		return final1;
    }

}
