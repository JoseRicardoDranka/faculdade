// substituir caracter 1 por caracter 2
#include<stdio.h>
#include<string.h>

int main(){
    char s1[10],c1,c2;
    int i;
    printf("digite sua string \n");
    fgets(s1,10,stdin);
    printf("digite o caracter 1 \n");
    scanf("%c",&c1);
    printf("digite o caracter 2 \n");
    scanf("%c",&c2);

    for(i=0;i<10;i++){
		if(s1[i]==c1){
            s1[i]=c2;
        }
    }
    printf("%s",s1);
    return 0;
}
