
public class longestCommonPrefix {

	public static void main(String[] arg) {
		// TODO Auto-generated method stub
		String final1="",args[]={"","yar","yfgh"};
		int min = 10000,status=1;
		int lastvalue=0;
		for(int i=0;i<args.length;i++)
		{
			if(min>args[i].length())
				min=args[i].length();
		}
		if(min==10000)
			min=0;
		lastvalue=min;
		for(int i=0;i<min&&status==1;i++){
			for(int j=0;j<args.length-1;j++){
				if(args[j].charAt(i)!=args[j+1].charAt(i)){
					lastvalue=i-1;
					status=0;
					break;
				}
			}
			if(status==0)
                final1=args[0].substring(0, lastvalue+1);
			else if(status==1&&i+1==min)
				final1=args[0].substring(0, i+1);
		}
		System.out.println(final1);
	}

}
