#include<stdio.h>
int main(){
    int v[10],i;

    for (i=0; i<10;i++){
        scanf ("%d",&v[i]);
    }
    printf("[");
    for(i=9; i>=0; i--){
    printf(" %d", v[i]);
    }
    printf("]\n");
return 0;
}
