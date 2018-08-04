
public class Heap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[]{8,15,7,2,1,4,5,12,9};
		for(int i=0;i<a.length;i++){
			heapify(a,0,(a.length-i-1));
			int temp=a[0];
			a[0]=a[a.length-i-1];
			a[a.length-i-1]=temp;
		}
		for(int j=0;j<a.length;j++)
			System.out.println(a[j]);
	}
	static void heapify(int a[],int start,int end){
		int i=0,temp;
		while(i<(end+1)/2&&end>=2*i+2){
			if(a[i]<=a[2*i+1]&&a[2*i+1]>=a[2*i+2])
			{
				temp=a[i];
				a[i]=a[2*i+1];
				a[2*i+1]=temp;
				int k=i;
				while(k!=0){
					if(a[(k-1)/2]<a[k]){
						temp=a[(k-1)/2];
						a[(k-1)/2]=a[k];
						a[k]=temp;
					}
					k=(k-1)/2;
				}
			}
			else if(a[i]<=a[2*i+2]&&a[2*i+1]<=a[2*i+2]){
				temp=a[i];
				a[i]=a[2*i+2];
				a[2*i+2]=temp;
				int k=i;
				while(k!=0){
					if(a[(k-1)/2]<a[k]){
						temp=a[(k-1)/2];
						a[(k-1)/2]=a[k];
						a[k]=temp;
					}
					k=(k-1)/2;
				}
			}
			i++;
		}
	}
}
