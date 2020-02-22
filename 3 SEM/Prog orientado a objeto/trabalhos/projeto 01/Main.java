public class Main{
    public static void main( String []args) {
        //Criamos um objeto do tipo Pessoa,Referenciado pela referência "jair"
        Pessoa jair = new Pessoa();
        jair.nome= "Jair Inácio";
        jair.altura= 13.17f;
        jair.idade= 666;
        jair.peso= 66.6f;
        //jair.imprimir();

        System.out.println();

        Pessoa luiz= new Pessoa();
        luiz.nome= "Luiz Messias";
        luiz.idade= 333;
        luiz.peso=17.13f;
        luiz.altura=38.38f;
        //luiz.imprimir();
        
        System.out.println(luiz.ehIgual(jair));
        System.out.println(jair.imprimeNome());
        System.out.println(luiz.imprimeNome());
    }
}