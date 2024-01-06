public class item {
    private String nome;

    private String descriçao;
    private double preço;

public String getNome() {
	return this.nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
    public item(String nome, String descriçao, double preço) {
        this.nome = nome;
        this.descriçao = descriçao;
        this.preço = preço;
    }


    public String getDescriçao() {
    	return this.descriçao;
    }
    public void setDescriçao(String descriçao) {
    	this.descriçao = descriçao;
    }


    public double getPreço() {
    	return this.preço;
    }
    public void setPreço(double preço) {
    	this.preço = preço;
    }

}
