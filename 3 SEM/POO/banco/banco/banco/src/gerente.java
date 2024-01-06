import java.util.ArrayList;

public class gerente {
    private int id;
    private String nome;
    private String senha;
    private int cpf;
    private boolean login;
    // private ContaCorrente contaCorrente;
    private ArrayList<ContaCorrente> alContas = new ArrayList<ContaCorrente>();

    public gerente(int id, String nome, String senha, int cpf, boolean login) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
        this.login = login;
    }

    //so é possivel se a conta logada for gerente 
    public void novaconta(ContaCorrente contaCorrente){
        alContas.add(contaCorrente);
    }
    //so é possivel se a conta logada for gerente 
    public void fecharconta(int numeroConta){
        alContas.remove(numeroConta);
    }

    //so é possivel se a conta logada for gerente 
    public void editarnumero(int numero ,int numeronovo){
        for(int i = 0; i < alContas.size(); i++) {
            int x = alContas.get(i).getNumeroConta();
            if(x== numero){//verificva se o numero antigo é valido
                alContas.get(i).numeroConta = numeronovo;//aplica novo numero de conta
                System.out.println("numero trocado com sucesso");
            }else{
                System.out.println("falha ao localizar conta");
            }
        }
    }

    //so é possivel se a conta logada for gerente 
    public void desbloquearcartao(int numeroConta){
        for(int i = 0; i < alContas.size(); i++) {
            int x = alContas.get(i).getNumeroConta();
            if(x == numeroConta && alContas.get(i).getCartao()==false){//verifica se a conta ja possui o cartao desbloquado ou nao
                alContas.get(i).cartao=true;//se cartao bloqueado desbloqueia cartao
                System.out.println("cartao desbloqueado");
            }else if (x== numeroConta && alContas.get(i).getCartao()==true){
                System.out.println("cartao ja esta desbloquado");//se cartao desbloquado retorna menssagem ja desbloquado 
            }else{
                System.out.println("nao foi possivel localizar conta");//se a conta for inesistente
            }
        }
    }


    public void trans(int idOrigem, int idDestino, double valor) {
        this.alContas.get(idOrigem).RetirarDinheiro(valor);
        this.alContas.get(idDestino).AdicionarDinheiro(valor);
        }

    public boolean getLogin() {
        return this.login;
    }
    public void setLogin(boolean login) {
        this.login = login;
    }


    
    public int getId() {
	    return this.id;
    }

    public void setId(int id) {
	    this.id = id;
    }


    public String getNome() {
    	return this.nome;
    }
    public void setNome(String nome) {
    	this.nome = nome;
    }


    public String getSenha() {
    	return this.senha;
    }
    public void setSenha(String senha) {
    	this.senha = senha;
    }


    public int getCpf() {
    	return this.cpf;
    }
    public void setCpf(int cpf) {
    	this.cpf = cpf;
    }
    public boolean logingerente(int id, String senha){
        if(id==this.id && senha.equals(this.senha)){//verifica se existe e se esta certo id e senha do gerente
            this.login=true;
            System.out.println("logado com sucesso");
        }else{
            this.login=false;
            System.out.println("falha no login");
        }
        return login;//retorna true ou false para login do gererte
    }
    
} 
