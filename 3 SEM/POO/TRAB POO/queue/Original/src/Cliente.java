public class Cliente implements Comparable<Cliente> {
    private String nome;
    private int idade;

    

    public Cliente() {//contrutor vazio
        }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
    	return this.idade;
    }
    public void setIdade(int idade) {
    	this.idade = idade;
    }

    @Override
    public int compareTo(Cliente c) {//methodo da classe camparable para "habilitar" priority queue
        if(this.idade > 60){
            return 1;
        }else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Cliente [idade=" + idade + ", nome=" + nome + "]";
    }



    
}
