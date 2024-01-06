import java.lang.reflect.Array;
import java.util.ArrayList;

public class pedido {
    private String data;
    private boolean status;
    private double total=0;
    private ArrayList<item>Alitem=new ArrayList<item>();
    private ArrayList<pagamento>alpagamento= new ArrayList<pagamento>();
    private double imposto;



    
    public void pedido(String data, boolean status, double total) {
        this.data = data;
        this.status = status;
        this.total = total;
    }

public String getData() {
  	return this.data;
  }
  public void setData(String data) {
  	this.data = data;
  }


    public boolean getStatus() {
    	return this.status;
    }
    public void setStatus(boolean status) {
    	this.status = status;
    }


    public double calcularpreçototal(){
        for(int i=0;i<size;i++){
            total=(total+Alitem.get(i).getPreço());
        }
        return total;
    }
    public double calcularimposto(){
        imposto=(total*0.02);
        return imposto;
    }

    public void setpedido(String nome,String descriçao,double preço){
        this.Alitem.add(new item(nome,descriçao,preço));
    }

    int size = Alitem.size();

    
}
