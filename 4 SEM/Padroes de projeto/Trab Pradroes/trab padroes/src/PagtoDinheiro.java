public class PagtoDinheiro extends AbstractPagamento {

    public PagtoDinheiro(float valor, int parcelas) {
        super(valor, parcelas);
    }

    @Override
    public double calculartotal() {
        return this.getValor()*0.90;
    }
    
}
