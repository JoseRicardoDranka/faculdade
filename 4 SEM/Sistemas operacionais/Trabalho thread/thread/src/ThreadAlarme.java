public class ThreadAlarme implements Runnable {

    private int auxH,auxM,auxS;
    private int minutos;
    private int segundo;
    private int hora;

    
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
            if(hora==auxH && minutos==auxM && segundo==auxS){
                System.out.println("!!!!!!!!!!!!!!! Acorda desgraçado !!!!!!!!!!!");
            }
            
        }
        
    }
    public void difinirAlarme(int hora,int minuto,int segundo){
        this.auxH=hora;
        this.auxM=minuto;
        this.auxS=segundo;
    }
    public void ajustarHoraa(int hora,int minuto,int segundo){
        //this.segundo=((hora*3600)+(minuto*60)+(segundo));
        this.hora=hora;
        this.minutos=minuto;
        this.segundo=segundo;
    }

    
}
