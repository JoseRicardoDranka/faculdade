#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct{
    int id;
    char nome[20];
    char genero[20];
    char idade[20];
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
void listarPersonagem();
void inserirPersonagem();
void listarLivrosComPersonagens();
void persoagemSemLivro();
void listarPersoagemSemLivro();

int main(){
    Personagem *personagens[20];
    Livro *livros[20];
    Autor *autor[20];
    int contw = 1, contSW = 0, numlivro=0, autorId,numAutor=0,numpers=0,livroId=0;
    int i,j,k;

    autor[numAutor]=(Autor*) malloc(sizeof(Autor));

    while (contw > 0){
        printf("escolha uma alternativa \n 1:Inserir autores \n 2:listar autor \n 3: inserir livros \n 4: listar livro \n 5: inserir personagens \n 6: listar personagem \n 0: Sair\n");
        scanf("%d", &contSW);
        switch (contSW){
        
        case 0:
            contw=0;
            break;

        case 1:
            inserirautor(*autor,numAutor);
            numAutor++;
            break;

        case 2:
            listarautor(*autor,numAutor);
            break;

        case 3:
            printf("id autor: \t");
            scanf("%d", &autorId);
            inserirlivro(*autor,numlivro,autorId);
            numlivro++;
            break;
        
        case 4:
            listarlivro(*autor, numlivro,numAutor);
            break;

        case 5:
            printf("id autor: \t");
            scanf("%d", &autorId);
            printf("id livro: \t");
            scanf("%d", &livroId);
            inserirPersonagem(*autor,livroId,numpers,autorId,numlivro);
            numpers++;
            break;
        
        case 6:
        //listarPersonagem(*autor);
        listarLivrosComPersonagens(*autor, numlivro,numAutor,numpers);
        break;
        

        }
        
        

    }
    return 0;
}

void listarPersonagem(Autor *autor[]){
    for(int i;i<15;i++){
        for (int j = 0; j <15; j++){ /// Listar Personagem
            for (int k = 0; k < 15; k++){
                printf("%snome:\t,%dIdade:\t,%sGenero:", autor[i]->livros[j]->personagens[k]->nome, autor[i]->livros[j]->personagens[k]->idade, autor[i]->livros[j]->personagens[k]->genero);
            }// for
        }//if
    }// for
}

void inserirPersonagem(Autor *autor[],int livroId,int numpers,int autorId,int numlivro){/////////////////////////////////////////////////////////////

    autor[autorId]->livros[livroId]->personagens[numpers]=(Personagem*) malloc(sizeof(Personagem));
    
    char book[20], pers[20], genero[20],idade[20];
    
    autor[autorId]->livros[livroId]->personagens[numpers]->id = numpers;
    printf("nome personagem: \t");
    fflush(stdin);
    fgets(pers,50,stdin);

    strcpy(autor[autorId]->livros[livroId]->personagens[numpers]->nome, pers);
    printf("idade idade do presonagem: \t");
    fflush(stdin);
    fgets(idade,20,stdin);

    strcpy(autor[autorId]->livros[livroId]->personagens[numpers]->idade,idade);
    printf("genero do presonagem: \t");
    fflush(stdin);
    fgets(genero,50,stdin);

    strcpy(autor[autorId]->livros[livroId]->personagens[numpers]->genero, genero);

}

void inserirlivro(Autor *autor[], int numlivro, int autorId){  ///////////////////////////////////////////////////////////////////////////////////////////////

    autor[autorId]->livros[numlivro] = (Livro*) malloc(sizeof(Livro));
    autor[autorId]->livros[numlivro]->id = numlivro;

    char nome[20];
    int paginas,ano,numpers;

    printf("nome do livro: \t");
    scanf("%s",&nome);
    strcpy(autor[autorId]->livros[numlivro]->nome,nome);
    printf("qtd paginas: \t");
    scanf("%d",&paginas);
    autor[autorId]->livros[numlivro]->paginas=paginas;
    printf("ano de lançamento: \t");
    scanf("%d",&ano);
    autor[autorId]->livros[numlivro]->ano=ano;//ano lançamento
    printf("qtd de personagem: \t");
    fflush(stdin);
    scanf("%d",&numpers);
    autor[autorId]->livros[numlivro]->numPersonagem=numpers;
    

}
void inserirautor(Autor *autor[],int numAutor){///////////////////////////////////////////////////////////////////////////////////////////
    
    autor[numAutor] = (Autor*) malloc(sizeof(Autor));
    autor[numAutor]->id = numAutor;

    char nome[20],pais[20];
    int nasc;

    printf("nome do autor: \t");
    scanf("%s",&nome);
    strcpy(autor[numAutor]->nome,nome);
    printf("pais do autor: \t");
    scanf("%s",&pais);
    strcpy(autor[numAutor]->pais,pais);
    printf("ano de nascimeto do autor: \t");
    scanf("%d",&nasc);

    autor[numAutor]->anoNascimento = nasc;

}
void listarautor(Autor *autor[],int numAutor){//Pronto
    for (int i = 0; i < numAutor; i++){
            printf("ID: %d\t NOME:%s \t PAIS:%s\t anoNascimento: %d \n", autor[i]->id, autor[i]->nome, autor[i]->pais, autor[i]->anoNascimento);
    } // for
}

void listarlivro(Autor *autor[], int numlivro,int numAutor){//Pronto
    for (int i = 0; i <numAutor; i++){
        for(int j=0;j<numlivro;j++){
            printf("autor:%s \t id: %d \t Titulo: %s \t Paginas: %d \t ano: %d \n",autor[i]->nome,autor[i]->livros[j]->id,
            autor[i]->livros[j]->nome, autor[i]->livros[j]->paginas, autor[i]->livros[j]->ano,autor[i]->livros[j]->numPersonagem);
        }
    }
}


void listarLivrosComPersonagens(Autor *autor[], int numLivros,int numAutor,int numpers)
{
    int i, j, k;
    for (i = 0; i < numAutor ; i++){
        for(k=0;k< numLivros ;k++){
            printf("id livro: %d\t titulo livro: %s\t numero personagens: %d \n",
            autor[i]->livros[i]->id,autor[i]->livros[i]->nome, autor[i]->livros[i]->numPersonagem);
            for (j = 0; j < numpers; j++)
                printf("\t id personagem: %d\t nome: %s\n",
                autor[i]->livros[i]->id, autor[i]->livros[i]->personagens[j]->nome);
            printf("\n");
        }
    }
}