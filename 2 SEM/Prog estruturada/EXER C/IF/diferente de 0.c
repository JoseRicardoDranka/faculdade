#include <stdio.h>
int main(){

    int a,b,c,d;
    printf("digite um numero \n");
    scanf("%d",&a);
    printf("digite outro numero");
    scanf("%d",&b);
    printf("digite outro numero");
    scanf("%d",&c);

    if (a != 0){
        d=b+c;
        printf("a soma e %d",d);
        }
    else{
                d=b*c;
                printf("a multiplicaçao e %d",d);
        }
    return 0;

}
