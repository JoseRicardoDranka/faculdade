
public abstract class AbstractPagamento {
    
    private double valor;
    private int parcelas;
    
    
    
    
    

    public int getParcelas() {
        return parcelas;
    }

    public AbstractPagamento(double valor, int parcelas) {
        super();
        this.valor = valor;
        this.parcelas=parcelas;
    }

    public abstract double calculartotal(); 

    public double getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    
}