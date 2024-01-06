import java.util.ArrayList;
import java.util.List;
public class Carro implements IntefaceObservable {

    private String modelo;
    private String placa;
    private String estado;
    private List<InterfaceObserver> observers = new ArrayList<InterfaceObserver>();
    
    



    public Carro(String modelo,String placa){
        this.modelo=modelo;
        this.placa=placa;
    }


    @Override
    public void addObserver(InterfaceObserver observer) {
        getObservers().add(observer);
        
    }

    @Override
    public void removeObserver(InterfaceObserver observer) {
        getObservers().remove(observer);
        
    }

    @Override
    public void notify(String message) {
        for (InterfaceObserver o : observers)
        o.notify(this, message);
    }

    public String toString() {
		return placa;
	}


    public List<InterfaceObserver> getObservers() {
        return observers;
    }

    public String getModelo() {
    	return this.modelo;
    }
    public void setModelo(String modelo) {
    	this.modelo = modelo;
    }


    public String getPlaca() {
    	return this.placa;
    }
    public void setPlaca(String placa) {
    	this.placa = placa;
    }



    public String getEstado() {
        return estado;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }

}
    







