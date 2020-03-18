public class Historico {
    private String data;
    private String nome;
    private float valor;
    private String numero_conta;


	public Historico() {
	}
	public void setNome(String nome){
        this.nome=nome;
    }
    public void setData(String data){
        this.data=data;
    }
    public void setValor(float valor){
        this.valor=valor;
    }
    public void setConta(String conta){
        this.numero_conta=conta;
    }
    public String getNome() {
        return this.nome;
    }
    public float getValor(){
        return this.valor;
    }
    public String getData(){
        return this.data;
    }
    public String getConta(){
        return this.numero_conta;
    }
}