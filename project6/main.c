#include <stdio.h>
#include <stdlib.h>
void lcs(int a[10][10],int b[],int c[],int n,int m)
{
    int i,j;
    for(i=0;i<n;i++)
    {
        a[0][i]=0;
    }
    for(i=0;i<m;i++)
    {
        a[i][0]=0;
    }
    for(i=1;i<=m;i++)
    {
        for(j=1;j<=n;j++)
        {
            if(b[i-1]==c[j-1])
                a[i][j]=a[i-1][j-1]+1;
            if(b[i-1]!=c[j-1])
                a[i][j]=a[i-1][j]>a[i][j-1]?a[i-1][j]:a[i][j-1];
        }
    }
}
void display(int a[10][10],int b[],int c[],int n,int m)
{
    int i=m,j=n;
    while(i!=0&&j!=0)
    {
        while(a[i-1][j]!=a[i][j-1])
            j--;
        printf("%d",b[i-1]);
        i--;
        j--;
    }
}
int main()
{
    int a[10][10]={0},b[3]={3,4,5},c[6]={1,2,3,4,5,6},i,j;
    lcs(a,b,c,6,3);
    display(a,b,c,6,3);
    /*for(i=0;i<=3;i++){
    for(j=0;j<=6;j++)
    {
        printf("%d",a[i][j]);
    }
    printf("\n");
    }*/
    return 0;
}
