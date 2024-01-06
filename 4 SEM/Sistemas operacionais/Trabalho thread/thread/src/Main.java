import java.util.Scanner;

public class Main extends Thread {
    public static void main(String[] args) throws Exception {
        int auxWhile=1,hora,minuto,segundo;
        Scanner sc =new Scanner(System.in);
        
        ThreadRelogio tr =new ThreadRelogio();
        ThreadCronometro tc =new ThreadCronometro();// instanciando obejetos das classes criadas por min
        ThreadAlarme ta=new ThreadAlarme();
        
        new Thread(tr).start();
        new Thread(tc).start();//iniciando as Threads passando os objetos criados acima como parametros
        new Thread(ta).start();


        while (auxWhile != 0){
            System.out.println("\n\n escolhoa uma opçao \n\n 1: Ajustar horario \n\n 2: Visualizar horario \n\n 3:Iniciar cronometro \n\n 4: para e mostrar atempo do cronometro \n\n 5: zerar chronometro \n\n 6:Retornar Cronometro \n\n 7:definir alarme\n\n 0:sair");
            auxWhile = sc.nextInt();
            switch(auxWhile){
                
                case 1:
                System.out.println("digite uma hora");
                hora=sc.nextInt();
                System.out.println("minutos");
                minuto=sc.nextInt();
                System.out.println("segundos");
                segundo=sc.nextInt();
                tr.ajustarHora(hora, minuto, segundo);
                ta.ajustarHoraa(hora, minuto, segundo);
                break;

                case 2:
                System.out.println(tr.toString());
                break;

                case 3:
                tc.iniciarCronometro();
                break;

                case 4:
                tc.parar();
                break;

                case 5:
                tc.zerarCronometro();
                break;

                case 6:
                tc.retornar();
                break;

                case 7:
                System.out.println("digite a hora");
                hora=sc.nextInt();
                System.out.println("minuto");
                minuto=sc.nextInt();
                System.out.println("segundo");
                segundo=sc.nextInt();
                ta.difinirAlarme(hora, minuto, segundo);
            
            }//switch
        }//while
    }
}
