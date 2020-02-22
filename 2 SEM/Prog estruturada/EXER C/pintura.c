#include <stdio.h>
void main(){
    float a,b,c,d,e,f,total;
    printf("qual a largura da parede\n");
    scanf("%f",&a);
    printf("qual a altura da parede\n");
    scanf("%f",&b);
    printf("qual a largura da janela\n");
    scanf("%f",&c);
    printf("qual a altura da janela\n");
    scanf("%f",&d);
    e=a*b;
    f=c*d;
    total=e-f;
    printf("o total a ser pintado e:%f", total,"m²");

return 0;
}
