//Desenvolver um programa que leia duas strings e concatene elas em uma terceira String com um espaço entre elas

int main(){
    char s1[10],s2[10],s3[20];
    int i,j;
    fgets(s1,10,stdin);
    fgets(s2,10,stdin);
    for(i=;i<10;o++){
        if(s1[i]!='\n')
        s3[i]=s1[i];
        else
        break
    }
    s3[i]=' ';
    i++
    for(j=0;j<10;j++){
        if(2[j]!= '\0'){
            s3[i]=s2[j];
            i++;
        }else
            break;
    }
    s3[i]='\0'
    puts(s3);
    return 0;
}
