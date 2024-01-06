public class Ocupada extends StadoVaga {

    public Ocupada(Vaga vaga){
        super(vaga);
        System.out.println("estou ocupada por" + vaga.getCarro());
    }

    @Override
    public void ocupado() {
        System.out.println("estou ocupada");        
    }

    @Override
    public void vazio() {
        System.out.println("estou vazia");
        getVaga().setStado(new Vazia(getVaga()));        
    }
    
    
}
