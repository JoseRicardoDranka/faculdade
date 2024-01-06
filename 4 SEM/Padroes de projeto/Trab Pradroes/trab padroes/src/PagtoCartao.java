
public class PagtoCartao extends AbstractPagamento {
    
    
    private int parcelas;
    
    public int getParcelas() {
        return parcelas;
    }



    public PagtoCartao(float valor, int parcelas) {
        super(valor, parcelas);
        this.parcelas = parcelas;
    }



    @Override
    public double calculartotal() {
        
        return this.getValor()/parcelas;
    }

    
}