#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct Filme{
	char titulo[30];
	int ano;
}filme;

int main(){
	filme f1;
	filme f2;
	filme *f3;
	filme *f4;
	int i;
	strcpy(f1.titulo, "Pulp Fiction");
	f1.ano = 1994;
	f2 = f1;
	printf("f1 - %p\t%s\t%d\n",&f1, f1.titulo, f1.ano);
	printf("f2 - %p\t%s\t%d\n",&f2, f2.titulo, f2.ano);
	printf("\n");

	strcpy(f1.titulo, "Kill Bill");
	f1.ano = 2004;
	printf("f1 - %p\t%s\t%d\n",&f1, f1.titulo, f1.ano);
	printf("f2 - %p\t%s\t%d\n",&f2, f2.titulo, f2.ano);
	printf("\n");

	f3 = (filme*) malloc(sizeof(filme));
	strcpy(f3->titulo, "Bastardos Inglórios");
	f3->ano = 2009;
	f4 = f3;
	printf("f3 - %p\t%p\t%s\t%d\n",&f3, f3, f3->titulo, f3->ano);
	printf("f4 - %p\t%p\t%s\t%d\n",&f4, f4, f4->titulo, f4->ano);	
	printf("\n");

	strcpy(f4->titulo, "Era uma vez em Hollywood");
	f4->ano = 2019;
	printf("f3 - %p\t%p\t%s\t%d\n",&f3, f3, f3->titulo, f3->ano);
	printf("f4 - %p\t%p\t%s\t%d\n",&f4, f4, f4->titulo, f4->ano);

	return 0;
}