public class Vazia extends StadoVaga {


    public Vazia(Vaga vaga){
        super(vaga);
        System.out.println("estou vazia");
    } 

    @Override
    public void ocupado() {
        getVaga().setStado(new Ocupada(getVaga()));
        System.out.println("estou ocupada");
        
    }

    @Override
    public void vazio() {
        System.out.println("estou vaiza dnv");
        
    }
    
}
