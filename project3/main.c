#include <stdio.h>
#include <stdlib.h>
int partition(int a[],int low,int high)
{
    int curr_i=-1,curr_j=0,pivot=a[high],temp;
    while(curr_j<high)
    {
        if(a[curr_j]<pivot)
        {
            curr_i++;
            temp=a[curr_i];
            a[curr_i]=a[curr_j];
            a[curr_j]=temp;
            curr_j++;
        }
        else
            curr_j++;
    }
    ++curr_i;
    temp=a[curr_i];
    a[curr_i]=a[high];
    a[high]=temp;
    return curr_i;
}
void quickSort(int a[],int low,int high)
{
    int p;
    if(low<high)
    {
        p=partition(a,low,high);
        quickSort(a,low,p-1);
        quickSort(a,p+1,high);
    }
}
int main()
{
    int a[]={4,2,1,5,8,0,16,3},i;
    quickSort(a,0,7);
    for(i=0;i<8;i++)
    printf("%d",a[i]);
    return 0;
}
