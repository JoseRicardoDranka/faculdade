public class ThreadCronometro implements Runnable {
    private int timer;
    private int auxT,auxH,auxM,auxS;
    private int minutos;
    private int segundo;
    private int hora;


    public int getSegundo() {
    	return this.timer;
    }
    public void setSegundo(int segundo) {
    	this.timer = segundo;
    }
    
    
    @Override
    public void run() {
        while(true){
            timer++;
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
        }
        
    }

    public void parar(){
        auxT=timer;
        timer=0;
        auxH=hora;
        auxM=minutos;
        auxS=segundo;
        System.out.println("segundos:"+auxT);
    }
    public void retornar(){
        timer=0;
        hora=0;
        minutos=0;
        segundo=0;
        hora=auxH;
        minutos=auxM;
        segundo=auxS;
        timer=(auxT+auxT);
        System.out.println("segundos:"+auxT);
    }
    public void iniciarCronometro(){
        timer=0;
        segundo=0;
        minutos=0;
        hora=0;
    }
    public void zerarCronometro(){
        timer=0;
        hora=0;
        minutos=0;
        segundo=0;
        auxH=0;
        auxM=0;
        auxS=0;
        auxT=0;
    }


    @Override
    public String toString() {
        return "ThreadRelogio [segundo=" + timer + "]";
    }
    
}
