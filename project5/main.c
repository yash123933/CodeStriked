#include <stdio.h>
#include <stdlib.h>
struct knap
{
    float profit,weight;
}a[10];
float b[10];
int selectmin()
{
    int i,selected;
    float large=100.0;
    for(i=0;i<3;i++)
    {
        if(large>b[i])
        {
            selected=i;
            large=b[i];
        }
    }
    b[selected]=10000;
    return selected;

}
void knapsack(float bag)
{
    int i;
    float partialpro;
    while(bag!=0)
    {
        i=selectmin();
        if(bag>=a[i].weight)
        {
            bag=(bag-(a[i].weight));
            printf("\n%f\t%f\t1\n",a[i].profit,a[i].weight);
        }
        else
        {
            partialpro=(bag*(a[i].profit))/a[i].weight;
            printf("%f\t%f\t%f\n",partialpro,bag,(bag/a[i].weight));
            bag=0;
        }
    }
}
int main()
{
    int i;
    float bag=20;
    printf("Enter the weight & profit\n");
    for(i=0;i<3;i++)
    {
        scanf("%f%f",&a[i].weight,&a[i].profit);
        b[i]=a[i].weight/a[i].profit;
    }

    knapsack(bag);
    return 0;
}
