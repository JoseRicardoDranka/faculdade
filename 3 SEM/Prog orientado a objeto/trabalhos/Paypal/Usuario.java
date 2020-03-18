public class Usuario {
    private String nome="Jose";
    private String numero_conta="00000000-0";
    private float carteira=300.00f;

    public void setNome(String nome){
        this.nome=nome;
    }
    public void setConta(String conta){
        this.numero_conta=conta;
    }
    public void setCarteira(float carteira){
        this.carteira=carteira;
    }
    public String getNome(){
        return this.nome;
    }
    public String getConta(){
        return this.numero_conta;
    }
    public float getCarteira(){
        return this.carteira;
    }
}