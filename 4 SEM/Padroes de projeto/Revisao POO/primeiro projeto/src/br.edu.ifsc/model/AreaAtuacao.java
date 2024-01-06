package br.edu.ifsc.model;

public class AreaAtuacao {
    private String grandeArea;
    private String subArea;

    public String getGrandeArea() {
        return this.grandeArea;
    }

    public void setGrandeArea(String grandeArea) {
        this.grandeArea = grandeArea;
    }

    public String getSubArea() {
        return this.subArea;
    }

    public void setSubArea(String subArea) {
        this.subArea = subArea;
    }

    public AreaAtuacao(String grandeArea, String subArea) {
        this.grandeArea = grandeArea;
        this.subArea = subArea;
    }

}
