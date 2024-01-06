#include<stdlib.h>
#include<stdio.h>
#include<pthread.h>

void *funThread(){
printf("thread secundaria - criada com sucesso");
printf("thread secundaria - encerrando");
}
int main(){
pthread_t thread;
int iret;
printf("thread principal - criando thread secundaria");
iret = pthread_create(&thread,NULL,funThread,NULL);
pthread_join (thread,NULL);
printf("thread princcipal - tread secundaria criada com sucesso");
printf("thread prncipal - encerrando");