public abstract class StadoVaga {
    private Vaga vaga;


    public StadoVaga(Vaga vaga){
        super();
        this.vaga=vaga;
    }
    public abstract void ocupado();

    public abstract void vazio();


    public Vaga getVaga() {
        return this.vaga;
    }
    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }












}
