#include<stdio.h>
void f1(int num1,int num2);
int main(){
    int num1,num2;
    scanf("%d %d",&num1,&num2);
    f1(num1,num2);

    return 0;
}
void f1 (int num1,int num2){
    int *n1;
    int *n2;
    *n1=&num1;
    *n2=&num2;

}
