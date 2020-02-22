#include<stdio.h>
#include<math.h>
int main(){
    int a,acumulador;
    printf("digite um numero ");
    scanf("%d, ",&a);
    acumulador=1;
    for(int i=2; i<=a; i++){
        acumulador= acumulador*i;

    }
    printf("%d",acumulador);
	return 0;
}
