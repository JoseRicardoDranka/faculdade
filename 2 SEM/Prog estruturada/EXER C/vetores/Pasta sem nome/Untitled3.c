#include "stdio.h"
#include "stdlib.h"
#include "time.h"

int main()
{
	int k = NULL, *matriz = NULL;


	printf("Tamanho do vetor: ");
	scanf("%i", &k);

	matriz = (int *)malloc(k * sizeof(int));

	for (int i = 0; i < k; i++)
	{
		srand(time(NULL));
		matriz[i] = rand() % k + 1;

		printf("Valor  %i : %i" , i+1,  matriz[i]);
		printf("\n");
	}

	system("pause");
	return 0;
}
