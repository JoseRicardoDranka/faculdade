#include<stdio.h>
int main(){
    int m[3][3],valor,i,j,cont=0;
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            scanf("%d",&m[i][j]);
        }
    }
    printf("digite um valor");
    scanf("%d",&valor);
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            if(m[i][j]==valor){
                cont=1;
            }else{
                cont=0;
            }
        }
    }
    if(cont==1){
        printf("%d",valor);
    }else{
        printf("valor n encontrado");
    }

    return 0;
}
