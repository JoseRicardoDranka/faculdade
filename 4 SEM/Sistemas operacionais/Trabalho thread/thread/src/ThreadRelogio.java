
public class ThreadRelogio implements Runnable{

    private int auxH,auxM,auxS;
    private int segundo;
    private int hora;
    private int minutos;


    public int getSegundo() {
    	return this.segundo;
    }
    public void setSegundo(int segundo) {
    	this.segundo = segundo;
    }
    
    
    @Override
    public void run() {
        while(true){
            segundo++;
            if( segundo==60){
                minutos++;
                segundo=0;
                }if(minutos == 60){
                minutos=0;
                hora++;
                }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            //System.out.println("Hora:  "+hora+"\t Minuto:  "+minutos+"\t Segundo:  "+segundo+"");       //Mostra a hr de 1 em 1 seg
        }
    }
    public void ajustarHora(int hora,int minuto,int segundo){
        //this.segundo=((hora*3600)+(minuto*60)+(segundo));
        this.hora=hora;
        this.minutos=minuto;
        this.segundo=segundo;
    }
    
    
    @Override
    public String toString() {
        return "Hora:  "+hora+"\t Minuto:  "+minutos+"\t Segundo:  "+segundo+"";
    }
}
