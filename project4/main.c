#include <stdio.h>
#include <stdlib.h>
int minold,maxold,min,max;
void minmax(int a[],int low,int high)
{
    int mid;
    if(low-high==0)
    {
        min=max=a[low];
    }
    else if(high-low==1)
    {
        min=a[low]<a[high]?a[low]:a[high];
        max=a[low]>a[high]?a[low]:a[high];
    }
    else
    {
        mid=(low+high)/2;
        minmax(a,low,mid);
        minold=min;
        maxold=max;
        minmax(a,mid+1,high);
        if(minold>min)
            minold=min;
        if(maxold<max)
            maxold=max;
    }
}
int main()
{
    int a[]={1,4,2,7,8,0};
    minmax(a,0,5);
    printf("%d%d",maxold,minold);

    return 0;
}
