#include <stdio.h>
#include <stdlib.h>
#define inf 1000
int allVisit(int visited[],int n)
{
    int flag=1,i;
    for(i=1;i<n;i++)
    {
        if(visited[i]==0)
        {flag=0;break;}
    }
    return flag;
}
void tsp(int array[10][10],int n)
{
    int visited[10]={0},counter=0,b[10]={0},k=0,i,selected,min=inf;
    while(allVisit(visited,n)==0)
    {
        for(i=1;i<n;i++)
        {
            if(((array[i][counter]+b[k])<min)&&visited[i]==0&&counter!=i)
            {
                selected=i;
                min=array[i][counter]+b[k];
            }
        }
        visited[selected]=1;
        counter=selected;
        b[++k]=min;
        min=inf;
    }
    b[++k]=array[0][counter]+b[k-1];
    printf("%d",b[k]);
}
int main()
{
    printf("Enter the number of rows");
    int array[4][4]={{0,5,4,3},{2,0,4,2},{9,3,0,2},{6,4,2,0}},n=4,i,j;
    tsp(array,4);

    return 0;
}
