#include<stdio.h>
#include<string.h>
int main(){
    char s1[35]="aula de programaçao estruturada";
    char letra;
    int i,cont=0;
    printf("digite uma letra\n");
    scanf("%c",&letra);
    for(i=0;i<36;i++){
        if(s1[i]==letra){
            cont++;
        }
    }
    printf("%c se repete %d veses",letra, cont);



    return 0;
}
