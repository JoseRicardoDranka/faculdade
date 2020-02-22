#include<stdio.h>
int f1(int n);
int main(){
    f1(64908);
    return 0;
}
int f1(int n){
    if (n>0){
        printf("%d iniciando \n",n);
        f1(n-1);
        printf("%d terminando \n",n);
        }else{
        printf("fim \n");
        }
}
