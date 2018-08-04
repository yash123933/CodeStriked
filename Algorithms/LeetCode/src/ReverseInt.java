
public class ReverseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 50, sign = 0;
		String strNum = Integer.toString(num);
		if (num > 0) {
			sign = 1;
		} else if (num < 0) {
			sign = -1;
			num = sign * num;
		}
		int remain, newnum = 0;
		while (num != 0) {
			remain = num % 10;
			num = num / 10;
			newnum = newnum * 10 + remain;
		}
		System.out.println(newnum * sign);
		int a[] = { 8, 7, 6, 5, 4, 3, 2 };
		mergesortSplit(a, 0, 6);
		for (int i : a) {
			System.out.println(i);
		}
		
	}

	private static void insertionsort(int a[]) {
		int k, temp = 0;
		for (int i = 1; i < a.length; i++) {
			k = i;
			if (a[k] < a[k - 1])
				temp = a[k--];
			do {
				a[k + 1] = a[k];
				k--;
			} while (k > -1 && temp < a[k]);
			a[k + 1] = temp;
		}
		
	}

	private static void mergesortSplit(int a[], int l, int r) {
		int mid;
		if(l<r) {
			mid=(l+r)/2;
			mergesortSplit(a, l, mid);
			mergesortSplit(a, mid+1, r);
			mergesortMerge(a,l,mid,r);
		}
	}

	private static void mergesortMerge(int a[], int l,int mid,int r) {
		int lstart=l;
		int lend=mid;
		int rstart=mid+1;
		int rend=r,i=0,x=rend-lstart+1;
		int b[]=new int[x];
		while(lstart<=lend&&rstart<=rend) {    
			if(a[lstart]<=a[rstart]) {
				b[i++]=a[lstart++];
			}
			else {
				b[i++]=a[rstart++];
			}
		}
		if(lstart<=lend)
			while(lstart<=lend) {
				b[i++]=a[lstart++];
			}
		if(rstart<=rend)
			while(rstart<=rend) {
				b[i++]=a[rstart++];
			}
		for(int k : b)
			a[l++]=k;
	}

}
