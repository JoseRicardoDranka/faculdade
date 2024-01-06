package br.edu.ifsc.model;
import br.edu.ifsc.model.*;


public class Professor extends Pessoa{
    private AreaAtuacao areaAtuacao;

    public AreaAtuacao getAreaAtuacao() {
        return this.areaAtuacao;
    }

    public void setAreaAtuacao(AreaAtuacao areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public Professor(String nome,String cpf,AreaAtuacao areaAtuacao) {
        super(nome,cpf);
        this.areaAtuacao = areaAtuacao;
    }

    @Override
    public void imprimeminhasinformacoes() {
        System.out.println("Meu Nome é :"+ this.getNome());        
    }

    @Override
    public boolean autentica() {

        return false;
    }

}