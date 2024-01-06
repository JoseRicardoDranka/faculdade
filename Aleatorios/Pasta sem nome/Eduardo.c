//eduardo

#include <stdio.h>

int main(void) {
  int i, v1[5], v2[5], v3[10], j=0, k=0 ;

  for(i=0;i<5;i++){
    printf("Digite o %d número do primeiro vetor: ", i+1);
    scanf("%d", &v1[i]);
  }

  printf("\n");

  for(i=0;i<5;i++){
    printf("Digite o %d número do segundo vetor: ", i+1);
    scanf("%d", &v2[i]);
  }

  for(i=0;i<10;i++){
    if(j < 5 && k < 5){
      if(v1[j] < v2[k]){
        v3[i] = v1[j];
        j++;
      }else{
        v3[i] = v2[k];
        k++;
      }
    }else if(j >= 5 && k < 5){
      v3[i] = v2[k];
      k++;
    }else if(j < 5 && k>= 5){
      v3[i] = v1[j];
      j++;
    }
  }

  printf("\nVetor ordenado: \n");

  for(i=0;i<10;i++){
    printf("%d\t", v3[i]);
  }

  return 0;
}
