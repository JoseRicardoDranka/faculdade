#include<stdio.h>
int main(){
    int i=5;
    printf("end = %p \t val =%d\n",&i,i);
    int*j;
    j=&i;
    printf("end = %p \t val =%p \t aponta %d \n",&j,j,*j);
    *j=20;
    printf("end = %p \t val =%d\n",&i,i);
    printf("end = %p \t val =%p \t aponta %d \n",&j,j,*j);
    return 0;
}

