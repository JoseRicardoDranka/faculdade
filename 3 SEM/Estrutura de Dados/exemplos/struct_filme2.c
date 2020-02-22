#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct Diretor{
	char nome[30];
	int idade;
}Diretor;

typedef struct Filme{
	char titulo[30];
	int ano;
	Diretor *diretor;
}Filme;

int main(){
	int i;

	Diretor *d1 = (Diretor*) malloc(sizeof(Diretor));
	strcpy(d1->nome, "Quentin Tarantino");
	d1->idade = 57;

	Filme *vFilmes[4];
	for(i=0; i<4; i++){
		vFilmes[i] = (Filme*) malloc(sizeof(Filme));
	}

	strcpy(vFilmes[0]->titulo, "Pulp Fiction\0");
	vFilmes[0]->ano = 1994;
	vFilmes[0]->diretor = d1;

	strcpy(vFilmes[1]->titulo, "Kill Bill\0");
	vFilmes[1]->ano = 2004;
	vFilmes[1]->diretor = d1;
	
	strcpy(vFilmes[2]->titulo, "Bastardos Inglórios\0");
	vFilmes[2]->ano = 2009;
	vFilmes[2]->diretor = d1;
	
	strcpy(vFilmes[3]->titulo, "Era uma vez em Hollywood\0");
	vFilmes[3]->ano = 2019;
	vFilmes[3]->diretor = d1;

	printf("\nvFilmes - %p\n\n", &vFilmes);
	for(i=0; i<4; i++)
		printf("f%d\t%p\t%p\t%s\t%d\t%p\t%s\t%d\n",i, &vFilmes[i], vFilmes[i], vFilmes[i]->titulo, vFilmes[i]->ano, vFilmes[i]->diretor, vFilmes[i]->diretor->nome, vFilmes[i]->diretor->idade);

	return 0;
}