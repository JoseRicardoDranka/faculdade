#include<stdio.h>
#include<string.h>
int main(){
    char s1[20],s2[20];
    int i,j,k,substring=0;
    fgets(s1,20,stdin);
    fgets(s2,20,stdin);

    for(i=0;i<strlen(s1)-1;i++){
        substring=1;

        for(j=0;j<strlen(s2)-1;j++){
            if(s1[i+j]!=s2[j]&& i+j<strlen(s1)){
                substring=0;
            }
        }

        if(substring){
            printf("esta contida");
            break;
        }
    }

    if(substring==0){
        printf("nao esta contida");
    }
    return 0;
}
