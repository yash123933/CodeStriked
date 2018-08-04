
public class Quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[]{2,4,10,5,6,1};
		quicksort(a,0,5);
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
	public static void quicksort(int a[],int start,int end){
		int k=start;
		int j=start-1;
		if(start<end)
		{
			while(k<end)
			{
				if(a[k]<a[end])
				{
					int temp=a[k];
					a[k]=a[++j];
					a[j]=temp;
				}
				k++;
			}
			int temp=a[++j];
			a[j]=a[end];
			a[end]=temp;
			quicksort(a, start, j-1);
			quicksort(a, j+1, end);
		}
	}
	

}
