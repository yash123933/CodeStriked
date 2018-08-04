public class problem1 {
	public static void main(String[] args) {
		int t=1;
		for(int i=0;i<t;i++){
			int m=1,n=4,l,u,r=1,d=1;
			l=n;
			u=m;
			String input="LLRRRR";
			for(int j=0;j<input.length();j++){
				if(input.charAt(j)=='L')
					l--;
				if(input.charAt(j)=='U')
					u--;
				if(input.charAt(j)=='R')
					r++;
				if(input.charAt(j)=='D')
					d++;
			}
			if(l>0&&u>0&&r<=n&&d<=m)
				System.out.println("safe");
			else
				System.out.println("unsafe");	
		}
	}
}
