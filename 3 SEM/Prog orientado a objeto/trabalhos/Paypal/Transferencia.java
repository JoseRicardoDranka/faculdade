public class Transferencia {
    private String data;
    private String nome;
    private float valor;

    public void setNome(String nome){
        this.nome=nome;
    }
    public void setData(String data){
        this.data=data;
    }
    public void setValor(float valor){
        this.valor=valor;
    }
    public String getNome() {
        return this.nome;
    }
    public String getData(){
        return this.data;
    }
    public float getValor(){
        return this.valor;
    }
}