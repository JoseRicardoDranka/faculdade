#include <stdio.h>
int main(){

    int a,b;
    printf("digite um numero \n");
    scanf("%d",&a);
    b=a%2;
    if ( b== 0 ){
        printf("seu numero e par");
    }else{
        printf("seu numero e impar");
    }
return 0;

}
