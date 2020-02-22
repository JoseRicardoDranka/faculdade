#include <stdio.h>
int main(){

    int a,b,c,d;
    printf("digite um numero \n");
    scanf("%d",&a);
    b=a%3;
    c=a%8;
    d=b+c;
    if(d == 0){
        printf("divisivel");
    }else{
        printf("nao e divisivel");
    }
    return 0;
    }
