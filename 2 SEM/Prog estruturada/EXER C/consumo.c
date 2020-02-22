#include <stdio.h>
void main(){
    float tempo,media,total,distancia;
    printf("quanto tempo vc ta dirigindo\n");
    scanf("%f",&tempo);
    printf("qual sua velocidade media\n");
    scanf("%f",&media);
    distancia=tempo*media;
    total=distancia/12;
    printf("vc consumiu %f",total,"litros de combustivel");

return 0;
}
