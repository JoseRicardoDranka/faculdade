public abstract class jogo implements play {
    protected double velocidade;
    protected double altura;
    protected double forca;

    protected abstract String caracteristicas();

    @Override
    public void andar(double velocidade) {
        this.velocidade=velocidade;
    }

    @Override
    public void pular(double altura) {
        this.altura=altura;
        
    }

    @Override
    public void chutar(double forca) {
        this.forca=forca;
        
    }


    public void mostrarStatus(){
        System.out.println(String.format("Velocidade: %2.2f altura: %1.2f força: %2.2f caracteristica: %s", this.velocidade,this.altura,this.forca,caracteristicas()));
    }
    
}
