import java.util.ArrayList;
import java.util.List;

import br.edu.ifsc.controller.*;
import br.edu.ifsc.model.*;

public class Main {
    public static void main(String[] args) throws Exception {
        AreaAtuacao dev = new AreaAtuacao("Informatica", "Desenvolvimento");
        Pessoa lucas = new Professor("Lucas", "11111", dev);
        Pessoa tobias = new Aluno("Tobias", "123124124", "321313124");

        Impressora.imprime(dev);
        Impressora.imprime(lucas);

        ControleAutenticacao.validaLogin(lucas);
        ControleAutenticacao.validaLogin(lucas);


        List<Pessoa>usuario=new ArrayList<Pessoa>();
        usuario.add(lucas);
        usuario.add(tobias);
        
        for(Pessoa p:usuario){
            System.out.println("Nome: "+p.getNome());
        }
    }

}
