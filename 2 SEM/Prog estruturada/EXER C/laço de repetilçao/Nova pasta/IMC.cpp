#include<stdio.h>
int main(){
	float peso,altura,imc;
	int i;
	
	while(i<=10){
		printf("____________________________________________________\n");
		printf("qual o seu peso\n");
		scanf("%f",&peso);
		printf("qual sua altura\n");
		scanf("%f",&altura);
		imc=peso/(altura*altura);
		if(imc<16){
			printf("%f magreza leve\n\n\n",imc);
			}else{
				if(imc<18.5){
					printf ("%f magreza moderada\n\n\n",imc);				
				}else{
					if(imc<25){
						printf("%f saudavel\n\n\n",imc);
					}else{
						if(imc<30){
							printf("%f sobrepeso\n\n\n",imc);
						}else{
							printf("%f obesidade\n\n\n",imc);
						}
					}
				}
			}	
		i++;
		}
	
	return 0;
}
