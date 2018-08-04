#include <stdio.h>
#include <stdlib.h>
struct krus{
    int node1,node2;
    int cost;
}a[10];
int minimum(int visited[],int n)
{
    int i,min=4000,selected;
    for(i=1;i<=n;i++)
    {
        if(min>a[i].cost&&visited[i]==0)
        {
            min=a[i].cost;
            selected=i;
        }

    }
    return selected;
}
int allvisited(int v[],int n)
{
    int i,counter=1;
    for(i=1;i<=n;i++)
    {
        if(v[i]==0)
             counter=0;
    }
    return counter;
}
void Kruskal(int n)
{
    int i,temp,r1,r2;
    int visited[10]={0},root[]={0,1,2,3,4,5,6,7,8,9},rootNode[10]={0};
    while(allvisited(visited,n)!=1)
    {
        i=minimum(visited,n);
        r1=root[a[i].node1];
        r2=root[a[i].node2];
        if(visited[i]==0&&r1!=r2)
        {
            temp=a[i].node2;
            while(root[temp]>root[temp-1]&&temp>1)
            {
                root[a[i].node2]=root[temp-1];
                temp--;
            }
            printf("%d %d %d  ",a[i].node1,a[i].node2,a[i].cost);
        }
        visited[i]=1;
    }
}
int main()
{
    a[1].cost=6;a[1].node1=1;a[1].node2=2;
    a[2].cost=2;a[2].node1=2;a[2].node2=3;
    a[3].cost=3;a[3].node1=1;a[3].node2=3;
    Kruskal(3);
    return 0;
}
