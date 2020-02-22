#include<stdio.h>
void fun1(int i);
void fun2();
void fun3();

int i,j;
int main(){
	int i=10;
	fun1(i);
	printf("i na main %d \n",i);
	
	return 0;	
}
void fun1(int i){
	printf("i na fun 1 \t %d \n",i);
	i=55;
	printf("i na fun 1 \t %d \n",i);
	}
void fun2(){
	puts("funcao 2");
	}
void fun3(){
	puts("funcao 3");
	}
