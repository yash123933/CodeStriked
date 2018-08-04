    #include <stdio.h>
#include <stdlib.h>
void display(int place[],int n)
{
    int i;
    for(i=1;i<=n;i++)
        printf("%d",place[i]);
        printf("\n");
}
int check(int place[],int visited[],int r,int n,int i)
{
    int counter=1,pre;
    pre=(place[r-1]+r-1);
    if(visited[i]==0&&pre!=(r+i))
    {
        if(r==1&&i==1)
        counter=0;
        else if((pre+2)!=r+i)
            counter=0;
    }

    return counter;
}
void Nqueens(int place[],int visited[],int n,int r)
{
    int i=1,c;
    do
    {


        if(check(place,visited,r,n,i)==0)
        {
            //c=place[r];
           // visited[c]=0;
            place[r]=i;
            visited[i]=1;
            if(r==n)
            display(place,n);
            else
            Nqueens(place,visited,n,r+1);
        }
        else if(i>=n){
                c=place[r-1];
            visited[c]=0;
            return;
        }
    }while(i<=n);
}
int main()
{
    int n=4,i;
    int place[10]={0},visited[10]={0};
    Nqueens(place,visited,n,1);
    return 0;
}
