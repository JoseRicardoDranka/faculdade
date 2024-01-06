package br.edu.ifsc.controller;

import br.edu.ifsc.model.*;

public class Impressora {
    public static void imprime(Pessoa p) {
        System.out.println("Nome: "+p.getNome());
        System.out.println("CPF: "+p.getCpf());
    }
    public static void imprime(AreaAtuacao a) {
        System.out.println( "Grande Area: "+a.getGrandeArea());
        System.out.println("SubArea: "+a.getSubArea());
    }
}
