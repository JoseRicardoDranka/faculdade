import javax.swing.*;

class ui{
    JFrame f;
    
    ui(){
        f=new JFrame("my frame");

        f.setLayout(null);
        f.setSize(500,600);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        JOptionPane.showConfirmDialog(f, "message");   
    }
}
class Start{

    public static void main(String[]args){
        new ui();
    }
}