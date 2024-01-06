public class Caneta implements Escrita {
    protected String cor;
    public Caneta(String cor){
        this.cor=cor;
    }
    @Override
    public void escrever(String texto) {
        System.out.println(String.format("CANETA: -> cor: %s | Texto: %s", this.cor,texto));
    }
    
}
