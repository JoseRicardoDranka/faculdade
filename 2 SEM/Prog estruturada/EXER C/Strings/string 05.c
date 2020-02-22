// Desenvolver um programa que leia uma string e crie uma segunda string que seja a primeira string invertida

#include<stdio.h>
#include<string.h>
int main(){
    char s1[10],s2[10];
    int i,j,k;
    fgets(s1,10,stdin);
    k=strlen(s1); // descobrir o tamanho da string \necessita string.h
    for(i=0,i<k;i++)
        s2[i]=s1[k-i-1];
    s2[i]='\0'
    puts(s2);// imprimir string
    return 0;
}
