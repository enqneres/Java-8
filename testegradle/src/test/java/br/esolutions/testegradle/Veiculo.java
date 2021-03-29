package br.esolutions.testegradle;

public class Veiculo {
    private String modelo;
    private String marca;
    private double valorVenal;

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double calculaImposto(){
        return this.valorVenal * 0.01;
    }
}
