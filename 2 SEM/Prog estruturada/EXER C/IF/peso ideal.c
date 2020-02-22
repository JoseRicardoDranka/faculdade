#include <stdio.h>
int main(){

    float a,b,c;
    printf("digite sua altura \n");
    scanf("%f",&a);
    printf("seu sexo 1 para M outros para F");
    scanf("%f",&b);
    if (b == 1){
        c=(72.7*a)-58;
        printf("seu peso ideal e %.2f",c);
        }
    else{
                c=(62.1*a)-44.7;
                printf("seu peso ideal e %.2f",c);
        }
    return 0;

}
