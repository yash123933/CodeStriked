
public class Shell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[]{2,11,12,5,8,1},i;
		int div=(a.length)/2;
		while(div>=1){
			i=0;
			while((i+div)<a.length){
				if(a[i]>a[i+div])
				{
					int temp=a[i];
					a[i]=a[i+div];
					a[i+div]=temp;
					int k=i;
					while(k>=div&&k-div>=0){
						if(a[k]<a[k-div])
						{
							temp=a[k];
							a[k]=a[k-div];
							a[k-div]=temp;
						}
						k--;
					}
				}
				i++;
			}
			if(div==1)
				div=-1;
			else
				div=div/2;
		}
		for(int j=0;j<a.length;j++)
			System.out.println(a[j]);
	}
}
