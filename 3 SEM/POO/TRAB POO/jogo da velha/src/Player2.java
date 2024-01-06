public class Player2 extends Tabuleiro{






    // @Override
    // public void alocarpeça(int x,int y){
    //     for(int i=0;i<t1.length;i++){
    //         if(i==x){
    //             for(int j=0;j<t1.length;i++){
    //                 if(i==x && j== y){
    //                     t1[i][j]="O";
    //                 }else{
    //                     System.out.println("pos invalida");
    //                 }
    //             }
    //         }else{
    //             System.out.println("pos invalida!!!!");
    //         }
    //     }
    // }
    @Override
    public boolean aloc(int x,int y,String texto){
        texto="O";
        return true;
    }
    
}
