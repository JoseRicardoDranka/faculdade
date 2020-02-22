#include<stdio.h>
#include<stdlib.h>
#include<time.h>
int main(){
    srand(time(NULL));
    int v[100],cont[6],i,j;
    for (i=0;i<6;i++){
        cont[i]=0;
    }
    for(i=0;i<100;i++){
        v[i]=rand()%6+1;
        for(j=0;j<6;j++)
            if(v[i]==j+1){
                cont[j]++;
                break;
            }
    }
    for(i=0;i<6;i++)
        printf("%d\n",cont[i]);

return 0;
}
