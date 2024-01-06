package com.example.crudcliente;

public class Cliente {
     public int id;
     public String nome;
     public String sobrenome;
     public String telefone;
     public String logradouro;
     public String numero;
     public String bairro;
     public String cidade;

     public Cliente(String nome, String sobrenome, String telefone, String logradouro, String numero, String bairro, String cidade) {
          this.nome = nome;
          this.sobrenome = sobrenome;
          this.telefone = telefone;
          this.logradouro = logradouro;
          this.numero = numero;
          this.bairro = bairro;
          this.cidade = cidade;
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

     public String getCidade() {
          return cidade;
     }

     public void setCidade(String cidade) {
          this.cidade = cidade;
     }
}
