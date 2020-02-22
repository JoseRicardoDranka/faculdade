public class Pessoa{
    float altura;
    float peso;
    int idade;
    String nome;
    
    public void imprimir () {
        /* chamamos o metodo println do atributo "out" da classe system */
        System.out.println("nome: "+ nome);
        System.out.println("altura: "+ altura);
        
        if(peso>60)
            System.out.println("Vai fazer dieta GORDO FDP");
        
        System.out.println("peso: "+ peso);
        System.out.println("idade: "+ idade);
        
    }
    public boolean ehIgual(Pessoa pessoa){
        if (this.altura != pessoa.altura)
            return false;
        if(this.idade!=pessoa.idade)
            return false;
        if(this.nome!=pessoa.nome)
            return false;            
        if(this.peso!=pessoa.peso)
            return false;
        return true;
    }       
public String imprimeNome(){
    return this.nome;
    }
}