#include <stdio.h>
#include <stdlib.h>
int main(){
    int *j;
    
    j= (int*) malloc(sizeof(int));
    *j=20;
    int *i;
    j=(int*) malloc(sizeof(int));


/*  free(j);
    i=j
    j=NULL;
*/
    printf("%p",&j);
    return 0;
}


/*  strcpy (c2->modelo,c.modelo);
c2->ano=c->ano;
c2-> valor=c->valor;

copiar instancia por instancia
*/