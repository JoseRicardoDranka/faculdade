public class Vaga {
    private String numero;
    private Carro carro;

    private StadoVaga stado;


    public Vaga(){
        super();
        this.stado=new Vazia(this);
    }

    public StadoVaga getStado() {
    	return this.stado;
    }
    public void setStado(StadoVaga stado) {
    	this.stado = stado;
        this.setStado(new Ocupada(this));
    }


    public Carro getCarro() {
        return this.carro;
    }
    public void setCarro(Carro carro) {
        this.carro = carro;
        this.setStado(new Ocupada(this));
    }



}
