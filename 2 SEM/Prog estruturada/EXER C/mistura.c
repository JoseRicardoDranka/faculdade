#include <stdio.h>
void main(){
    float gasolina,alcool,total;
    printf("qual o valor da gasolina\n");
    scanf("%f",&gasolina);
    printf("qual o valor do alcool\n");
    scanf("%f",&alcool);
    total=gasolina*0.25+alcool*0.25;
    printf("%f",total);

    return 0;
}
