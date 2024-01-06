import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        String linha = null;
        Processo vetor[]=new Processo[5];
        int cont = 1, exec = 0,auxBt;
        int quantum= 3;
        Processo p1 = new Processo();
        Processo p2 = new Processo();
        Processo p3 = new Processo();
        Processo p4 = new Processo();
        Processo p5 = new Processo();




            vetor[0] = p1;
            vetor[1] = p2;
            vetor[2] = p3;
            vetor[3] = p4;
            vetor[4] = p5;

        try {
            FileReader reader = new FileReader("C:\\Users\\czkiller\\OneDrive\\Desktop\\ler\\src\\ler\\arquivo.txt"); // Localiza��o
                                                                                                                      // do
                                                                                                                      // Arquivo
            BufferedReader leitor = new BufferedReader(reader);
            StringTokenizer st = null;

            int id;
            int at;
            int bt;

            // retirando dados do arquivo TXT
            while ((linha = leitor.readLine()) != null) {

                // UTILIZA DELIMITADOR | PARA DIVIDIR OS CAMPOS
                st = new StringTokenizer(linha, "|");
                String dados = null;

                while (st.hasMoreTokens()) {
                    // Campo ID
                    dados = st.nextToken();
                    id = Integer.parseInt(dados);

                    // Campo AT
                    dados = st.nextToken();
                    at = Integer.parseInt(dados);

                    // Campo BT
                    dados = st.nextToken();
                    bt = Integer.parseInt(dados);

                    if (cont == 1) {
                        p1.setId(id);
                        p1.setAt(at);
                        p1.setBt(bt);
                    }
                    if (cont == 2) {
                        p2.setId(id);
                        p2.setAt(at);
                        p2.setBt(bt);
                    }
                    if (cont == 3) {
                        p3.setId(id);
                        p3.setAt(at);
                        p3.setBt(bt);
                    }
                    if (cont == 4) {
                        p4.setId(id);
                        p4.setAt(at);
                        p4.setBt(bt);
                    }
                    if (cont == 5) {
                        p5.setId(id);
                        p5.setAt(at);
                        p5.setBt(bt);
                    }

                    cont++;
                }
            }
            // algoritimo RR
            while (p1.getBt() != 0 || p2.getBt() != 0 || p3.getBt() != 0 || p4.getBt() != 0 || p5.getBt() != 0) {

                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (vetor[i].getBt() < vetor[j].getBt()) {// ordenando vetor por bash time
                            Processo temp = vetor[i];
                            vetor[i] = vetor[j];
                            vetor[j] = temp;
                        }
                    }
                }
                for (int i = 0; i < vetor.length; i++) {
                    System.out.println("ID:"+vetor[i].getId()+"BASH TIME"+vetor[i].getBt());
                }




                if (vetor[0].getAt() <= exec && vetor[0].getCt() == 0) {
                    auxBt=(vetor[0].getBt()-quantum);
                }
                if (vetor[1].getAt() <= exec && vetor[1].getCt() == 0) {
                    auxBt=(vetor[1].getBt()-quantum);
                }
                if (vetor[2].getAt() <= exec && vetor[2].getCt() == 0) {
                    auxBt=(vetor[2].getBt()-quantum);
                }
                if (vetor[3].getAt() <= exec && vetor[3].getCt() == 0) {
                    auxBt=(vetor[3].getBt()-quantum);
                }
                if (vetor[4].getAt() <= exec && vetor[4].getCt() == 0) {
                    auxBt=(vetor[4].getBt()-quantum);
                }

                
                // p1.calcularTAT();
                // p2.calcularTAT();
                // p3.calcularTAT();
                // p4.calcularTAT();
                // p5.calcularTAT();

                // p1.calcularWT();
                // p2.calcularWT();
                // p3.calcularWT();
                // p4.calcularWT();
                // p5.calcularWT();

                System.out.println("BASH TIME");
                System.out.println("P1: " + p1.getBt() + "  P2: " + p2.getBt() + "  P3: " + p3.getBt() + "  P4: "
                        + p4.getBt() + "  P5: " + p5.getBt() + "\n");

                System.out.println("ARRIVAL TIME\n");
                System.out.println("P1: " + p1.getAt() + "  P2: " + p2.getAt() + "  P3: " + p3.getAt() + "  P4: "
                        + p4.getAt() + " P5: " + p5.getAt() + "\n");

                System.out.println("CONCLUSION TIME\n");
                System.out.println("P1: " + p1.getCt() + " P2: " + p2.getCt() + "  P3: " + p3.getCt() + "  P4: "
                        + p4.getCt() + " P5: " + p5.getCt() + "\n");

                System.out.println("TURN AROUND TIME\n");
                System.out.println("P1: " + p1.getTat() + " P2: " + p2.getTat() + "  P3: " + p3.getTat() + "  P4: "
                        + p4.getTat() + " P5: " + p5.getTat() + "\n");

                System.out.println("WAIT TIME\n");
                System.out.println("P1: " + p1.getWt() + " P2: " + p2.getWt() + "  P3: " + p3.getWt() + "  P4: "
                        + p4.getWt() + " P5: " + p5.getWt() + "\n");

                leitor.close();
                reader.close();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
