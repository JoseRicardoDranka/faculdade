import java.util.Scanner;
public class Main{

    public static void main(final String[] args) {
        int whi=1/*while*/,i/*for*/,cas/*case*/,x=0/*while case1 */,y/*for case 3*/,j=0/*while2 case1*/, t=0/*while case 5*/;
        Scanner ler=new Scanner(System.in);
        String nome,data,conta;
        float valor;

        Amigos user[]=new Amigos[10];
        for(i=0;i<10;i++){
            user[i]=new Amigos(); 
        } 
    user[0].setNome("Ximbinha");
    user[0].setConta("111111111-1");
    user[1].setNome("Anderson");
    user[1].setConta("222222222-2");
    user[2].setNome("Joao");
    user[2].setConta("333333333-3");
    user[3].setNome("jeferson");
    user[3].setConta("444444444-4");
    user[4].setNome("Maicon");
    user[4].setConta("555555555-5");
    user[5].setNome("Jardel");
    user[5].setConta("666666666-6");
    user[6].setNome("Thiago");
    user[6].setConta("777777777-7");
    user[7].setNome("Rodrigo");
    user[7].setConta("888888888-8");
    user[8].setConta("999999999-9");
    user[9].setNome("Carlos");
    user[9].setConta("000000000-0");
//-------------------------------------------------------------------------------
    Historico [] hist=new Historico[10]; 
    for(i=0;i<10;i++){
        hist[i]=new Historico();
}
//-------------------------------------------------------------------------------
    Favoritos [] fav=new Favoritos[10];
    for(i=0;i<10;i++){
        fav[i]=new Favoritos();
    }
//-------------------------------------------------------------------------------
    Transferencia transf[] = new Transferencia[10];
    for(i=0;i<10;i++){
        transf[i]=new Transferencia();
    }
//-------------------------------------------------------------------------------

        while(whi==1){
            System.out.println("-----------------------------MENU------------------------------");
            System.out.println("o que deseija realizar\n 1.realizar transferencia \n 2.visualizar historico de trasnferencia\n 3.visualizar contatos \n 4.Visualizar Favoritos\n 5.adicionar favoritos");

            cas = ler.nextInt();
            x=1;
            switch(cas){
                
                case 1://realizar trasnferencia
                    while(x==1){
                        System.out.println("--------------------------------------");
                        System.out.println("digite o nome de usuario");
                        nome=ler.nextLine();
                        nome=ler.nextLine();
                        System.out.println("digite o numero da conta");
                        conta=ler.nextLine();
                        System.out.println("digite a data de hoje");
                        data=ler.nextLine();
                        System.out.println("digite o valor da transferencia");
                        valor=ler.nextFloat();
                        while(j<10){
                            transf[j].setNome(nome);
                            transf[j].setData(data);
                            transf[j].setValor(valor);
                            hist[j].setNome(nome);
                            hist[j].setData(data);
                            hist[j].setValor(valor);
                            hist[j].setConta(conta);
                        j++;
                        break;
                    }//while

                    System.out.println("deseija realizar outra transferencia 1.'SIM' 2.'NAO'");
                    x=ler.nextInt();
                }//while

                System.out.println("deseja realizar outra operacao 1.'SIM'2.'NAO'");
                whi=ler.nextInt();
                if(whi==1){
                    continue;
                }else{
                    break;
                }
                
                case 2://visualizar historico
                    System.out.println("--------------------------------------");
                    for(i=0;i<10;i++){
                        if(hist[i].getNome()!=null){
                            System.out.println(hist[i].getNome());
                            System.out.println(hist[i].getData());
                            System.out.println(hist[i].getValor());
                            System.out.println(hist[i].getConta());
                        }
                    }
                    break;

                case 3://visualizar contatos
                    System.out.println("--------------------------------------");
                    for(y=0;y<10;y++){
                        System.out.println(user[y].getNome());
                        System.out.println(user[y].getNumero());
                    }//for
                    System.out.println("deseja realizar outra operacao 1.'SIM'2.'NAO'");
                    whi=ler.nextInt();
                    if(whi==1){
                        continue;
                    }else{
                        break;
                    }
                case 4://visualizar favoritos
                    System.out.println("--------------------------------------");
                        for(i=0;i<10;i++){
                            if(fav[i].getNome()!=null){
                                System.out.println(fav[i].getNome());
                                System.out.println(fav[i].getNumero_conta());
                            }
                        }
                        System.out.println("deseja realizar outra operacao 1.'SIM'2.'NAO'");
                        whi=ler.nextInt();
                        if(whi==1){
                            continue;
                        }else{
                            break;
                        }
                case 5:// adicionar favoritos
                    System.out.println("--------------------------------------");
                    int r=1;
                
                    while(r==1){
                        System.out.println("digite um nome de usuario");
                        nome=ler.nextLine();
                        nome=ler.nextLine();
                        System.out.println("digite o numero da conta");
                        String numero_conta = ler.nextLine();
                        
                        while(t<10){
                            fav[t].setNome(nome);
                            fav[t].SetNumero_conta(numero_conta);
                            t++;
                            break;
                        }
                        System.out.println("deseja cadastrar outro favorito 1.'SIM'2.'NAO'");
                        r=ler.nextInt();
                        if(r==1){
                            continue;
                        }else{
                            break;
                    }//else 
                }//while case 5
            }//switch
        }//while antes case
    }//main
}//main