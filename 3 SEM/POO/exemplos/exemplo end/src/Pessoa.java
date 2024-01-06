import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private ArrayList<Endereco> alEndereco=new ArrayList<Endereco>();
    
    public Pessoa (Endereco endereco){
        this.alEndereco.add(endereco);
    }

    public void endereco(){
      for(int i=0; i< alEndereco.size();i++){
        System.out.println(alEndereco.get(i).getBairro());
        System.out.println(alEndereco.get(i).getNumero());
        System.out.println(alEndereco.get(i).getRua());
      }
    }
    public void addendereco (Endereco endereco) {
        this.alEndereco.add(endereco);
      }
}
