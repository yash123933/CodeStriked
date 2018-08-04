#include <stdio.h>
#include <stdlib.h>
int n;
int sendMinimum(int arival,int a[],int b[],int max)
{
    int min=2000,i,selected;
    for(i=0;i<n;i++)
    {
        if(b[i]!=0&&a[i]<=arival&&min>b[i])
        {
            selected=i;
            min=b[i];
        }

    }
    return selected;
}
void calculate(int a[],int b[],int count,int max)
{
    int i,selected;
    for(i=0;i<count;i++)
    {
        selected=sendMinimum(i,a,b,max);
        b[selected]--;
        printf("%d: %d/%d\n",i,selected,b[selected]);
    }
}
int main()
{
    int i,a[10],b[10]={0},count=0,max;
    printf("Enter the number of process");
    scanf("%d",&n);
    printf("Enter the arrival time and burst time");
    for(i=0;i<n;i++)
    {
        scanf("%d%d",&a[i],&b[i]);
    }
    for(i=0;i<n;i++)
    {
        count+=b[i];
    }
    max=a[n-1];
    calculate(a,b,count,max);
    return 0;
}
