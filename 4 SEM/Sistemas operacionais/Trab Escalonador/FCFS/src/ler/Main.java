package ler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String linha = null;
        int cont = 1, exec = 0;
        Processo p1 = new Processo();
        Processo p2 = new Processo();
        Processo p3 = new Processo();
        Processo p4 = new Processo();
        Processo p5 = new Processo();

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
            // algoritimo FCFS
            while (p1.getCt() == 0 || p2.getCt() == 0 || p3.getCt() == 0 || p4.getCt() == 0 || p5.getCt() == 0) {

                if (p1.getAt() <= p2.getAt() && p1.getAt() >= exec && p1.getCt() == 0) {
                    exec += p1.getBt();
                    p1.setCt(exec);

                }
                if (p1.getAt() == p2.getAt() && p2.getAt() >= exec && p2.getCt() == 0) {
                    exec += p2.getBt();
                    p2.setCt(exec);

                } else if (p2.getCt() == 0) {
                    exec += p2.getBt();
                    p2.setCt(exec);

                }
                if (p1.getAt() <= p3.getAt() && p1.getAt() >= exec && p1.getCt() == 0) {
                    exec += p1.getBt();
                    p1.setCt(exec);

                }
                if (p1.getAt() == p3.getAt() && p3.getAt() >= exec && p3.getCt() == 0) {
                    exec += p3.getBt();
                    p3.setCt(exec);

                } else if (p3.getCt() == 0) {
                    exec += p3.getBt();
                    p3.setCt(exec);
                }
                if (p1.getAt() <= p4.getAt() && p1.getAt() >= exec && p1.getCt() == 0) {
                    exec += p1.getBt();
                    p1.setCt(exec);

                }
                if (p1.getAt() == p4.getAt() && p4.getAt() >= exec && p4.getCt() == 0) {
                    exec += p4.getBt();
                    p4.setCt(exec);

                } else if (p4.getCt() == 0) {
                    exec += p4.getBt();
                    p4.setCt(exec);
                }
                if (p1.getAt() <= p5.getAt() && p3.getAt() >= exec && p3.getCt() == 0) {
                    exec += p1.getBt();
                    p1.setCt(exec);

                }
                if (p1.getAt() == p5.getAt() && p5.getAt() >= exec && p5.getCt() == 0) {
                    exec += p5.getBt();
                    p5.setCt(exec);

                } else if (p5.getCt() == 0) {
                    exec += p5.getBt();
                    p5.setCt(exec);
                }
                if (p2.getAt() < p3.getAt() && p2.getAt() >= exec && p2.getCt() == 0) {
                    exec += p2.getBt();
                    p2.setCt(exec);

                }
                if (p2.getAt() == p3.getAt() && p3.getAt() >= exec && p3.getCt() == 0) {
                    exec += p3.getBt();
                    p3.setCt(exec);

                } else if (p3.getCt() == 0) {
                    exec += p3.getBt();
                    p3.setCt(exec);

                }
                if (p2.getAt() <= p4.getAt() && p2.getAt() >= exec && p2.getCt() == 0) {
                    exec += p2.getBt();
                    p2.setCt(exec);

                }
                if (p2.getAt() == p4.getAt() && p4.getAt() >= exec && p4.getCt() == 0) {
                    exec += p4.getBt();
                    p4.setCt(exec);

                } else if (p4.getCt() == 0) {
                    exec += p4.getBt();
                    p4.setCt(exec);
                }
                if (p2.getAt() <= p5.getAt() && p2.getAt() >= exec && p2.getCt() == 0) {
                    exec += p2.getBt();
                    p2.setCt(exec);

                }
                if (p2.getAt() == p5.getAt() && p5.getAt() >= exec && p5.getCt() == 0) {
                    exec += p5.getBt();
                    p5.setCt(exec);

                } else if (p5.getCt() == 0) {
                    exec += p5.getBt();
                    p5.setCt(exec);
                }
                if (p3.getAt() <= p4.getAt() && p3.getAt() >= exec && p3.getCt() == 0) {
                    exec += p3.getBt();
                    p3.setCt(exec);

                }
                if (p3.getAt() == p4.getAt() && p4.getAt() >= exec && p4.getCt() == 0) {
                    exec += p4.getBt();
                    p4.setCt(exec);

                } else if (p4.getCt() == 0) {
                    exec += p4.getBt();
                    p4.setCt(exec);
                }
                if (p3.getAt() <= p5.getAt() && p3.getAt() >= exec && p3.getCt() == 0) {
                    exec += p3.getBt();
                    p3.setCt(exec);

                }
                if (p3.getAt() == p5.getAt() && p5.getAt() >= exec && p5.getCt() == 0) {
                    exec += p5.getBt();
                    p5.setCt(exec);

                } else if (p5.getCt() == 0) {
                    exec += p5.getBt();
                    p5.setCt(exec);
                }
                if (p4.getAt() <= p5.getAt() && p4.getAt() >= exec && p4.getCt() == 0) {
                    exec += p4.getBt();
                    p4.setCt(exec);

                }
                if (p4.getAt() == p5.getAt() && p5.getAt() >= exec && p5.getCt() == 0) {
                    exec += p5.getBt();
                    p5.setCt(exec);

                } else if (p5.getCt() == 0) {
                    exec += p5.getBt();
                    p5.setCt(exec);
                }
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
