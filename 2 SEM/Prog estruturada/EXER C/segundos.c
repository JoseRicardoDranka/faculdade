#include <stdio.h>
void main(){
    int hora,minutos,segundos,total;
    printf("digite as horas\n");
    scanf("%d",&hora);
    printf("digite as minutos\n");
    scanf("%d",&minutos);
    printf("digite as segundos\n");
    scanf("%d",&segundos);
    hora=(hora*60)*60;
    minutos=minutos*60;
    total=hora+minutos+segundos;
    printf("%d",total);


    return 0;
}
