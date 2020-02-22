#include <stdio.h>
void main(){
    float custo,desconto,total;
    printf("qual o custo total");
    scanf("%f",&custo);
    printf("qual o desconto");
    scanf("%f",&desconto);
    desconto=custo*(desconto/100);
    total=custo-desconto;
    printf("%f",total);



    return 0;
}
