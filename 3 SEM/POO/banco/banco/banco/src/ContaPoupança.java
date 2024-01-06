public class ContaPoupança{
    private String NumeroContaPoupança;
    private double SaldoPoupança;
    private String Senhapoupança;


    public String getNumeroContaPoupança() {
    	return this.NumeroContaPoupança;
    }
    public void setNumeroContaPoupança(String NumeroContaPoupança) {
    	this.NumeroContaPoupança = NumeroContaPoupança;
    }


    public double getSaldoPoupança() {
    	return this.SaldoPoupança;
    }
    public void setSaldoPoupança(double SaldoPoupança) {
    	this.SaldoPoupança = SaldoPoupança;
    }


    public String getSenhapoupança() {
    	return this.Senhapoupança;
    }
    public void setSenhapoupança(String Senhapoupança) {
    	this.Senhapoupança = Senhapoupança;
    }

	public double depositarPoupança(double deposito) {//realiza soma na conta poupança
		this.SaldoPoupança = SaldoPoupança + deposito;
		return deposito;	
	}
    public double saquePoupança(double saque) {//verifica se tem saldo na conta
        if(SaldoPoupança < saque){
            System.out.println("saldo insulficiente");
        }else{    
            this.SaldoPoupança =(SaldoPoupança - saque);
            System.out.println("saque realizado com sucesso");
        }
        return SaldoPoupança;	
	}
    public void juros(int numeroDias){//se o resto da divisao for 0 adiciona 1% ao saldo disponivel 
  	
    	if (numeroDias > 0 && (numeroDias % 30) == 0) {
    		this.SaldoPoupança = this.SaldoPoupança + (SaldoPoupança*0.002);
    	}
    	
    }
}