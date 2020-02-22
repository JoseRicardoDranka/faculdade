#include<stdio.h>
struct carro{
    char marca[20];
    char modelo[20];
    int ano;
    float preco;
};
int main(){
    struct carro c1;
    fgets(c1.marca, 20,stdin);
    fgets(c1.modelo, 20,stdin);
    scanf("%d %f",&c1.ano, c1.preco);
    printf("marca: %s \n,modelo: %s \n,ano: %d \n,preco%2f\n",c1.marca,c1.modelo,c1.ano,c1.preco);

    return 0;

}
