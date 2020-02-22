#include<stdio.h>
int main(){
    char s1[45]= "Programação Estruturada é a melhor disciplina";
    int i,cont=1;
    for(i=0;i<45;i++){
        if(s1[i]==' ')
            cont++;
    }
    for(i=0;i<45;i++){
        if(s1[i]!=' '){
            printf("%s",s1[i]);
        }else{
            printf("\n");
        }
    }

    printf("%d",cont);
    return 0;
}
