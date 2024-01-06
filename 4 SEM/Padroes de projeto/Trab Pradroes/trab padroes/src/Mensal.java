public class Mensal implements InterfacePagto {

    private float valorDiaria=10;
    private int dias=30;
    private float valortotal;

    @Override
    public double calcular() {
        valortotal=valorDiaria*dias;
        return valortotal;
    }
    
}
