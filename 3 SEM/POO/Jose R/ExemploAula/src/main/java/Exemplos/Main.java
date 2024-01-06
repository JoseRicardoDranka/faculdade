
package Exemplos;


public class Main {
    public static void main(String[] args){
        Endereco e = new Endereco();
        e.setBairro("Centro");
        e.setNumero(89);
        e.setRua("Estrada");
        Endereco b= new Endereco();
        b.setBairro("Campo");
        b.setNumero(15);
        b.setRua("Avenida");
  
        Pessoa p1 = new Pessoa(e);
        Pessoa p2 = new Pessoa(b);
        p1.AdcEndereco(e);
        p1.Endereco();
    }
}