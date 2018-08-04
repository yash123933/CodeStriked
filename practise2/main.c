#include <stdio.h>
#include <stdlib.h>
void mergeSort(int a[],int low ,int high)
{
    int mid;
    if(low<high)
    {
        mid=(low+high)/2;
        mergeSort(a,low,mid);
        mergeSort(a,mid+1,high);
        merge(a,low,mid,high);
    }
}
void merge(int a[],int low,int mid,int high){
    int temp,i,j;
    for(i=low;i<high;i++)
        for(j=mid+1;j<=high;j++)
        if(a[i]>a[j])
    {
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
int main()
{
    int a[]={4,2,1,5,8},i;
    mergeSort(a,0,4);
    for(i=0;i<5;i++)
    printf("%d",a[i]);
    return 0;
}
