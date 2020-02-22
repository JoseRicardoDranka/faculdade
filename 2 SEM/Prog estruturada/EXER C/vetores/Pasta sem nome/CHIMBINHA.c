#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
\\#CHIMBINHA
int main(){
    setlocale(LC_ALL, "Portuguese");

    float vetor1[10], vetor2[10];
    int i;

    for(i=0; i<10; i++){
        printf("Digite o %dº elemento: ", i+1);
        scanf("%f", &vetor1[i]);
    }

    for(i=0; i<10; i++){
        if(i%2 == 0){
            vetor2[i] = vetor1[i]/2;
        }else{
            vetor2[i] = vetor1[i]*3;
        }
    }


    printf("\n\nVetor 1: \n");
    for(i=0; i<10; i++){
        printf("%.0f    ", vetor1[i]);
    }

    printf("\n\n    Vetor 2: \n");
    for(i=0; i<10; i++){
        printf("%.1f    ", vetor2[i]);
    }

    printf("\n\n");

    return 0;
}
