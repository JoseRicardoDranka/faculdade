struct livro{
    char titulo[20];
    int paginas;
    int id;
};
struct pessoa{
    char nome[20];
    int idade;
    int id;
};
int main(){
    struct pessoa listapessoa[5];
    struct livro listalivros[5];
    int i;
        for(i=0;i<5;i++){
            listapessoa[i]=scanf("%c %d %d",nome,idade,id);
    }
        for(i=0;i<5;i++){
            listalivros[i]=scanf(""%c %d %d",titulo,paginas,id);
    }
    int d;
    char x;
    while (){
        scanf("%d",d);
        if (d==1){
            printf("qual livro deseija");
            scanf("%c",&x)
            for(i=0;i<5;i++){
                if (listalivro[i]==x){
                printf("%c %d %d",titulo,paginas,id);
                break;
            }else
                printf("livro n encontrado");
        }
    }
        if (d==2){
            scanf("%d",&x);
                for(i=0;i<5;i++){
                    if(listapessoa[i]==x){
                            printf("%c %d %d",nome,idade,id)
                }
            }
    }


}
