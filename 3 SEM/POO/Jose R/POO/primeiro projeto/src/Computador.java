
public class Computador {
    //atributos
    private String processador;
    private int ram;
    private String gpu;
    private String placamae;
//  String placamae; default

    //metodos
    public Computador(String processador,int ram) {
        this.processador=processador;
        this.ram=ram;
    }//herança
    
    public String getprocessador() {
        return this.processador;
    }
    public void setprocessador(String processador){
        this.processador = processador;
        }

    public boolean ligar() {
        return true;
    }//metodos
    private boolean desligar(){
        return false;
    }
    
    protected String TipoPocesador(){
        return this.processador;
    }

    String tipoGPU(){
        return this.gpu;
    }

    public void finalize(){
        System.out.println("tchau!");
    }//destrutor
}
