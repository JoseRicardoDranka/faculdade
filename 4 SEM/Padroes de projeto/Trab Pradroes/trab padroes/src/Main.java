public class Main {
    public static void main(String[] args) throws Exception {
        //BancoTelefone banco=new BancoTelefone();
        Telefone t=new Telefone("11111111");
        Carro c=new Carro("la voiture", "42h12ea");
        BancoTelefone b=new BancoTelefone(); //construindo banco de telefones
        Vaga v=new Vaga();

        v.setCarro(c);
        
        //v.ocupado();


        // banco.setNumero("11111111");
        // banco.setNumero("22222222");
        // banco.setNumero("33333333");
        // banco.setNumero("44444444");
        // banco.setNumero("55555555");

        Pagamento diaria=new Pagamento(new Diaria(), c);//valor diaria
        Pagamento mensal=new Pagamento(new Mensal(), c);//valor mensal
        Pagamento semanal=new Pagamento(new Semanal(), c);//valor semanal

        AbstractPagamento pagto1=new PagtoCartao(100, 4);//craindo pagto no cartao
        AbstractPagamento pagto2=new PagtoDinheiro(100, 1);//criando pagto no dinheiro

        System.out.println("pagamento cartao: "+pagto1.calculartotal()+ " em "+pagto1.getParcelas()+"x");
        System.out.println("pagamento dinehiro: "+pagto2.calculartotal());

        AbstractTelefone telefone1=BancoTelefone.getTelefone("11111111"); //procurando telefone valido
        AbstractTelefone telefone2=BancoTelefone.getTelefone("88888888"); //procurando telefone invalido
        

        System.out.println("Telefone: "+telefone1.getTelefone()); //print telefone valido usando banco de telefone b
        System.out.println(telefone2.getTelefone()); // print telefone invalido usando banco de telefone b
        System.out.println("Valor Total diaria :"+diaria.total()); //print valor total dia
        System.out.println("Valor Total Mensal:"+mensal.total());//print valor total mes
        System.out.println("Valor Total Semanal:"+semanal.total()); //print valor total semana
        
        c.addObserver(t);           //adicinando obersavador a la voiture
        c.setEstado("andando"); //alterando estado de  la voiture para andado
        c.notify(" andando ");  //notificando telefone
        c.setEstado(" parado ");    //alterando estado de la voiture para parado
        c.notify(" parado ");   //notificando telefone




    }
}
