import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Tabuleiro t=new Tabuleiro();
        try (Scanner s = new Scanner(System.in)) {
            int cont=0,posx=0,posy=0;
            boolean xxxx;//contador
            boolean fim=false;
            t.zerar();
            t.print();
            //Player1 p1=new Player1();
            //Player2 p2=new Player2();

            while(fim==false){
                if(cont==0){
                    System.out.println("jogador 1 pox x");
                    posx=s.nextInt();
                    System.out.println("jogador 1 pox y");
                    posy=s.nextInt();
                    xxxx=t.aloc(posx, posy, "X");
                    if(xxxx==true){ //verifica se a peça é valida se True peça valida
                        cont++;
                        fim=t.checar();
                        t.print();
                    }else{
                        System.out.println("pos invalida");
                    }
                }else if(cont==1){
                    System.out.println("jogador 2 pox x");
                    posx=s.nextInt();
                    System.out.println("jogador 2 pox y");
                    posy=s.nextInt();
                    xxxx=t.aloc(posx, posy, "O");
                    if(xxxx==true){ 
                        cont=0;
                        fim=t.checar();
                        t.print();
                    }else{
                        System.out.println("pos invalida");
                    }//else
                }//else if
            }//while
        } 
    }
}
