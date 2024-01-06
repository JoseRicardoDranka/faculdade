public class Carro {
    private boolean ligado=false;
    private byte marcha =1;
    private String marca;
    private String model;
    private double motor;

    




    public Carro(boolean ligado, byte marcha, String marca, String model, double motor) {
        this.ligado = ligado;
        this.marcha = marcha;
        this.marca = marca;
        this.model = model;
        this.motor = motor;
    }


    public boolean isLigado() {
        return this.ligado;
    }

    public boolean getLigado() {
        return this.ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public byte getMarcha() {
        return this.marcha;
    }

    public void setMarcha(byte marcha) {
        this.marcha = marcha;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMoto() {
        return this.motor;
    }

    public void setMoto(double moto) {
        this.motor = moto;
    }





}

