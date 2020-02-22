#include<stdio.h>
#include<locale.h>
#include<string.h>

int main(){
	setlocale(LC_ALL,"portuguese");

	/*2.Desenvolver um programa que leia duas strings e compare se elas são iguais (sem utilizar o strcmp).*/
	
	char s1[10], s2[10];
	int i, j, cont, count;
	
	printf("Digite sua string n°1: \n");
	fgets(s1, 9, stdin);
	printf("Digite sua string n°2: \n");
	fgets(s2, 9, stdin);
	
	for(i=0; i<9; i++){
		if(s1[i]=='\0'){
			break;
		}else{
			count++;
		}	
	}
	
	j=count;
	
	for(i=0; i<j; i++){
		if(s1[i]==s2[i] && s1!='\0'){
			cont=1;
		}else{
			cont=0;
		}
	}
	
	if(cont==1){
		printf("Strings Iguais");
	}else{
		printf("Strings Diferentes");
	}
	return 0;
}
