public class App{
    public static void main(String[] args) {
        lapis l=new lapis("grafite");
        l.escrever("ola mundo");
        l=null;
        Caneta c=new Caneta("verde");
        c.escrever("ola mundo");
        c=null;
    }
}