

public class Conta {
    private int numero;
    private int agencia;
    private double saldo;
    private String titular;

 
    public Conta(int numero,int agencia,String titular, double saldo) {
        this.numero=numero;
        this.agencia=agencia;
        this.saldo=saldo;
        this.titular=titular;
    }

	public void Deposito (Double valor){
        this.saldo=this.saldo+valor;
    }
    public void Retirada(double valor){
        this.saldo=this.saldo-valor;
    }
    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void Mostrarconta(){
        System.out.println("Numero da conta: "+this.numero);
        System.out.println("Numero da agencia: "+this.agencia);
        System.out.println("Saldo: "+this.saldo);
        System.out.println("Nome titular: "+this.titular);
    }
    
}
