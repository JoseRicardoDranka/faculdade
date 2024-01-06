import java.util.Scanner;

    public static void main(String[] args) throws Exception {
        Conta c;
        c=new Conta(0, 0, null, 0);
        try (Scanner leitor = new Scanner(System.in)) {
            int num=0;
            System.out.println("escolha uma opçao 1:registar conta :2 Realizar deposito 3: Realizar saque 4:Mostrar conta");
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
                    c.Deposito(0);
                    break;
                case 3:
                    c.Retirada(0);
                    break;
                case 4:
                    c.Mostrarconta();
                    break;
            }
        }
    }
