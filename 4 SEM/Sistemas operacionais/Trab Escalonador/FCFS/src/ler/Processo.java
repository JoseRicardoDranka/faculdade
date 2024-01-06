package ler;

public class Processo {
    private int id=0;
    private int at=0;
    private int bt=0;
    private int ct=0;
    private int tat=0;
    private int wt=0;


    public void calcularWT(){
        this.wt=(this.tat-this.bt);
    }


    public void calcularTAT(){
        this.tat=(this.ct-this.at);
    }


    public Processo() {
    }


    public int getId() {
   	 return this.id;
    }
    public void setId(int id) {
   	 this.id = id;
    }


    public int getAt() {
    	return this.at;
    }
    public void setAt(int at) {
    	this.at = at;
    }


    public int getBt() {
    	return this.bt;
    }
    public void setBt(int bt) {
    	this.bt = bt;
    }


    public int getCt() {
    	return this.ct;
    }
    public void setCt(int ct) {
    	this.ct = ct;
    }


    public int getTat() {
    	return this.tat;
    }
    public void setTat(int tat) {
    	this.tat = tat;
    }


    public int getWt() {
    	return this.wt;
    }
    public void setWt(int wt) {
    	this.wt = wt;
    }

    
}
