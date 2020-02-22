#include <stdio.h>
int main(){

    int a,b,c,d;
    printf("digite um numero \n");
    scanf("%d",&a);
    printf("digite um numero \n");
    scanf("%d",&b);
    printf("digite um numero \n");
    scanf("%d",&c);
    if(a>c && a>b){
        printf("e maior q os dois");
    }else{
        printf("nao e maior q os dois");
    }
    return 0;
    }
