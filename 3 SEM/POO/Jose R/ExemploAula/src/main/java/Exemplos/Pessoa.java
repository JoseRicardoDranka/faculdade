package Exemplos;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private ArrayList<Endereco> alEndereco = new ArrayList<Endereco>();
    
    public Pessoa(Endereco endereco){
        this.alEndereco.add(endereco);
    }
    
    public void Endereco() {
        for(int i = 0; i < alEndereco.size(); i++){
            System.out.println("Bairro: " + alEndereco.get(i).getBairro());
            System.out.println("Número: " + alEndereco.get(i).getNumero());
            System.out.println("Rua: " + alEndereco.get(i).getRua());
        }
    }
    
    public void AdcEndereco(Endereco endereco){
        this.alEndereco.add(endereco);
    }
}
