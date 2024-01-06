public class Telefone extends AbstractTelefone implements InterfaceObserver {
    
    public Telefone (String numero){
        this.numero=numero;
    }
    @Override
    public String getTelefone(){
        return numero;
    }
    
    @Override
    public void notify(IntefaceObservable observable, String message) {
        System.out.println(numero+ " Seu veiculo: " +observable+ " esta :"+message);
        
    }
}
