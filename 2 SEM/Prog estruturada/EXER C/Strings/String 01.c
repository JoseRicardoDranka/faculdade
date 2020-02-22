#include<stdio.h>
#include<locale.h>
#include<string.h>

int main(){
	setlocale(LC_ALL,"portuguese");
	
	/*1.Desenvolver um programa que leia uma string e descubra o tamanho dela (sem utilizar o strlen).*/
	
	char s1[10];
	int i, count=0;
	
	printf("Digite uma palavra(string): \n");
	fgets(s1, 9,stdin);
	
	for(i=0; i<9; i++){
		if(s1[i]=='\0'){
			break;
		}else{
			count++;
		}
		
	}
	printf("%d", count-1);
	
	return 0;
}
