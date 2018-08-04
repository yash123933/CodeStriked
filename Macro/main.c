#include<stdio.h>
#include<string.h>
struct mdt
{
	char s1[10],s2[10],s3[10],s4[10];
};
struct mnt
{
	int pointer;
	char name[20];
};
struct ala
{
	char index[10];
	char arg[7];
};
/*int getmdtpos(char r[10]){
    int p=0;
    while(1){
        if(strcmp(md[p].s3,r)==0){
            break;
        }
        p++;
    }
    return p;
}*/
void main()
{
	int stat=1,n,i,mntc=1,mdtc=1,mdtp=0,j,z=0,q,p=0,f=0;
	char str1[10]="", str2[10]="", str3[10]="",str4[10]="",st1[10]="",st2[10]="",st3[10]="",st4[10]="";
	struct ala a[3]={"",""},a1[3]={"",""};;
	char t;
	struct mnt mn[4];
	struct mdt md[10];
	FILE *fp,*ft,*fr;
	fp = fopen("macro1.txt", "r");
	char ch,string[10][10],c[3];
	int k=0,y,r=0;
	printf("\n");
	while(!feof(fp))
	{
        fscanf(fp, "%s", str1);
        if (strcmp(str1,"MACRO")==0){
                y=0;
        }
        else{
            if(strcmp(str1,"L")==0||strcmp(str1,"A")==0){
                fscanf(fp, "%s %s ",str2, str3);
                strcpy( md[k].s1,str1);
    			strcpy( md[k].s2,str2);
    			sprintf(c,"#%d",k);
    			strcpy( md[k].s3,c);
    			k++;
            }

            else if(strcmp(str1,"MEND")==0){
                strcpy( md[k].s1,str1);
    			strcpy( md[k].s2,"0");
    			strcpy( md[k].s3,"");
                break;
            }

            else{
                while(1){
                    if(y==0)
                    {
                        y++;
                        strcpy( mn[r].name, str1);
                        //strcpy( mn[r].pointer,"1");
                        r++;
                    }
                    fscanf(fp, "%s", string[z]);
                    strcpy( a[z].arg, string[z]);
                    sprintf(c,"#%d",z);
                    strcpy( a[z].index, c);
                    z=z+1;
                    t=getc(fp);
                    if(t=='\n')
                        break;
                }
        }
    }

	}

    while(!feof(fp)){
        fscanf(fp, "%s", str1);
        //stat=ifpresent(str1);
        if(stat==1){
            while(1&&p<=z){
                if(strcmp(a[p].arg,"")==0)
                    break;
                fscanf(fp, "%s", string[z]);
                //val=getmdtpos(a[p].arg);
                strcpy( a1[p].arg, string[z]);
                strcpy( a1[p].index,a[p].index);
                p=p+1;
                t=getc(fp);
                if(t=='\n')
                    break;
            }
        }
    }

    printf("******************mdt**************\n");
    for(i=0;i<=k;i++)
        printf("%s\t%s\t%s\n",md[i].s1,md[i].s2,md[i].s3);
    printf("******************mnt**************\n");
    for(i=0;i<r;i++)
        printf("%s\t 0\n",mn[i].name);
	printf("******************ala1**************\n");
	for(i=0;i<z;i++)
        printf("%s\t%s\n",a[i].arg,a[i].index);
        printf("******************ala2**************\n");
	for(i=0;i<p;i++)
        printf("%s\t%s\n",a1[i].arg,a1[i].index);
	}
/*
Output:
******************mdt**************
L       1       #0
A       1       #1
MEND    0
******************mnt**************
INCR     0
******************ala1**************
ARG1    #0
ARG2    #1
******************ala2**************
DATA1   #0
DATA2   #1

Process returned 2 (0x2)   execution time : 0.031 s
Press any key to continue.
*/
