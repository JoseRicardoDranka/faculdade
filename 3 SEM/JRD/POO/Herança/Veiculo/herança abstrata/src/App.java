public class App {
    public static void main(String[] args) throws Exception {
        carro c=new carro();
        c.ligar();
        c.acelerar();
        System.out.println(c.mostrarStatus());
        c=null;
        aviao av =new aviao();
        av.ligar();
        av.acelerar();
        System.out.println(av.mostrarStatus());
        av=null;
    }
}
