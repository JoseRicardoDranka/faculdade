import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("        BEM VINDO");
            System.out.println("PLAYER 1 :");
            Jogador p1 = new Jogador(1, s.nextLine());
            System.out.println("PLAYER 2 :");
            Jogador p2 = new Jogador(2, s.nextLine());
            Tabuleiro t = new Tabuleiro(p1, p2);
            int cont = 0, posx = 0, posy = 0;// contador par passar vez do jogador //posiçao X e posiçao Y
            boolean xxxx;// contador validade da peça
            int swt = 0;// contador switch
            boolean fim = false;// Contador para ver se ha possiveis jogadas
            t.zerar();// zera o tabuleiro

            while (swt < 9) {
                System.out.println("\nEscolha uma opçao:"
                        + "\n1 - Jogar"
                        + "\n2 - Zerar pontos"
                        + "\n3 - Mostar informaçoes de jogo"
                        + "\n9 - Sair do jogo");

                swt = s.nextInt();// entrada da escolha
                switch (swt) {
                    case 1:// jogar
                        fim = false;
                        cont = 0;
                        t.zerar();
                        t.zerartempo();
                        while (fim == false) {
                            if (cont == 0) {
                                t.iniciotempojogada("j1");// inicia contador de tempo de jogada
                                System.out.println("jogador 1 pos x");
                                posx = s.nextInt();// entrada pos X
                                System.out.println("jogador 1 pos y");
                                posy = s.nextInt();// entrada pos y
                                xxxx = t.aloc(posx, posy, p1);// retorna se peça é valida ou nao
                                if (xxxx == true) { // verifica se a peça é valida se True peça valida
                                    cont++;// passa para jogador 2
                                    t.fimtempojogada("j1");// para contador de tempo de jogada
                                    t.tempototalj1();// soma tempo da jogada atual com jogas anteriores para chegar ao
                                                     // tempo total de jogo
                                    t.mostartempo();// mostra o tempo da jogada
                                    fim = t.checar();// verifica se houve vitorias
                                    t.print();// mostra tabuleiro
                                } else {
                                    System.out.println("pos invalida");
                                }
                            } else if (cont == 1) {
                                t.iniciotempojogada("j2");// inicia contador de tempo da jogada
                                System.out.println("jogador 2 pos x");
                                posx = s.nextInt();// entrada pos x
                                System.out.println("jogador 2 pos y");
                                posy = s.nextInt();// entrada pos Y
                                xxxx = t.aloc(posx, posy, p2);// retorna se peça é valida ou nao
                                if (xxxx == true) { // verifica se a peça é valida
                                    cont = 0;// volta jogador 1
                                    t.fimtempojogada("j2");// para contador de tempo de jogada
                                    t.tempototalj2();// soma tempo da jogada atual com jogas anteriores para chegar ao
                                                     // tempo total de jogo
                                    t.mostartempo();// mostra tempo da jogada
                                    fim = t.checar();// verifica se houve vitoria
                                    t.print();// mostra tabuleiro
                                } else {
                                    System.out.println("pos invalida");
                                } // else
                            } // else if
                        } // while
                        break;

                    // =============================================================================
                    case 2:// zerar Jogo
                        System.out.println("Zerando os pontos...");
                        t.zerarpontos();
                        break;
                    // =============================================================================
                    case 3:// Mostrar info de jogo
                        t.mostartempo();
                        t.mostrarPontos();
                        t.print();
                        break;

                    case 9:
                        System.out.println("Saindo...");
                        break;
                }// switch
            } // while
        } // try
    }// main
}// app