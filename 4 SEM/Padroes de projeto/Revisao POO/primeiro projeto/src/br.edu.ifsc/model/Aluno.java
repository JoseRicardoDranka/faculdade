package br.edu.ifsc.model;

public class Aluno extends Pessoa {

    private String matricula;

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Aluno(String nome,String cpf ,String matricula) {
        super(nome,cpf);
        this.matricula = matricula;
    }
    @Override
    public void imprimeminhasinformacoes() {
        System.out.println("Meu Nome é :"+ this.getNome());        
    }

    @Override
    public boolean autentica() {
        // TODO Auto-generated method stub
        return false;
    }

}
