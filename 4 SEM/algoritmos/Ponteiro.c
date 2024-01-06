#include<stdio.h>

int main(){
    int x,y,z;
    y=5;
    x=10;
    z=15;
    int *p; //ponteiro    
    printf("x - end: %p valor: %d \n",&x,x);
    printf("y - end: %p valor: %d \n",&y,y);
    printf("z - end: %p valor: %d \n",&z,z);
    p=&x;
    printf("p end: %p valor: %p aponta: %d \n",&p,p,*p);

    //* == ponteiro & == end memoria



    return 0;
}