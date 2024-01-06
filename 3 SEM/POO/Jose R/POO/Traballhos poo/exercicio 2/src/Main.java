import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        Receita R1,R2;
        R1=new Receita("qlqmerda", "asds", 1, 120);
        R2=new Receita("nddmas", "asdasd", 1, 80);
        System.out.println("escolha uma opcao 1:Modificar receita 2: valor total 3:receita");
        int x=leitor.nextInt();
        switch(x){
            case 1:
                System.out.println("digite um nome");
                String nome=leitor.next();
                R1.setNome(nome);
                System.out.println("digite uyma descricao");
                String desc=leitor.next();
                R1.setDescicao(desc);
                System.out.println("quantidade");
                int qtd=leitor.nextInt();
                R1.setNumporcoes(qtd);
                System.out.println("valor");
                double valor=leitor.nextDouble();
                R1.custoporçao(valor);            
            case 2:
                double val=0;
                R1.custoporçao(val);
                System.out.println("total R$: "+val);
            case 3:
                System.out.println("qual receita:");
                int y=leitor.nextInt();
                if(y==1){
                    System.out.println(""+R1.getNome());
                    System.out.println(""+R1.getCustoreceita());
                    System.out.println(""+R1.getDescicao());
                    System.out.println(""+R1.getNumporcoes());
                }else{
                    System.out.println(""+R2.getNome());
                    System.out.println(""+R2.getCustoreceita());
                    System.out.println(""+R2.getDescicao());
                    System.out.println(""+R2.getNumporcoes());

                }         
        }   
    }
}
