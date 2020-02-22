#include <stdio.h>
int main(){

    int a,b,c,d;
    printf("digite um numero \n");
    scanf("%d",&a);
    printf("digite um numero \n");
    scanf("%d",&b);
    printf("digite um numero \n");
    scanf("%d",&c);
    if(a>c || b>c){
        printf("um deles e maior");
    }else{
        printf("nunhum deles e maior");
    }
    return 0;
    }
