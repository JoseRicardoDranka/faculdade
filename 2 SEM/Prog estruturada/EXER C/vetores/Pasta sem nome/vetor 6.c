#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int main(){
    srand(time(NULL));
    int v1[50],i;
    int par=0,impar=0;
    for(i=0;i<50;i++){
        v1[i]=rand()%11;
    }
    for(i=0;i<50;i++){
        if(v1[i]%2==0){
            par=par+1;
        }else{
            impar=impar+1;
        }
    }
    int v2[par],v3[impar];

    for(i=0;i<par;i++)
            if(v1[i]%2==0){
                v2[i]=v1[i];
            }else{
                v3[i]=v1[i];
            }
    printf("raiz [");
    for(i=0;i<50;i++){
        printf(" %d",v1[i]);
    }
    printf("]\n");
    printf("par [");
    for(i=0;i<par;i++){
        printf(" %d",v2[i]);
    }
    printf("]\n");
    printf("impar [");
    for(i=0;i<impar;i++){
        printf(" %d",v3[i]);
    }
    printf("]\n");
    printf("%d\n",impar);
    printf("%d",par);
    return 0;

    }
