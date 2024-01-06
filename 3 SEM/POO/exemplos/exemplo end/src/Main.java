import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Endereco e= new Endereco();
        Endereco e1= new Endereco();
        Pessoa p1= new Pessoa(e);
        Pessoa p2= new Pessoa(e);
        e.setBairro("jardim");
        e.setNumero("13");
        e.setRua("Walmor");
        e1.setBairro("campo");
        e1.setNumero("18");
        e1.setRua("expedicionario");

        try (Scanner ler = new Scanner(System.in)) {
            int x=0;
            while(x<5){
                System.out.println("1 show end,2 add end");
                x=ler.nextInt();
                switch(x){
                    case 1:
                        p1.endereco();
                        p2.endereco();
                    break;

                    case 2:
                        p1.addendereco(e1);
                        
                    break;
                }
            }
        }
    }
}
