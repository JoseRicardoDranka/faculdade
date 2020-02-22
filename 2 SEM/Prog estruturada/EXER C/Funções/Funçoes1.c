#include<stdio.h>
void fun1();
void fun2();
void fun3();

int i,j;
int main(){
	i=5;
	printf("i na main \t %d \n",i);
	fun1();
	printf("i na main dps da fun1 \t %d \n",i);
	
	return 0;	
}
void fun1(){
		i=10;
		printf("i na fun 1 \t %d \n",i);
	}
	void fun2(){
		puts("funcao 2");
	}
	void fun3(){
		puts("funcao 3");
	}
