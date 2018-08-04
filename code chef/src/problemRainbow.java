
public class problemRainbow {

	public static void main(String[] args) {
		int t=1,m=3,n=3,pass=0,count=0,selected=0;
		int a[][]=new int [][]{
		{0,1,2},{1,0,3},{2,3,0}
		};
		for(int i=0;i<t;i++)
		{
			for(int j=0;j<m;j++){
				for(int k=0;k<n;k++){
					if(k!=j){
					for(int l=0;l<n;l++){
						if(l!=j&&l!=k){
							selected=0;
						if(a[j][l]==a[j][k]||a[l][k]==a[j][k]){
							selected=1;
							break;
						}
					}
					}
					if(selected==0)
						pass++;
				}
				}
				if(pass>=2)
					count++;
				pass=0;
			}
		}
		System.out.println(count);
	}

}
