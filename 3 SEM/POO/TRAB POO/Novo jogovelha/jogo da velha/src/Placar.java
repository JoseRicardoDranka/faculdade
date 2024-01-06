public abstract class Placar {

    protected int pontosJogador1 = 0;
    protected int pontosJogador2 = 0;
    protected long tempoJogador1;
    protected long tempoJogador2;
    protected long fimjogador1;
    protected long fimjogador2;
    protected long tempototalJ1;
    protected long tempototalJ2;

    protected void ponto(String jogador) {
        if (jogador == "j1") {
            this.pontosJogador1++;
        } else if (jogador == "j2") {
            this.pontosJogador2++;
        }
    }

    public void tempototalj1() {
        tempototalJ1 = (tempototalJ1 + fimjogador1);
    }

    public void tempototalj2() {
        tempototalJ2 = (tempototalJ2 + fimjogador2);
    }

    protected void zerartempo() {
        fimjogador1 = 0;
        fimjogador2 = 0;
        tempoJogador1 = 0;
        tempoJogador2 = 0;
        tempototalJ1 = 0;
        tempototalJ2 = 0;
    }

    protected void zerarpontos() {
        this.pontosJogador1 = 0;
        this.pontosJogador2 = 0;
    }

    protected void iniciotempojogada(String jogador) {
        if (jogador == "j1") {
            tempoJogador1 = System.currentTimeMillis();
        } else if (jogador == "j2") {
            tempoJogador2 = System.currentTimeMillis();
        }
    }

    protected void fimtempojogada(String jogador) {
        if (jogador == "j1") {
            fimjogador1 = (System.currentTimeMillis() - (tempoJogador1)) / 1000;
        } else if (jogador == "j2") {
            fimjogador2 = (System.currentTimeMillis() - (tempoJogador2)) / 1000;
        }
    }

    protected void mostrarPontos() {
        System.out.println(
                "Placar\n" + "[pontosJogador1: " + pontosJogador1 + ", pontosJogador2: " + pontosJogador2 + "]");
    }

    protected void mostartempo() {
        System.out.println("Placar\n" + "Tempo da jogada J1: " + fimjogador1 + " segundos\n" + "tempo Total J1: "
                + tempototalJ1 + " segundos\n" + "tempo da jogada J2: " + fimjogador2 + " segundos\n"
                + "tempo total J2: " + tempototalJ2 + " segundos \n" + "");
    }
}