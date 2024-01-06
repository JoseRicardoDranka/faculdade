public class Tabuleiro {
    protected String t1[][]=new String[3][3];

        
    
    public void zerar(){//mudar para for
        //linha 1
        t1[0][0]=" ";
        t1[0][1]=" ";
        t1[0][2]=" ";
        //linha 2
        t1[1][0]=" ";
        t1[1][1]=" ";
        t1[1][2]=" ";
        //linha 3
        t1[2][0]=" ";
        t1[2][1]=" ";
        t1[2][2]=" ";
    }
    public boolean checar(){
        //for(int i=0;i<t1.length;i++){
            
        //}
        if(t1[0][0]=="X"&&t1[0][1]=="X"&&t1[0][2]=="X"){//linha 1
            System.out.println("player 1 ganhou");
            return true;
        }else if(t1[1][0]=="X" && t1[1][1]=="X"&&t1[1][2]=="X"){//linha 2
            System.out.println("player 1 ganhou");
            return true;
        }else if(t1[2][0]=="X" && t1[2][1]=="X"&&t1[2][2]=="X"){//linha 3
            System.out.println("player1 ganhou");
            return true;
        }else if(t1[0][0]=="X" && t1[1][0]=="X"&&t1[2][0]=="X"){//coluna 1
            System.out.println("player 1 ganhou");
            return true;
        }else if(t1[1][0]=="X" && t1[1][1]=="X"&&t1[1][2]=="X"){//coluna 2
            System.out.println("player 1 ganhou");
            return true;
        }else if(t1[0][2]=="X" && t1[1][2]=="X"&&t1[2][2]=="X"){//coluna 3
            System.out.println("player 1 ganhou");
            return true;
        }else if(t1[0][0]=="X" && t1[1][1]=="X"&&t1[2][2]=="X"){//vertical 1
            System.out.println("player 1 ganhou");
            return true;
        }else if(t1[2][0]=="X" && t1[1][1]=="X"&&t1[0][2]=="X"){//vertical 2
            System.out.println("player 1 ganhou");
            return true;
            /////////////////////////////////////////////////////////////
        }if(t1[0][0]=="O"&&t1[0][1]=="O"&&t1[0][2]=="O"){//linha 1
            System.out.println("player 2 ganhou");
            return true;
        }else if(t1[1][0]=="O" && t1[1][1]=="O"&&t1[1][2]=="O"){//linha 2
            System.out.println("player 2 ganhou");
            return true;
        }else if(t1[2][0]=="O" && t1[2][1]=="O"&&t1[2][2]=="O"){//linha 3
            System.out.println("player 2 ganhou");
            return true;
        }else if(t1[0][0]=="O" && t1[1][0]=="O"&&t1[2][0]=="O"){//coluna 1
            System.out.println("player 2 ganhou");
            return true;
        }else if(t1[1][0]=="O" && t1[1][1]=="O"&&t1[1][2]=="O"){//coluna 2
            System.out.println("player 2 ganhou");
            return true;
        }else if(t1[0][2]=="O" && t1[1][2]=="O"&&t1[2][2]=="O"){//coluna 3
            System.out.println("player 2 ganhou");
            return true;
        }else if(t1[0][0]=="O" && t1[1][1]=="O"&&t1[2][2]=="X"){//vertical 1
            System.out.println("player 2 ganhou");
            return true;
        }else if(t1[2][0]=="O" && t1[1][1]=="O"&&t1[0][2]=="X"){//vertical 2
            System.out.println("player 2 ganhou");
            return true;
        }else {
            return true;
        }
    }
    public void print(){
        for (int i = 0; i <t1.length; i++) {
            String a = t1[i][0];
            String b = t1[i][1];
            String c = t1[i][2];
            System.out.println(a + "|" + b + "|"+c);
        }
    // }public boolean aloc(int x,int y,String texto) {
    //     t1[x][y]=texto;
    //     return true;
    }
    public boolean aloc(int x,int y,String texto) {
        boolean val=false;
        while(val==false){
            if(x<3){
                if(y<3){
                    if(t1[x][y]==" "){
                        t1[x][y]=texto;
                        val=true;
                    }else{
                        System.out.println("pos ivalida");
                        break;
                    }
                    }else{
                        System.out.println("pos ivalida");
                        break;
                    }
                }else{
                    System.out.println("pos ivalida");
                    break;
                }
        }//while
        return val;
    }//aloc
}   
    
        

