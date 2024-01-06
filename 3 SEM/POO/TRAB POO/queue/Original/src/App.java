import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class App{
    public static void main(String[] args) throws Exception {
        Cliente c=new Cliente();
        Scanner s=new Scanner(System.in);
        Queue<String>fila=new LinkedList();/*é parecido com uma <arraylist> mas nao pode ser manipulado por indice aki
        funciona de uma forma em que "o primeiro a ser adicionado é o primeiro a ser removido" */
        Queue<String>filaP=new PriorityQueue<>();/*é a mesma coisa que <linkedList> mas aki possivel definir uma prioridade para o objeto Ex:sistema hospitar chega pacientes com varios ferimentos diferente
        e por meio de prioridade é atendido por meio de priorityqueue é possivel definir essa prioridade
        */
        int cont=0;
        int p=0;
        while(p<9){

            System.out.println("1 retirar senha , 2 atender ,3 mostrar fila");
            p=s.nextInt();
            switch(p){
            
            case 1:
            //adicina a fila ou fila Preferencial 
                System.out.println("nome");
                c.setNome(s.nextLine());
                c.setNome(s.nextLine());//bug de buffer
                System.out.println("Idade");
                c.setIdade(s.nextInt());
                
                if(c.getIdade()>60){
                    filaP.add(c.getNome());
                }else{
                    fila.add(c.getNome());
                }
            break;//break case 1
            case 2:
            //atender
                while(cont <9){
                    if(!filaP.isEmpty()&& cont <=3){
                        System.out.println("topo da filaP: "+filaP.poll());//Mostra o elemnto na primeira posiçao e remove ele
                        cont++;
                    }else if(!fila.isEmpty()|| cont >=4){
                        System.out.println("topo da fila: "+fila.poll());//Mostra o elemnto na primeira posiçao e remove ele
                        cont=0;
                    }else if(filaP.isEmpty() && fila.isEmpty()){
                        System.out.println(fila.isEmpty()?"fila vazia!":"Fila com elementoP");//se fila estiver vazia printa "fila vazia" se estiver populada printa "fila com elemento"
                        System.out.println(filaP.isEmpty()?"filaP vazia!":"Fila com elementoP");//se fila estiver vazia printa "fila vazia" se estiver populada printa "fila com elemnto"
                    }
                break;//break wille
            }
            break;//beak case 2
            case 3:
                //FILA PRINCIPAL
                //System.out.println("topo da fila: "+fila.peek());//mostra o elemento q esta na primeira posiçao da fila
                //System.out.println("topo da fila: "+fila.poll());//Mostra o elemnto na primeira posiçao e remove ele
                System.out.println(fila);// printa toda a lista 
                //System.out.println(fila.isEmpty()?"fila vazia!":"Fila com elementoP");//se fila estiver vazia printa "fila vazia" se estiver populada printa "fila com elemnto"

                //FILA PREFERENCIAL
                //System.out.println("topo da filaP: "+filaP.peek());//mostra o elemento q esta na primeira posiçao da fila
                //System.out.println("topo da filaP: "+filaP.poll());//Mostra o elemnto na primeira posiçao e remove ele
                System.out.println(filaP);// printa toda a lista 
                //System.out.println(filaP.isEmpty()?"filaP vazia!":"Fila com elementoP");//se fila estiver vazia printa "fila vazia" se estiver populada printa "fila com elemnto"
            
            break;//break case 3

            }//case

        } // while

    }//main

}//app




//https://www.geeksforgeeks.org/queue-interface-java/