
public class Tabuleiro extends Placar {
    private String t1[][];
    private Jogador j1;
    private Jogador j2;

    public Tabuleiro(Jogador j1, Jogador j2) {
        this.j1 = j1;
        this.j2 = j2;
        this.t1 = new String[3][3];

    }

    public void zerar() {// mudar para for

        for (int i = 0; i < 3; i++) {
            for (int y = 0; y < 3; y++) {
                t1[i][y] = " ";
            }
        }
    }

    public boolean checar() {

        if(t1[1][1].equalsIgnoreCase(t1[0][0]) && t1[2][2].equalsIgnoreCase(t1[0][0]) || t1[0][2].equalsIgnoreCase(t1[1][1]) && t1[0][2].equalsIgnoreCase(t1[2][0])
         && !t1[1][1].equalsIgnoreCase((" "))){
            if (t1[1][1].equalsIgnoreCase("x")){
                 System.out.println(j1.getNome()+" Venceu !!");
                super.ponto("j1");
                return true;
            } else if(t1[1][1].equalsIgnoreCase("o")) {
                System.out.println(j2.getNome()+" Venceu !!");
                super.ponto("j2");
                return true;

            }
        }

        for (int i = 0; i < 3; i++) {

            if (t1[i][0].equalsIgnoreCase(t1[i][1]) && t1[i][2].equalsIgnoreCase(t1[i][0])
                    && !t1[i][0].equalsIgnoreCase((" ")) ||

                     t1[0][i].equalsIgnoreCase(t1[1][i]) && t1[2][i].equalsIgnoreCase(t1[0][i])
                    && !t1[0][i].equalsIgnoreCase((" "))) {
                if (t1[i][0].equalsIgnoreCase("x") || (t1[0][i].equalsIgnoreCase("x"))) {
                    System.out.println(j1.getNome()+" Venceu !!");
                    super.ponto("j1");
                } else {
                    System.out.println(j2.getNome()+" Venceu !!");
                    super.ponto("j2");

                }
                return true;

            }

        }
        return false;
    }

    public void print() {
        System.out.printf("\nTabuleiro: \n");
        System.out.println("=======");
        for (int i = 2; i >= 0; i--) {
            String a = t1[i][0];
            String b = t1[i][1];
            String c = t1[i][2];
            System.out.println("|" + a + "|" + b + "|" + c + "|");
        }
        System.out.println("=======");
        System.out.println();

    }

    public boolean aloc(int i, int y, Jogador jogador) {
        boolean val = false;
        while (val == false) {
            if (i >= 0 && i >= 0 && y < 3 && i < 3) {
                if (t1[i][y] == " ") {
                    if (jogador.getId() == 1) {
                        t1[i][y] = "x";
                        val = true;
                    } else if (jogador.getId() == 2) {
                        t1[i][y] = "O";
                        val = true;
                    } else {
                        System.out.println("pos invalida");
                        break;
                    }
                } else {
                    System.out.println("pos invalida");
                    break;
                }
            } else {
                System.out.println("pos invalida");
                break;
            }
        } // while
        return val;
    }// aloc

    @Override
    public void mostrarPontos() {
        super.mostrarPontos();
    }

    @Override
    public void tempototalj2() {
        super.tempototalj2();
    }

    @Override
    public void tempototalj1() {
        super.tempototalj1();
    }

    @Override
    public void iniciotempojogada(String Jogador) {
        super.iniciotempojogada(Jogador);
    }

    @Override
    public void fimtempojogada(String Jogador) {
        super.fimtempojogada(Jogador);
    }

    @Override
    public void mostartempo() {
        super.mostartempo();
    }

    @Override
    public void zerartempo() {
        super.zerartempo();
    }
}
