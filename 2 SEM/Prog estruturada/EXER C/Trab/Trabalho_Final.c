#include<stdio.h>
#include<stdlib.h>
#include<string.h>

typedef struct {
    int idusuario;
    char nome[30];
    char cpf[13];
    char end[50];
}usuario;

typedef struct{
    int idpedido;
    char produto[30];
    char formadepag[20];
    float valor;
}pedido;

typedef struct{
    char nome[30];
    char endrestaurante[50];
    char cnpj[18];
}restaurante;

int cadastrar_usuario (usuario u);
int cadastrar_restautante (restaurante r);
int registrar_pedido (pedido p);
int historico_pedidios();
int buscar_usuario(int id);
int editar_pedido(int id);

int main(){
    int escolha,id;
     usuario u;
     restaurante r;
     pedido p;
    printf("Escolha uma das opcoes \n 1: cadastrar usuario \n 2: cadastrar restaurante \n 3: cadastrar pedido \n 4: historico de pedido \n 5: buscar usuario \n 6: Editar usuario \n");
    scanf("%d",&escolha);

    switch (escolha){
        case 1:
        system("clear");

        printf("id usuario \n");
        scanf("%d",&u.idusuario);

        setbuf(stdin, NULL);

        printf("nome usuario \n");
        fgets(u.nome,30,stdin);
        u.nome [strlen(u.nome)-1]='\0';

        setbuf(stdin, NULL);

        printf("CPF usuario \n");
        fgets(u.cpf,13,stdin);
        u.cpf [strlen(u.cpf)-1]='\0';

        printf("endereco usuario \n");
        fgets(u.end,50,stdin);
        u.end [strlen(u.end)-1]='\0';

        cadastrar_usuario(u);
        break;

        case 2:
        system("clear");

        setbuf(stdin, NULL);

        printf("nome restaurante \n");
        fgets( r.nome ,30,stdin);
        r.nome [strlen(r.nome)-1]='\0';

        printf("endereco restaurante \n");
        fgets(r.endrestaurante,50,stdin);
        r.endrestaurante [strlen(r.endrestaurante)-1]='\0';

        printf("CNPJ restaurante \n");
        fgets(r.cnpj,18,stdin);

        cadastrar_restautante(r);
        break;

        case 3:

        system("clear");


        printf("id pedido \n");
        scanf("%d",&p.idpedido);

        setbuf(stdin, NULL);

        printf("produto \n");
        fgets(p.produto,30,stdin);
        p.produto [strlen(p.produto)-1]='\0';

        setbuf(stdin, NULL);

        printf("forma de pagamento \n");
        fgets(p.formadepag,20,stdin);
        p.formadepag [strlen(p.formadepag)-1]='\0';

        printf("valor \n");
        scanf("%f",&p.valor);

        registrar_pedido(p);
        break;

        case 4:

        system("clear");

        historico_pedidios();
        break;

        case 5:

        setbuf(stdin, NULL);

        printf("digite o id do usuario \n");
        scanf("%d",&id);

        buscar_usuario(id);
        break;

        case 6:

        printf("digite o id do usuario a ser editado");
        scanf("%d",&id);
        editar_pedido(id);

        printf("id usuario \n");
        scanf("%d",&u.idusuario);

        setbuf(stdin, NULL);

        printf("nome usuario \n");
        fgets(u.nome,30,stdin);
        u.nome [strlen(u.nome)-1]='\0';

        setbuf(stdin, NULL);

        printf("CPF usuario \n");
        fgets(u.cpf,13,stdin);
        u.cpf [strlen(u.cpf)-1]='\0';

        printf("endereco usuario \n");
        fgets(u.end,50,stdin);
        u.end [strlen(u.end)-1]='\0';

        cadastrar_usuario(u);
        break;

    }

    return 0;
}
int cadastrar_usuario (usuario u){
    FILE*f;
    f=fopen("usuario.bin","ab");
    if(f==NULL)
        return 1;
    fwrite(&u,sizeof(usuario),1,f);
    fclose(f);
    return 0;
}
int cadastrar_restautante (restaurante r){
    FILE*f;
    f=fopen("restaurante.bin","ab");
    if(f==NULL)
        return 1;
    fwrite(&r,sizeof(restaurante),1,f);
    fclose(f);
    return 0;
}
int registrar_pedido (pedido p){

    FILE*f;
    f=fopen("pedidos.bin","ab");
    if(f==NULL)
        return 1;
    fwrite(&p,sizeof(pedido),1,f);
    fclose(f);
    return 0;
}
int historico_pedidios(){
    pedido p;
    FILE *f = fopen("pedidos.bin", "rb");

    if(!f){
        printf("nao existe pedidos registrados \n");
        return 1;
    }

    while(fread(&p, sizeof(pedido), 1, f)){

        printf("%d \t %s \t %s \n", p.idpedido, p.produto, p.formadepag);

    }
    fclose(f);
    return 0;
}
int buscar_usuario(int id){
   usuario u;
    FILE *f = fopen("usuario.bin", "rb");
    system("clear");
    if(!f){
        printf("usuario inexistente \n");
        return 1;
    }

    while(fread(&u, sizeof(usuario), 1, f)){
        if(id==u.idusuario)
            printf("%d \t %s \t %s \t %s \n", u.idusuario, u.nome, u.cpf,u.end);

    }
    fclose(f);
    return 0;
}
int editar_pedido(int id){

 usuario u;
    FILE *f = fopen("usuario.bin", "a+b");
    system("clear");
    if(!f){
        printf("usuario inexistente \n");
        return 1;
    }
    if(u.idusuario==id)
        fseek( f ,id ,SEEK_SET);
        while(fread(&u, sizeof(usuario), 1, f)){
            if(id==u.idusuario)
                fwrite(&u,sizeof(usuario),1,f);

    }
    fclose(f);

}

