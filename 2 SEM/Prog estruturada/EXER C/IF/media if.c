#include <stdio.h>
int main(){

    int a,b,c,d,e;
    printf("digite a nota 1\n");
    scanf("%d",&a);
    printf("digite a nota 2\n");
    scanf("%d",&b);
    printf("digite a nota 3\n");
    scanf("%d",&c);
    printf("digite a nota 4\n");
    scanf("%d",&d);
    e=(a+b+c+d)/4;
        if (e >= 6){
        printf("aprovado");
        }
        else{
        printf("reprovado");
        }
    return 0;

}
