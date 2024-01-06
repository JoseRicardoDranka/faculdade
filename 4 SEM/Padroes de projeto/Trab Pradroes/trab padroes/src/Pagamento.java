public class Pagamento {
    private InterfacePagto pagamento;
    private Carro carro;



    public Pagamento(InterfacePagto pagamento, Carro carro) {
        super();
        this.pagamento = pagamento;
        this.carro = carro;
    }
    public float total(){
        return (float) pagamento.calcular();
    }
}
