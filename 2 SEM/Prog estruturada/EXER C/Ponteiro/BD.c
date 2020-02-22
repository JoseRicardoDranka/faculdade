#include<stdio.h>
 struct funcionario{
    char pnome[10];
    char unome[20];
    char cpf[11];
    char datanasc[8];
    char endereco [50];
    char sexo [1];
    float salario;
    char cpf_supervisor[11] *cpf;
    char dnr;
    };
 struct departamento{
    char dnome[15];
    int dnumero;
    char cpf_gerente[11];
    char data_inicio_gerente[8];
 };
 struct localizaçao_dep{
    struct departamento*dnumero;
    char dlocal[50];
};
struct projeto{
    char projnome[15];
    int projnumero;
    char projlocal[50];
    struct departamento *dnumero;
};
struct dependente{
    struct funcionario *cpf;
    char nome_dependente[50];
    char sexo[1];
    char ddatanasc[8];
    char parentesco[10];
};

int main(){
    struct funcinario c1;
    struct departamento d1;
    struct localizaçao_dep e1;
    struct projeto p1;
    struct dependente f1;

    //fun
    printf("digite pnome,unome,cpf,datanasc,endereco,sexo,salario,dnr; \n" );
    scanf("%c %c %c %c %c %c %f %c %c",&pnome,&unome,&cpf,&datanasc,&endereco,&sexo,&salario,&dnr);
    //dep
    printf("digite dnome,dnum,cpf_gerente,data_inicio_gerente");
    scanf("%c %d %c %c",&dnome,&dnum,&cpf_gerente,&data_inicio_gerente);

    //local dep
    printf("digite o dlocal");
    scanf("%c",dlocal);

    // proj
    printf("digite projnome,projnumero,projlocal");
    scanf ("% c %d %c",&projnome,&projnumero,&projlocal);

    //dependente
    scanf("%c %c %c %c ",&nome_dependete,&sexo,&ddatanasc,&parentesco);

}
