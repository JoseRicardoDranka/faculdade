import java.util.Scanner;
public class Main {
    public static void main (final String []args){
        final Produto vpro[]= new Produto[10];
        final Venda v1[]=new Venda [5];
        int i,j,r,l,x;
		int w = 1;
        final Scanner ler = new Scanner(System.in);
        for (i = 0; i < 10; i++) {
            vpro[i] = new Produto();
        }
        vpro[0].nome = "Mustang";
        vpro[0].preco = 350000.00f;
        vpro[1].nome = "Shelby_gt";
        vpro[1].preco = 300000.00f;
        vpro[2].nome = "Centenario";
        vpro[2].preco = 1900000.00f;
        vpro[3].nome = "Aventador";
        vpro[3].preco = 750000.00f;
        vpro[4].nome = "Agera";
        vpro[4].preco = 2100000.00f;
        vpro[5].nome = "Reventon";
        vpro[5].preco = 1300000.00f;
        vpro[6].nome = "Skyline_R34";
        vpro[6].preco = 200000.00f;
        vpro[7].nome = "Silvia_s15";
        vpro[7].preco = 125000.00f;
        vpro[8].nome = "Sexto_elemento";
        vpro[8].preco = 2200000.00f;
        vpro[9].nome = "Veneno";
        vpro[9].preco = 4000000.00f;
        // ----------------------------------------------

        System.out.println("Escolha uma opcao \n 1.listar produtos \n 2.incluir Venda \n 3.listar Vendas");
        r = ler.nextInt();
        l = 1;
        while (w == 1) {
            switch (r) {
                case 1:
                    for (i = 0; i < 10; i++) {
                        System.out.println(vpro[i].nome);
                        System.out.println(vpro[i].preco);
                    }
                    break;
                case 2:
                    for (i = 0; i < 5; i++) {
                        v1[i] = new Venda();
                    }
                    j = 0;
                    while (l == 1) {
                        while (j < 5) {
                            System.out.println("digite a data da venda");
                            String d1 = ler.nextLine();
                            d1 = ler.nextLine();
                            v1[j].data = d1;
                            System.out.println("digite o nome do produto");
                            d1 = ler.nextLine();
                            for (i = 0; i < 10; i++) {
                                if (d1.equals(vpro[i].nome)) {
                                    v1[j].produto = vpro[i].nome;
                                    v1[j].valor = vpro[i].preco;
                                    System.out.println("digite a quantidade");
                                    x = ler.nextInt();
                                    v1[j].quantidade = x;
                                    System.out.println("produto cadastrado com sucesso");
                                    break;
                                } else {
                                    System.out.println("produto nao cadastrado");
                                    break;
                                }
                            }
                            j++;
                            break;
                        }
                        System.out.println("deseija cadastrar outro produto '1' para 'SIM' '2' para 'Nao' ");
                        l = ler.nextInt();
                    }
            break;
            case 3:
                for(i=0;i<5;i++){
                    System.out.println("venda "+i);
                    System.out.println(v1[i].data);
                    System.out.println(v1[i].produto);
                    System.out.println(v1[i].quantidade);
                    System.out.println(v1[i].valor);
                }
                break;
            }//swhitch
            System.out.println("deseja continuar '1'SIM '2' NAO");
            w = ler.nextInt();
        }//while   
    }//main
}//class