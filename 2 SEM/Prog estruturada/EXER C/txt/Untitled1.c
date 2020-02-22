#include <stdio.h>
#include <stdlib.h>
#include<string.h>

struct livro{
    int id;
    char titulo[20];
    int pag;
};
int escreverArq(struct livro l1){
    FILE *f;
    f=fopen("Arq.txt","a");
    if(f==NULL)
        return 1;
    fprintf(f,"%d \t %s \t %d\n" ,l1.id,l1.titulo,l1.pag);

    fclose(f);
    return 0;
    }
int lerArq(){
    FILE *f;
    struct livro l1;
    f=fopen("Arq.txt","r");
    if(f==NULL)
        return 1;
    char entrada[50];
    while(!feof(f)){
        fscanf(f,"%d \t %s \t %d \n",&l1.id,l1.titulo,&l1.pag);
        printf("%d \t% s \t %d \n",l1.id,l1.titulo,l1.pag);
        puts(entrada);
    }
    fclose(f);
    return 0;
    }
int main(){
    //struct livro l1;
    //scanf("%d",&l1.id);
    //fflush(stdin);
    //fgets(l1.titulo,20,stdin);
    //scanf("%d",&l1.pag);
    //l1.titulo [strlen(l1.titulo)-1]='\0';
    //escreverArq(l1);

    lerArq();

    return 0;
}
