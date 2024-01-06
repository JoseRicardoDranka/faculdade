#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int main(){
    srand(time(NULL));
    int v1[20],v2[20],v3[20],v4[20],v5[20],i;
    for(i=0;i<20;i++){
        v1[i]=rand()%20+1;
    }
    for(i=0;i<20;i++){
        v2[i]=rand()%20+1;
    }
    for(i=0;i<20;i++){
        if(v1[i]!=v2[i]){
            v3[i]=v1[i];
        }
    }
    for(i=0;i<20;i++){
        v4[i]=v1[i]+v2[i];
    }
    for(i=0;i<20;i++){
        v5[i]=v1[i]*v2[i];
    }
    printf("[");
    for(i=0;i<20;i++){
        printf("%d ",v1[i]);
    }
    printf("]\n");
    printf("[");
    for(i=0;i<20;i++){
        printf("%d ",v2[i]);
    }
    printf("]\n");
    printf("[");
    for(i=0;i<20;i++){
        printf("%d ",v3[i]);
    }
    printf("]\n");
    printf("[");
    for(i=0;i<20;i++){
        printf("%d ",v4[i]);
    }
    printf("]\n");
    printf("[");
    for(i=0;i<20;i++){
        printf("%d ",v5[i]);
    }
    printf("]");

return 0;
}
