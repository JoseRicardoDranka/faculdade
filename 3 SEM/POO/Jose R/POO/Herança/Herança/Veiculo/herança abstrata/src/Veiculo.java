public abstract class Veiculo {
    protected double velocidade;
    protected boolean status;

    public void ligar(){
        this.status=true;
    }
    public String mostrarStatus(){
        return String.format("status: %b |velocidade: %2.2f",this.status, this.velocidade);
    }

    public abstract void acelerar();
}
