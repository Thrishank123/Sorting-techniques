#include<stdio.h>
int main()
{
    int n,i,temp,y;
    printf("Number of elements:\n");
    scanf("%d",&n);
    int a[n];
    printf("Enter elements in the Random Order: \n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++)
    {
        for(y=i;y>=0;y--){
        if(a[y]>a[y+1])
        {
           temp=a[y];
           a[y]=a[y+1];
           a[y+1]=temp; 
        }
        else
        break;
        }
    }
    printf("sorted array :\n");
    for(i=0;i<n;i++){
        printf("%d\n",a[i]);
    }
    return 0;

    
}