#include <stdio.h>
int main(){

    int a,b,c,d;
    printf("digite um ano \n");
    scanf("%d",&a);
    b=a%4;
    c=a%400;
    d=a%100;
            if(b == 0 || c==0 && d !=0){
        printf("bissesto");
    }else{
        printf("nao bissesto");
    }
    return 0;
    }
