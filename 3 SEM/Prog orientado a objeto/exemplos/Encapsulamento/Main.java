    
public class Main{
    public static void main(String[] args) {
    
        Pessoa jardel = new Pessoa();
        //jardel.nome = "Jardeu P.";
        jardel.endereco = "Campo agua verde";
        jardel.telefone ="(47)99999-9999";

        Animal lhama=new Animal();
        lhama.nome = "kuzco";
        lhama.especie = "l.glama";
        lhama.idade = 666;
        lhama.peso = 44.5f;
        lhama.raca = "Não definido";
        lhama.responsavel = jardel;

        lhama.responsavel.nome = "teste";
        System.out.println(lhama.responsavel.nome);
        System.out.println(jardel.nome);
    
    }
}