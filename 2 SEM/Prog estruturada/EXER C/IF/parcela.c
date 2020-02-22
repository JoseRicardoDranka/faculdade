#include <stdio.h>
int main(){

    float a,b,c;
    printf("digite seu salario \n");
    scanf("%f",&a);
    printf("digite o valor da parcela");
    scanf("%f",&b);
    c=a*0.2;
    if (b < c){
        printf("aprovado");
        }
    else{

        printf("reprovado");
        }
    return 0;

}
