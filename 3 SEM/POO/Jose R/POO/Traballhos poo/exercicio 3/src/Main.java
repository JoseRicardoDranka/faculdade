import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Carro c;
        c=new Carro();
        Scanner leitor=new Scanner(System.in);
        boolean ligarcarro;
        boolean desligarcarro;
        int contador=0;

        c.setmarca("koenigsegg");
        c.setmodel("Agera RS");
        c.setmotor(5.0);
        
        String modelo=JOptionPane.showInputDialog(modelo,"Modelo do carro");
        String marca=JOptionPane.showInputDialog(marca,"Modelo do carro");
        double motor=Double.parseDouble(JOptionPane.showInputDialog("motorizaçao"));
        
        while(contador<=6){
            JOptionPane.showInputDialog(contador, "1 ligar carro 2 desligar caro 3 mostrar info carro 4 adicionar marcha 5 reduzir marcha 6 sair");
    //ligar carro
            switch(contador){
                case 1:
                System.out.println("deseja ligar o carro S/N:");
                String ligar=leitor.next();
                if(ligar=="S"){
                    ligarcarro=true;
                }else{
                    ligarcarro=false;
                }
                c.Ligar(ligarcarro);
                break;
    //desligar carro

                case 2:
                System.out.println("deseja desligar o carro S/N:");
                String desligar=leitor.next();
                if(desligar=="S"){
                    desligarcarro=true;
                    c.marcha='1';
                }else{
                    desligarcarro=false;
                }
                c.desligado(desligarcarro);
                break;
    //informaçoes do carro
                case 3:
                System.out.println("marca: "+c.marca);
                System.out.println("modelo: "+c.model);
                System.out.println("motor: "+c.motor);
                System.out.println("ligar: "+c.ligado);
                System.out.println("marcha: "+c.marcha);
                System.out.println("KM/H: "+c.velocidade);
                break;
    //aumentar marcha

                int marcha=0;
                marcha=c.getMarcha();
                System.out.println("tsuuutusuuutsuuu");
                if(marcha<5){
                    c.setMarcha=(marcha+1);
                }else{
                    System.out.println("brehhhhhhhhhhhhhhhhhhhhhhhhhhh...");
                }
                break;
    //Diminuir marcha
                marcha=c.getMarcha;
                if(marcha>1){
                    c.setMarcha(marcha-1);
                    System.out.println(" ");
                }else{
                    System.out.println("N");
                }
                break;

    //velocidade
                boolean ligado=c.getLigado();
                if(ligado ==true){
                    System.out.println("km/h: "+c.Velocidade());
                }else{
                    System.out.println("0km/h ");
                }
                break;
                case 6:
                contador++;
                break;
            }
        }break;

    }
}
