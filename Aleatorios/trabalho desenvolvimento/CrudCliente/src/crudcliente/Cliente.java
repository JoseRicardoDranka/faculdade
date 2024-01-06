package crudcliente;

public class Cliente {
    public int id;
    public String nome;
    public String sobrenome;
    public String telefone;
    public String logradouro;
    public String numero;
    public String bairro;
    public int id_cidade;

    public Cliente(String nomeTF, String sobrenomeTF, String telefoneTF, String logradouroTF, String numeroTF, String bairroTF, int id_cidadeTF) {
        this.nome = nomeTF;
        this.sobrenome = sobrenomeTF;
        this.telefone = telefoneTF;
        this.logradouro = logradouroTF;
        this.numero = numeroTF;
        this.bairro = bairroTF;
        this.id_cidade = id_cidadeTF;
    }

    Cliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getId_cidade() {
        return id_cidade;
    }

    public void setId_cidade(int id_cidade) {
        this.id_cidade = id_cidade;
    }
            
    
}
