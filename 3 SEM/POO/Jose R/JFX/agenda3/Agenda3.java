package agenda3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Agenda3 {
    
    public static void main(String[] args) {
        int opcaoSaida = 1;
        ArrayList<User> arrayUsusarios = new ArrayList<>();
        //AO INICIAR FAZER LEITURA DO TXT
        
        while(opcaoSaida != 9){
            String resposta = JOptionPane.showInputDialog(""
                    + "1 - Novo Registro \n"
                    + "2 - Listar Todos \n"
                    + "9 - Sair");
            opcaoSaida = Integer.parseInt(resposta);
            
            switch (opcaoSaida) {
                case 1:
                    User usuario = new User();
                    usuario.setNome(JOptionPane.showInputDialog("Digite o Nome: "));
                    usuario.setObservacao(JOptionPane.showInputDialog("Digite a Observação: "));
                    arrayUsusarios.add(usuario);
                    break;
                case 2:
                    for (int i=0; i<arrayUsusarios.size(); i++){
                        System.out.println("------------------------------------");
                        System.out.println("Nome: "+ arrayUsusarios.get(i).getNome());
                        System.out.println("Observação: "+ arrayUsusarios.get(i).getObservacao());
                    }
                    break;
                case 9:
                    //PRECISAMOS SALVAR NO TXT
                    JOptionPane.showMessageDialog(null, "FLW :) ");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção Inválida!");
            }
        }
    }
    
    public void escreverTxt(ArrayList<User>array) {
        String url = "C:\\Users\\Informatica\\Documents\\Jose R";
        File dir = new File(url);
        File arq = new File(dir, "User.txt");

        try {
            arq.createNewFile();
            FileWriter fileWriter = new FileWriter(arq, false);
            try (PrintWriter printWriter = new PrintWriter(fileWriter)) {
                int i;
                for (i = 0; i < array.size(); i++) {
                    printWriter.println(array.get(i).getId());
                    printWriter.println(array.get(i).getNome());
                    printWriter.println(array.get(i).getObservacao());
                }
                printWriter.flush();
                printWriter.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    public ArrayList<User> lerTxt() throws FileNotFoundException, IOException {
        String url = "C:\\Users\\Informatica\\Documents\\Jose R";
        File dir = new File(url);
        File arq = new File(dir, "User.txt");
        ArrayList<User>arrayUsusarios=new ArrayList<>();
        
        try {
            FileReader fileReader = new FileReader(arq);
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String linha = "";
         
                while (linha != null) {
                    User usuario = new User();
                    usuario.setNome(bufferedReader.readLine());
                    usuario.setObservacao(bufferedReader.readLine());
                    arrayUsusarios.add(usuario);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return arrayUsusarios;
    }

    
}
