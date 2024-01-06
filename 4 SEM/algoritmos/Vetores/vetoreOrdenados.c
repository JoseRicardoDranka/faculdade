#include<stdio.h>
#include<stdlib.h>

int main(){
    int v1[5],v2[5],v3[10],i=0,j=0,k=0;
    
    v1[0]=0;
    v1[1]=5;
    v1[2]=7;
    v1[3]=9;
    v1[4]=15;
    v2[0]=1;
    v2[1]=2;
    v2[2]=4;
    v2[3]=77;
    v2[4]=80;

    while(i<5 && j<5){
        if(v1[i]<v2[j]){
            v3[k]=v1[i];
            i++;
            k++;
        }else{
            v3[k]=v2[j];
            j++;
            k++;
        }
    }
    if(i==5){
        for (j;j<5;j++){
            v3[k]=v2[j];
            k++;
        }
    }if(j==5){
        for(i;i<5;i++){
            v3[k]=v2[i];
            k++;
        }
    }

    for(k=0;k<10;k++){
        printf("|%d|",v3[k]);
    }
    return 0;
}