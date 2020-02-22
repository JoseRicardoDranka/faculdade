#include<stdio.h>
#include<string.h>
int main{
    int i,j,k,cont=1
    char s[20]
    fgets(s,20,stdin);
    scanf("%c",&c);

    for(i=0;i<strlen(s)-1;i++){
        if(s[i]==c)
            cont++;
    }

    char vs[cont][10];

    for(i=0;i<cont;i++){
        for(j=0;j<20;j++){
            if(s[k]!=c && s[k]!='\0'){
                vs[i][j]=s[k];
                k++;
            }else{
                vs[i][j]='\0';
                k++;
                break;
            }
        }
    }

    return 0;
}
