import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {
        Conta c;
        c=new Conta(0, 0, null, 0);
        try (Scanner leitor = new Scanner(System.in)) {
            int num=0;
            while(num<5){
                System.out.println("escolha uma opçao 1: registar conta : 2 Realizar deposito 3: Realizar saque 4: Mostrar conta 5: sair");
                num=leitor.nextInt();
                switch(num){
                    case 1:
                        c= new Conta(0, 0, null, 0);
                        c.setNumero(1);
                        c.setAgencia(365);
                        c.setSaldo(2750.45);
                        c.setTitular("Jose Ricardo");
                        break;
                    case 2:
                        System.out.println("valor");
                        double valord = leitor.nextDouble();
                        c.Deposito(valord);
                        break;
                    case 3:
                        double saldo= c.getSaldo();
                        System.out.println("valor");
                        double valorr = leitor.nextDouble();
                        if(saldo<=valorr){
                            System.out.println("aguarde contagem de notas");
                        }else{
                            System.out.println("fundos insuficiente");
                        }
                        c.Retirada(valorr);
                        break;
                    case 4:
                        c.Mostrarconta();
                        break;
                }
            }
        }
    }
}
