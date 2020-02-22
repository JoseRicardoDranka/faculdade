#include<stdio.h>
int dobro (int num);
float soma(float n1,float n2);

int main(){
	int d=dobro(5);
	printf("%d \n",d);
	float s=soma(3,d);
	printf ("%.2f",s);
	return 0;	
}
int dobro(int num){
	int resposta=num*2;
	return resposta;
}
float soma(float n1,float n2){
	float r=n1+n2;
	return r;
}
