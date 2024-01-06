public class Funcionario extends PessoaFisica {
    private String cartao;

public String getCartao() {
	return this.cartao;
}
public void setCartao(String cartao) {
	this.cartao = cartao;
}
public Funcionario(String nome, String rg, String cartao) {
    super(nome, rg);
    this.cartao = cartao;
}


    
}
