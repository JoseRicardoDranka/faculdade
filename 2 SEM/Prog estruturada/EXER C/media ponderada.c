#include <stdio.h>

void main(){
    int a,b,c,d;
    printf("digite a primeira nota");
    scanf("%d",&a);
    printf("digite a segunda nota");
    scanf("%d",&b);
    printf("digite a terceira nota");
    scanf("%d",&c);
    //a=a*1;
    //b=b*3;
    //c=c*6;
    d=(a*1+b*3+c*6)/(1+3+6);
    printf("sua media e %d",d);


;    return 0;
}
