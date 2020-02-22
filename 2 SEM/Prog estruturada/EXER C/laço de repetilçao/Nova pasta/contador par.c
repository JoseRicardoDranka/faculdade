#include<stdio.h>
int main(){
	int n1,n2,n3,cont=0;
	printf("escreva o primeiro numero");
	scanf("%d",&n1);
	printf("escreva o segundo numero");
	scanf("%d",&n2);
	n3=n1;
	for(int i=0; i <(n2-(n3+1));i++){
		n1 = n1 +1;
		if (n1%2==0){
            printf("\n %d",n1);
            cont++;
		}
	}
	printf("\n%d",cont);
	return 0;
}
