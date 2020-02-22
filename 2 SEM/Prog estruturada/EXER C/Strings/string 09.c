//quanta letras tem repetidas dentro da string

#include<stdio.h>
int main(){
    char s1[10];
    int i,j,s2[10];
    fgets(s1,10,stdin);
    for(j=0;j<10;j++)
        s2[j]=0;
    for(i=0;i<10;i++){
        for(j=0;j<10;j++){
            if(s1[i]==s1[j]){
                s2[j]++;
            }
        }
    }

    for(i=0;i<10;i++){
        if(s1[i]=='\n'){
            break;
        }else{
            printf("%d %c \n",s2[i], s1[i]);
        }
    }


    return 0;
}
