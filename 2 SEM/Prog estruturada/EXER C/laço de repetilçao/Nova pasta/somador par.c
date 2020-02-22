#include<stdio.h>
#include<math.h>
int main(){
    int a,b,c,cont=1;
    printf("digite um numero ");
    scanf("%d, ",&a);
    printf("digite um numero");
    scanf("%d",&b);

    for(int i=0; i<b; i++){
        cont=cont*a;
    }
    printf("\n%d",cont);
	return 0;
}
