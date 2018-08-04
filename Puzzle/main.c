#include <stdio.h>
#include <stdlib.h>
#define X 0
int b[10]={0};
int k=0,new_i=0,new_j=2;

void puzzle(int cur_i,int cur_j,int a[3][3],int sum)
{
    if(a[cur_i][cur_j]==X||a[cur_i][cur_j]==a[new_i][new_j]){
        if(a[cur_i][cur_j]==a[new_i][new_j])
            b[k++]=sum;
        return;
    }
    else
    {
        if(cur_i-1>=0&&cur_j>=0&&a[cur_i-1][cur_j]!=X)
        {
            a[cur_i][cur_j]=X;
            sum+=1;
            puzzle(cur_i-1,cur_j,a,sum);
        }
        if(cur_i+1>=0&&cur_j>=0&&a[(cur_i+1)%3][(cur_j)%3]!=X&&cur_i+1<3)
        {
            a[cur_i][cur_j]=X;
            sum+=1;
             puzzle(cur_i+1,cur_j,a,sum++);
        }
        if(cur_i>=0&&cur_j-1>=0&&a[(cur_i)%3][(cur_j-1)%3]!=X)
        {
            a[cur_i][cur_j]=X;
            sum+=1;
            puzzle(cur_i,cur_j-1,a,sum++);
        }
        if(cur_i>=0&&cur_j+1>=0&&a[(cur_i)%3][(cur_j+1)%3]!=X&&cur_j+1<3)
        {
            a[cur_i][cur_j]=X;
            sum+=1;
            puzzle(cur_i,cur_j+1,a,sum++);
        }

    }
}
int main()
{
    int a[3][3]={{1,1,2},{X,1,1},{1,1,1}},sum=0;


    puzzle(2,0,a,sum);
    printf("%d%d",b[k-2],b[k-1]);
    return 0;
}
