public class Usuario {
    private String nome;
    private String endereco;
    private int cpf;
    private int telefone;
    private ContaPoupança contaPoupança;
    private ContaCorrente contaCorrente;
    // ContaCorrente contaC=new ContaCorrente();
    
    public Usuario(String nome, String endereco, int cpf, int telefone, ContaPoupança contaPoupança, ContaCorrente contaCorrente) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.telefone = telefone;
        this.contaPoupança = contaPoupança;
        this.contaCorrente = contaCorrente;
    }    


    public void Login(int numeroConta, int senha){
            if(this.contaCorrente.getNumeroConta()==numeroConta && this.contaCorrente.getSenha() == senha){
                this.contaCorrente.setLogin(true);
                System.out.println("login efetuado com sucesso");
            }else{
                System.out.println("falha ao efetuar login");
                this.contaCorrente.setLogin(false);
            }
        }






   public String getNome() {
   	return this.nome;
   }

    public ContaPoupança getContaPoupança() {
    return contaPoupança;
}


public void setContaPoupança(ContaPoupança contaPoupança) {
    this.contaPoupança = contaPoupança;
}


public ContaCorrente getContaCorrente() {
    return contaCorrente;
}


public void setContaCorrente(ContaCorrente contaCorrente) {
    this.contaCorrente = contaCorrente;
}


    public void setNome(String nome) {
   	this.nome = nome;
   }



    public String getEndereco() {
    	return this.endereco;
    }
    public void setEndereco(String endereco) {
    	this.endereco = endereco;
    }


    public int getCpf() {
    	return this.cpf;
    }
    public void setCpf(int cpf) {
    	this.cpf = cpf;
    }


    public int getTelefone() {
    	return this.telefone;
    }
    public void setTelefone(int telefone) {
    	this.telefone = telefone;
    }

    

} 