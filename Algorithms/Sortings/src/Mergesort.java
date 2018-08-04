public class Mergesort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[]{2,2,0,5,6,0};
		Merge(a,0,5);
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
	public static void Merge(int a[],int l,int r){
		if(r-l<1)
		{	
		}
		else
		{
			int mid=(l+r-1)/2;
			Merge(a,l,mid);
			Merge(a,mid+1,r);
			sort(a,l,mid,r );
		}
	}
	private static void sort(int[] a, int l, int mid, int m) {
		int k=l ,n=mid+1;
		int b[]=new int [10];
		for(int i=l;i<=m;i++){
			if(k<=mid&&n<=m&&a[k]<=a[n])
				b[i]=a[k++];
			else if(n<=m&&k<=mid)
				b[i]=a[n++];
			else if(k<=mid)
				b[i]=a[k++];
			else if(n<=m)
				b[i]=a[n++];
		}
		for(int i=l;i<=m;i++)
			a[i]=b[i];
	}
}
