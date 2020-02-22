#include<stdio.h>
#include<stdlib.h>
#include<time.h>
void f1(int t,int v[t]);
void f2(int l,int c,int m[l][c]);
int main(){
    int t,l,c;
    scanf("%d %d %d",&t,&l,&c);
    int v[t],m[l][c];
    f1(t,v);
    f2(l,c,m);

    for(int i=0;i<t;i++)
        printf("%d  ",v[i]);
        printf("\n");
    for(int i=0;i<c;i++){
            printf("\n");
        for(int j=0;j<l;j++){
            printf("%d   ",m[i][j]);
        }
    }

}
void f1(int t,int v[t]){
    srand(time(NULL));
    for(int i=0;i<t;i++){
        v[i]=rand()%10;
    }
}
void f2(int l,int c,int m[l][c]){
    srand(time(NULL));
    for(int i=0;i<l;i++){
        for(int j=0;j<c;j++){
            m[i][j]=rand()%10;
        }
    }
}
