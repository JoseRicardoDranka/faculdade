#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct{
    int id;
    char nome[20];
    char genero[20];
    int idade;
} Personagem;

typedef struct{
    int id;
    char nome[20];
    int paginas;
    int ano;
    int numPersonagem;
    Personagem *personagens[20];
} Livro;

typedef struct{
    int id;
    char nome[20];
    char pais[20];
    int anoNascimento;
    Livro *livros[20];
} Autor;

void inserirlivro();
void inserirautor();
void listarautor();
void listarlivro();
void listarlivrocompersonagem();
void listarPersonagem();
void inserirPersonagem();

int main(){
    Personagem *personagens[20];
    Livro *livros[20];
    Autor *autor[20];
    int contw = 1, contSW = 0, numlivro=0, autorId,numAutor=0,numpers,livroId=0;
    int i,j,k;

    autor[numAutor]=(Autor*) malloc(sizeof(Autor));

    while (contw > 0){
        printf("escolha uma alternativa \n 1:Inserir autores \n 2:listar autor \n 3 inserir livros \n 4 listar livro \n 5: inserir personagens \n 6: listar personagem \n 0: Sair");
        scanf("%d", &contSW);
        switch (contSW){
        case 0:
            contSW=0;
            break;

        case 1:
            inserirautor(*autor,numAutor);
            numAutor++;
            break;

        case 2:
            listarautor(*autor);
            break;

        case 3:
            printf("id autor");
            scanf("%d", &autorId);
            inserirlivro(*autor,numlivro,autorId);
            numlivro++;
            break;
        
        case 4:
            listarlivro(*autor, numlivro,numAutor);
            break;

        case 5:
            printf("id autor");
            scanf("%d", &autorId);
            printf("id livro");
            scanf("%d", &livroId);
            inserirPersonagem(*autor,livroId,numpers,autorId);
            break;
        }
    }

    return 0;
}

void listarPersonagem(Autor *autor[]){
    for (int i = 0; i < 10; i++){
        if (autor[i]->id == -1){
            break;
        }else{
            for (int j = 0; j < 10; j++){ /// Listar Personagem
                if (autor[i]->livros[j]->id != -1){
                    for (int k = 0; k < 10; k++){
                        printf("%snome:\n,%dIdade:\n,%sGenero:", autor[i]->livros[j]->personagens[k]->nome, autor[i]->livros[j]->personagens[k]->idade, autor[i]->livros[j]->personagens[k]->genero);
                    }// for
                }// if
            }// for
        } // else
    }// for
}
void inserirPersonagem(Autor *autor[],int livroId,int numpers,int autorId){//quase pronto falta condiçao
    numpers=0;
    // if(autor[autorId]->livros[numlivro]->personagens[numpers]->id==NULL){
    //     autor[autorId]->livros[numlivro]->personagens[numpers]=(Personagem*) malloc(sizeof(Personagem));    
    // }else{
    //     numpers++;
    // }
    autor[autorId]->livros[livroId]->personagens[numpers]=(Personagem*) malloc(sizeof(Personagem));
    char book[20], pers[20], genero[20];
    int idade;
    
    autor[autorId]->livros[livroId]->personagens[numpers]->id = numpers;
    printf("nome personagem");
    fflush(stdin);
    fgets(pers,50,stdin);
    //scanf("%s ", pers);
    strcpy(autor[autorId]->livros[livroId]->personagens[numpers]->nome, pers);
    printf("idade idade do presonagem");
    fflush(stdin);
    scanf("%d", idade);
    autor[autorId]->livros[livroId]->personagens[numpers]->idade = idade;
    printf("genero do presonagem");
    fflush(stdin);
    fgets(genero,50,stdin);
    //scanf("%s ", genero); /// Inserir Personagem
    strcpy(autor[autorId]->livros[livroId]->personagens[numpers]->genero, genero);

    // for (int i = 0; i < 10; i++){
    //         if(autor[autorId]->livros[livroId]->personagens[i]->id == NULL){
    //                 autor[autorId]->livros[livroId]->personagens[i]->id = i;                 // passando indicie como id para personagem
    //                 strcpy(autor[autorId]->livros[livroId]->personagens[i]->nome, pers);     // atribuir nome ao personagem
    //                 autor[autorId]->livros[livroId]->personagens[i]->idade = idade;          // atribuir idade ao personagem
    //                 strcpy(autor[autorId]->livros[livroId]->personagens[i]->genero, genero); // atribuir genero ao personagem
    //         }
    // }// for
}

