public class Receita {

    
    private String nome;
    private String descicao;
    private int Numporcoes;
    private double custoreceita;

    
    public Receita(String nome, String descicao, int Numporcoes, double custoreceita) {
        this.nome = nome;
        this.descicao = descicao;
        this.Numporcoes = Numporcoes;
        this.custoreceita = custoreceita;
    }
    public double custoporçao(double valor){
        return valor=(this.custoreceita*Numporcoes);

    }

    public String getNome() {
    	return this.nome;
    }
    public void setNome(String nome) {
    	this.nome = nome;
    }


    public String getDescicao() {
    	return this.descicao;
    }
    public void setDescicao(String descicao) {
    	this.descicao = descicao;
    }


    public int getNumporcoes() {
    	return this.Numporcoes;
    }
    public void setNumporcoes(int Numporcoes) {
    	this.Numporcoes = Numporcoes;
    }


    public double getCustoreceita() {
    	return this.custoreceita;
    }
    public void setCustoreceita(double custoreceita) {
    	this.custoreceita = custoreceita;
    }


    
}
