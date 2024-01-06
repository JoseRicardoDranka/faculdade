#include <stdio.h>
int main(void){

  int i, j, vetor[10];

  for(i=0;i<10;i++){
    printf("Digite o %dº número: ",i+1);
    scanf("%d", &vetor[i]);
  }

  printf("\n");

  for(i=0;i<10;i++){
    for(j=0;j<10;j++){
      if(vetor[i] == vetor[j]){
        if(j != i){
          printf("%d se repete.\n", vetor[j]);
          break;
        }
      }
    }
  }

  return 0;
}
