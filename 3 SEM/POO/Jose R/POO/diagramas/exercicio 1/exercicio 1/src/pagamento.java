public class pagamento {
    private String forma;
    private String qtdparcelas;

    public String getForma() {
        return this.forma;
    }
    public void setForma(String forma) {
        this.forma = forma;
    }
    
    public pagamento(String forma, String qtdparcelas) {
        this.forma = forma;
        this.qtdparcelas = qtdparcelas;
    }

    public String getQtdparcelas() {
    	return this.qtdparcelas;
    }
    public void setQtdparcelas(String qtdparcelas) {
    	this.qtdparcelas = qtdparcelas;
    }





}
