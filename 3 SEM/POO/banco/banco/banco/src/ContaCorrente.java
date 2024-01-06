public class ContaCorrente {
	
	int numeroConta;
	private double saldo;
	private int senha;
    Boolean cartao;
    private boolean login;
   	// private ArrayList<ContaCorrente> alContas = new ArrayList<ContaCorrente>();

	public double AdicionarDinheiro(double adicionar) {
		this.saldo = saldo + adicionar;// soma valor de parametro com valor na conta
		return saldo;	
	}

	public double RetirarDinheiro(double retirar) {
		this.saldo = saldo - retirar;// sub valor de parametro com valor na conta
		return saldo;	
	}
	

	//usuario realiza login em conta Corrente
    
    public void saque(double valor){
        if(login == true){//verifica se o usuraio esta logado na conta
			if(saldo>valor){
            	this.saldo=(saldo-valor);//verifica se possui saldo na conta
            	System.out.println("saque efetuado com sucesso");
			}else{
				System.out.println("saldo insuficiente");
			}
        }else{
            System.out.println("voce precisa estar logado para realizar saque");
        }
    }
        
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldoant) {
		this.saldo = saldoant;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}

    public boolean getCartao() {
	        return this.cartao;
    }
    public void setCartao(boolean cartao) {
	    this.cartao = cartao;
    }
    public boolean isLogin() {
		return login;
	}

	public void setLogin(boolean login) {
		this.login = login;
	}

	public void setCartao(Boolean cartao) {
		this.cartao = cartao;
	}

}
