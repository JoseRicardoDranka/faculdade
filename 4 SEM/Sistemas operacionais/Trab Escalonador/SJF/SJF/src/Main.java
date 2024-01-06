import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {

        String linha = null;
        int cont = 1, exec = 0, taux = 0;
        boolean auxif=true;
        Processo vetor[] = new Processo[5];
        Processo p1 = new Processo();
        Processo p2 = new Processo();
        Processo p3 = new Processo();
        Processo p4 = new Processo();
        Processo p5 = new Processo();

        try {
            FileReader reader = new FileReader("C:\\Users\\czkiller\\OneDrive\\Desktop\\SJF\\SJF\\src\\arquivo.txt"); // Localizaçao do Arquivo
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
            vetor[0] = p1;
            vetor[1] = p2;
            vetor[2] = p3;
            vetor[3] = p4;
            vetor[4] = p5;

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (vetor[i].getBt() < vetor[j].getBt()) {// ordenando vetor por bash time
                        Processo temp = vetor[i];
                        vetor[i] = vetor[j];
                        vetor[j] = temp;
                    }
                }
            }

            // algoritimo SJF
            while (p1.getCt() == 0 || p2.getCt() == 0 || p3.getCt() == 0 || p4.getCt() == 0 || p5.getCt() == 0) {

                if (vetor[0].getAt() <= exec && vetor[0].getCt() == 0) {
                    taux += vetor[0].getBt();
                    vetor[0].setCt(taux);
                    auxif = false;
                }
                if (vetor[1].getAt() <= exec && vetor[1].getCt() == 0) {
                    taux += vetor[1].getBt();
                    vetor[1].setCt(taux);
                    auxif = false;
                }
                if (vetor[2].getAt() <= exec && vetor[2].getCt() == 0) {
                    taux += vetor[2].getBt();
                    vetor[2].setCt(taux);
                    auxif = false;
                }
                if (vetor[3].getAt() <= exec && vetor[3].getCt() == 0) {
                    taux += vetor[3].getBt();
                    vetor[3].setCt(taux);
                    auxif = false;
                }
                if (vetor[4].getAt() <= exec && vetor[4].getCt() == 0) {
                    taux += vetor[4].getBt();
                    vetor[4].setCt(taux);
                    auxif = false;
                }

                exec = taux;
                if (auxif == true) {
                    exec++;
                    auxif=true;
                }
                
                taux = exec;

                p1.calcularTAT();
                p2.calcularTAT();
                p3.calcularTAT();
                p4.calcularTAT();
                p5.calcularTAT();

                p1.calcularWT();
                p2.calcularWT();
                p3.calcularWT();
                p4.calcularWT();
                p5.calcularWT();

                System.out.println("BASH TIME");
                System.out.println("P1: " + p1.getAt() + "  P2: " + p2.getAt() + "  P3: " + p3.getAt() + "  P4: "
                        + p4.getAt() + "  P5: " + p5.getAt() + "\n");

                System.out.println("ARRIVAL TIME\n");
                System.out.println("P1: " + p1.getBt() + "  P2: " + p2.getBt() + "  P3: " + p3.getBt() + "  P4: "
                        + p4.getBt() + " P5: " + p5.getBt() + "\n");

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
