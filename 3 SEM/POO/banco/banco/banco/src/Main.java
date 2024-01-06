import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) throws Exception {

        
        Usuario u = null;

        
        // Quando cria o objeto da classe gerente tem que passar no construtor a CContaCorrente
        gerente ger = new gerente(0, "Jose", "123", 1234, true);
        try (Scanner s = new Scanner(System.in)) {
            ContaPoupança contaP = new ContaPoupança();
            
           

            int x=1;//variavel para o switch e while
            Random random = new Random();
            String numeroale="";//variavel para armazena um vetor de numeros em formato String
            int array[] = new int[9]; // 9 números serão gerados.
        

            while(x!=0){
                System.out.println("Escolha uma opção\n 1:Logar conta \n 2:Realizar saque\n 3:Logar gerente\n 4:Desbloquear cartao\n 5:Editar conta\n 6:Abrir/Fechar conta corrente\n 7:Saque conta poupança\n 8:Deposito conta poupança \n 0:Fechar");
                x=s.nextInt();
                switch (x) {
                    case 1:
                        System.out.println("digite numero da conta");
                        int conta=s.nextInt();
                        System.out.println("digite sua senha");
                        int senha=s.nextInt();
                        u.Login(conta, senha);//methodo login  conta corrente
                        break;
                
                    case 2:
                        System.out.println("digite o valor");
                        double valor=s.nextDouble();
                        u.getContaCorrente().saque(valor);//methodo saque conta corrente
                        break;
                    
                    case 3:
                        System.out.println("digite seu id");
                        int id=s.nextInt();
                        System.out.println("digite sua senha");
                        String senhag = s.next();
                        ger.logingerente(id, senhag);//methodo login gertente
                        break;
                    case 4:
                        if(ger.getLogin()){//se o gerete estiver logado libera o methodo desbloquar cartao na conta corrente
                            System.out.println("informe numero da conta");
                            conta=s.nextInt();
                            ger.desbloquearcartao(conta);
                        }else{
                            System.out.println("gerente nao esta logado");
                        }
                        break;
                    case 5:
                        if(ger.getLogin()){// se o gerete estiver logado libera o methodo editar na conta corrente
                            System.out.println("informe numero da conta");// passa o numero da conta antiga para localizar no array
                            conta=s.nextInt();
                            for (int i=0; i<array.length; i++) {
                                array[i] = random.nextInt(9); // Gera números aleatórios entre os valores 0~9
                                numeroale=""+array[i] +numeroale;//salva o numero gerando em String contatenado com o proximo numero
                            }
                            int numero =Integer.parseInt(numeroale);//transforma os numeros salvos em String para int
                            ger.editarnumero(conta, numero);//passa o numero da conta antiga como parametro e a nova gerada por meio do for para sobrescrever a antiga
                        }else{
                            System.out.println("gerente nao esta logado");
                        }
                        break;
                    case 6:
                        System.out.println("1:abrir 2:fechar");//abre um segundo menu de escolha
                        int z=s.nextInt();
                        if(z==1){
                            u = new Usuario("Tiago", "SM", 123, 987, contaP, new ContaCorrente());
                            if(ger.getLogin()==true){//verifica se é o gerente q esta logado
                                ger.novaconta(u.getContaCorrente());//abre addiciona um novo objeto no array 
                            }else{
                                System.out.println("gerente nao esta logado");
                            }
                        }else if(z==2){
                            System.out.println("informe o numero da conta");
                            int numeroconta=s.nextInt();
                            ger.fecharconta(numeroconta);//remove um objeto no array com o numero de parametro
                        }else{
                            System.out.println("opçao invalida");//volta para o menu principal
                        }
                        break;
                    case 7:
                        System.out.println("digite um valor");
                        valor=s.nextDouble(); 
                        contaP.saquePoupança(valor);//methodo saque conta poupança
                        break;
                    case 8:
                        System.out.println("digite um valor");
                        valor=s.nextDouble();
                        contaP.depositarPoupança(valor);//methodo deposito conta poupança
                        break;
                    case 9:
                        System.out.println("idorigem");
                        int idOrigem=s.nextInt();
                        System.out.println("idDestino");
                        int idDestino =s.nextInt();
                        System.out.println("valor");
                        valor =s.nextFloat();
                        ger.trans(idOrigem, idDestino, valor);
                        break;
                }
            }
        }
    }
}