void inserirlivro(Autor *autor[], int numlivro, int autorId){//Quase pronto falta condiçao
    // numlivro=0;
    // for(int i = 0;i<15;i++){
    //     if(autor[autorId]->livros[i]->id==NULL){                 //Verificao com ponteiro
    //         break;
    //     }else{
    //         numlivro++;
    //     }
    // }
    autor[autorId]->livros[numlivro] = (Livro*) malloc(sizeof(Livro));
    autor[autorId]->livros[numlivro]->id = numlivro;

    char nome[20];
    int paginas,ano,numpers;

    printf("nome do livro");
    scanf("%s",&nome);
    strcpy(autor[autorId]->livros[numlivro]->nome,nome);
    printf("qtd paginas");
    scanf("%d",&paginas);
    autor[autorId]->livros[numlivro]->paginas=paginas;
    printf("ano de lançamento");
    scanf("%d",&ano);
    autor[autorId]->livros[numlivro]->ano=ano;//ano lançamento
    printf("qtd de personagem");
    scanf("%d",&numpers);
    autor[autorId]->livros[numlivro]->numPersonagem=numpers;
    

}
void inserirautor(Autor *autor[],int numAutor){//Pronto
    
    autor[numAutor] = (Autor*) malloc(sizeof(Autor));
    autor[numAutor]->id = numAutor;

    char nome[20],pais[20];
    int nasc;

    printf("nome do autor");
    scanf("%s",&nome);
    strcpy(autor[numAutor]->nome,nome);
    printf("pais do autor");
    scanf("%s",&pais);
    strcpy(autor[numAutor]->pais,pais);
    printf("ano de nascimeto do autor");
    scanf("%d",&nasc);

    autor[numAutor]->anoNascimento = nasc;

}
void listarautor(Autor *autor[]){//Pronto
    int aux = 0;
    for (int i = 0; i < 10; i++){
        if (autor[i]->id != -1){
            printf("ID: %d\n NOME:%s \n PAIS:%s\n anoNascimento: %d \n", autor[i]->id, autor[i]->nome, autor[i]->pais, autor[i]->anoNascimento);
            aux++; // varivel para evitar de printar o conteudo de else
        }else if (aux == 0){
            printf("autor nao encontrado \n"); // Listar Autores
            break;   // sai do for
        }  // else/if
    }    // for
}

void listarlivro(Autor *autor[], int numlivro,int numAutor){//Pronto
    for (int i = 0; i <numAutor; i++){
        for(int j=0;j<numlivro;j++){
            printf("autor:%s \n id: %d \n Titulo: %s \n Paginas: %d \n ano: %d \n",autor[i]->nome,autor[i]->livros[j]->id,
            autor[i]->livros[j]->nome, autor[i]->livros[j]->paginas, autor[i]->livros[j]->ano,autor[i]->livros[j]->numPersonagem);
        }
    }
}











void listarLivrosComPersonagens(Livro *livros[], int numLivros)
{
    int i, j;
    for (i = 0; i < numLivros; i++)
    {
        printf("id: %d\ttitulo: %s\tnumero personagens: %d\n",
            livros[i]->id, livros[i]->nome, livros[i]->personagens);
        for (j = 0; j < livros[i]->numPersonagem; j++)
            printf("\tid: %d\tnome: %s\n",
            livros[i]->personagens[j]->id, livros[i]->personagens[j]->nome);
        printf("\n");
    }
}

// int contw = 1, contSW = 0, numeropag, anolancamento, idade, contp,aux=0,idAutor;
//     char nome[20], book[20], pers[20], genero[20];
//     Autor a[10];

//     for (int i = 0; i < 10; i++){
//         for (int j = 0; j < 10; j++){
//             for (int k = 0; k < 10; k++){
//                 autor[i]->id = -1;
//                 autor[i]->livros[j].id = -1;
//                 autor[i]->livros[j].personagens[k].id = -1;
//             }
//         }
//     }

