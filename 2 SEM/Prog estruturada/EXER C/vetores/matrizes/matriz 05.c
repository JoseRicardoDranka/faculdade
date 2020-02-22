#include<stdio.h>
#include<stdlib.h>
#include<time.h>
int main(){
    srand(time(NULL));
    int m[5][10],i,j,v[10],media=0;
    for (i=0;i<10;i++){
        for(j=0;j<5;j++){
            m[i][j]= rand()%2+1;
        }
    }
    for(i=0;i<10;i++){
        printf("digite o gabarito");
        scanf("%d",&v[i]);
    }
    for(i=0;i<5;i++){
        for(j=0;j<10;j++){
            if(m[i][j]== v[i]){
                media++;
            }else;
        }
    }
    printf("\n %d",media);

    return 0;
}
