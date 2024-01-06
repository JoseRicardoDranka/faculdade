public class lapis implements Escrita {
    protected String color;

    public lapis(String color){
        this.color=color;
    }
    @Override
    public void escrever(String texto) {
        System.out.println(String.format("lapis -> cor: %s | texto %s", this.color,texto));
        
    }
    
}