//     while (contw != 0){
//         printf("escolha uma alternativa \n 1:Listar autores \n 2:Inserir autor \n 3 Listar livros \n 4 inserir livro \n 5: Listar personagens \n 6: Inserir personagem \n 0: Sair");
//         scanf("%d", &contSW);
//         switch (contSW){
// /// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//         case 1://pronto
//             for (int i = 0; i < 10; i++){
//                 if (autor[i]->id != -1){
//                     printf("ID: %d\n NOME:%s \n PAIS:%s\n anoNascimento: %d \n", autor[i]->id, autor[i]->nome, autor[i]->pais, autor[i]->anoNascimento);
//                     aux++;//varivel para evitar de printar o conteude de else
//                 }else if(aux == 0){
//                     printf("autor nao encontrado \n");                                                      //Listar Autores
//                     break;//sai do for
//                 }//else/if
//             }//for
//             break;//para com o final da execuçao do bloco
// /// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//         case 2://pronto
//             fflush(stdin);
//             for (int i = 0; i < 10; i++){
//                 if (autor[i]->id == -1){
//                     printf("Digite o nome do autor \n");
//                     fgets(autor[i]->nome,20,stdin);
//                     fgets(autor[i]->nome,20,stdin);
//                     printf("Digite o pais do autor \n");
//                     fgets(autor[i]->pais,20,stdin);
//                     printf("Digite o ano de nascimento do autor \n");                                       //Inserir autores
//                     scanf("%d",&autor[i]->anoNascimento);
//                     autor[i]->id = i;
//                     break;
//                 }else if(i == 10){
//                     printf("nao há posiçoes validas");
//                     break;//para o for
//                 } // else
//             }// for
//             break;//para com o final da execuçao do bloco
// /// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//         case 3://pronto
//         aux=0;
//             for (int i = 0; i < 10; i++){
//                 if(autor[i]->id ==-1){
//                     printf("nenhum autor encontrado");
//                     break;
//                 }//if
//                 for (int j = 0; j < 10; j++){
//                     printf("nunhum livro encontrado");                                          //Listar Livros
//                     if(autor[i]->livros[j].id == -1){
//                         break;
//                     }//if
//                     for (int k = 0; k < 10; k++){
//                         printf("Nome:%s\n %dPaginas:\n %sNome Personagem:\n %d idade Personagem: \n %s genero do personagem: ", autor[i]->livros[j].nome, autor[i]->livros[j].paginas, autor[i]->livros[j].personagens[k].nome, autor[i]->livros[j].personagens[k].idade, autor[i]->livros[j].personagens[k].genero);
//                     }//for
//                 }//for
//             }//for
//             break;
// /// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//         case 4://pronto
//             printf("id autor");
//             scanf("%d",&idAutor);
//             for (int i = 0; i < 10; i++){
//                 if(idAutor==autor[i]->id){
//                     for (int j = 0; j < 10; j++){
//                         for (int k = 0; k < 10; k++){
//                             if(autor[i]->livros[j].id== -1 ){
//                                 printf("nome do livro");
//                                 fgets(book,20,stdin);
//                                 fgets(book,20,stdin);                                                                      //Inserir Autores
//                                 printf("numero de paginas");
//                                 scanf("%d",&numeropag);
//                                 printf("ano de lancamento");
//                                 scanf("%d",&anolancamento);
//                                 autor[i]->livros[j].id = j;              // inserir indicie do vetor como id para livro
//                                 strcpy(autor[i]->livros[j].nome, book);  // atribui nome do livro
//                                 autor[i]->livros[j].paginas = numeropag; // atribuir numero de paginas ao livro
//                                 break;
//                             }else{
//                                 break;
//                             }//else
//                         }//for
//                     }//for
//                 }else{
//                     printf("autor nao encontrado");
//                     break;
//                 }//else
//             }//for
//             break;
// /// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//         case 5:
//             for (int i = 0; i < 10; i++){
//                 if(autor[i]->id == -1){
//                     break;
//                 }else{
//                     for (int j = 0; j < 10; j++){                                                                               ///Listar Personagem
//                         if(autor[i]->livros[j].id != -1){
//                             for (int k = 0; k < 10; k++){
//                                 printf("%snome:\n,%dIdade:\n,%sGenero:", autor[i]->livros[j].personagens[k].nome, autor[i]->livros[j].personagens[k].idade, autor[i]->livros[j].personagens[k].genero);
//                             }//for
//                         }//if
//                     }//for
//                 }//else
//             }//for
// /// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//         case 6:
//             printf("qual o livro");
//             scanf("%s", book);
//             printf("qual o personagem");
//             scanf("%s ", pers);
//             printf("qual a idade idade do presonagem");
//             scanf("%d",idade);
//             printf("qual o genero do presonagem");
//             scanf("%s ",genero);                                                                                        ///Inserir Personagem
//             for (int i = 0; i < 10; i++){
//                 for (int j = 0; j < 10; j++){
//                     for (int k = 0; k < 10; k++){
//                         if (autor[i]->livros[j].nome == book && autor[i]->livros[i].personagens[j].id == -1){
//                             autor[i]->livros[j].personagens[k].id = k;                 // passando indicie como id para personagem
//                             strcpy(autor[i]->livros[i].personagens[j].nome, pers);     // atribuir nome ao personagem
//                             autor[i]->livros[j].personagens[k].idade = idade;          // atribuir idade ao personagem
//                             strcpy(autor[i]->livros[i].personagens[j].genero, genero); // atribuir genero ao personagem
//                         }else{
//                             printf("livro nao encontrado");
//                         }//else
//                     }//for
//                 }//for
//             }//for
// /// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//         } // switch
//     }// while