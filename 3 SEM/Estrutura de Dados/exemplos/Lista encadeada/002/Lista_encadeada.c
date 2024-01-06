#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>

void addNoMeio();
void removerFim();
void removerInicio();
void remover_pos();

typedef struct no{

    char firstName[30];
    struct no *prox;

}no;

int main(){

    system("clear");

    no *lista;
    no *aux = lista;

    lista = NULL;

    int i, opcao, nNomes, contLista = 0, indice;
    char nome[30];

    do{

        printf("1 - Adicionar nome ao inicio");
        printf("\n2 - Adicionar nome no indice recebido");
        printf("\n3 - Listar nomes");
        printf("\n4 - Remover do inicio");
        printf("\n5 - Remover do Fim");
        printf("\nOpção: ");
        scanf("%d", &opcao);

        switch(opcao){

        case 1:

            system("clear");

            printf("Número de nomes: ");
            scanf("%d", &nNomes);

            for(i=0; i<nNomes; i++){

                no *novo = (no*) malloc(sizeof(no));

                printf("Nome %d: ", i+1);
                scanf("%s", novo->firstName);

                novo->prox = lista;

                lista = novo;

                contLista++;
            }

        break;

        case 2:

            printf("Indice: ");
            scanf("%d", &indice);

            printf("Nome à adicionar: ");
            scanf("%s", nome);

            //indice = contLista;
            addNoMeio(indice, lista, nome);

        break;

        case 3:

            system("clear");

            aux = lista;

            for(i=0; i<contLista; i++){

                printf("Nome: %s\n", aux->firstName);
                aux = aux->prox;

            }

        break;

        case 4:

            removerInicio(&lista);
            contLista--;

        break;

        case 5:

            removerFim(&lista);
            contLista--;

        break;

        case 6:
            remover_pos(&lista);
            contLista--;

        break;
        }

    }while(i);

    return 0;

}

void addNoMeio(int indice,struct no *lista, char firstName[30]){

    no *aux;
    no *novo = (no*) malloc(sizeof(no));

    int i = 0;

    strcpy(novo->firstName, firstName);

    //printf("%s", novo->firstName);

    if(novo->prox = lista){
        lista=novo;
    }else{
        aux = lista;
        while(i < indice-1 && aux != NULL){
            i++;
            //aux = aux->
        }
    }

return;
}

void removerInicio(no **lista){

    no *aux = *lista;

    if(aux != NULL){
        *lista = aux->prox;
        free(aux);
    }

}

void removerFim(no **lista){

    no *aux = *lista;

    while(aux->prox != NULL){
        aux = aux->prox;
    }

    if(aux->prox == NULL){
        free(aux);
    }

}
void remover_pos(no**lista){
    no*aux=*lista;
    printf("digite a posiçao q vc deseija remover \n ");
    int pos,cont=0;
    scanf("%d",&pos);
    while(aux->prox!=NULL){
        cont++;
        if(pos!=cont){
            continue;
        }else{
            free(aux);
            break;
        }
    }
}