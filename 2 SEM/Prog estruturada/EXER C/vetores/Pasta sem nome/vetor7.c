#include<stdio.h>

int main(){
    int v1[5],v2[5],v3[10],i,k=0;

    for(i=0;i<5;i++){
        scanf("%d",v1[i]);
    }
    for(i=0;i<5;i++){
        scanf("%d",v2[i]);
    }
    for(i=0;i<10;i++){
        if(i<5){
            v3[i]=v1[i];
        }else{if(i>5 && i<10){
                k=k+1;
                v3[i]=v2[k];
            }
        }
    }
    printf("%d",v3);
    return 0;
    }
