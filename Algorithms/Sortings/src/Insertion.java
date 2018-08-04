
public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[]{2,1,12,5,6,0};
		for(int i=1;i<a.length;i++)
		{
			int j=i;
			while(j>0&&a[j]<a[j-1]){
				int temp=a[j-1];
				a[j-1]=a[j];
				a[j--]=temp;
			}
		}
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}

}
