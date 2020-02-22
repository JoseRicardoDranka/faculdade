void f1(int *n1,int *n2,int *n3);
int main(){
    int a,b,c;
    scanf("%d %d %d",&a,&b,&c);
    f1(&a,&b,&c);
    printf("%d\n %d\n %d\n",a,b,c);

    return 0;
}
 void f1(int *n1,int *n2,int *n3){
    if(*n1>*n2){
        *n1=*n1;
        *n2=*n2;
    }else if(*n2>*n1){
        int n4;
        n4=*n1;
        *n1=*n2;
        *n2=n4;
    }else if(*n3>*n1&&*n3>n2){
        int n4;
        n4=*n1;
        *n1=*n3;


    }
}
