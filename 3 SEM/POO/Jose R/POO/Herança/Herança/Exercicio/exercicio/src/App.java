import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        futebol f=new futebol();
        double velocidade=Double.parseDouble(JOptionPane.showInputDialog(null,"velocidade"));
        double altura=Double.parseDouble(JOptionPane.showInputDialog(null,"altura"));
        double força=Double.parseDouble(JOptionPane.showInputDialog(null,"força"));
        f.andar(velocidade);
        f.pular(altura);
        f.chutar(força);
        f.caracteristicas();
    }
}
