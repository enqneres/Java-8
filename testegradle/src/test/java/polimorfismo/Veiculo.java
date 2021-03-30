package polimorfismo;

public class Veiculo {
    private String marca;
    private String modelo;

    private double valorVenal;

    public void setValorVenal(double valorVenal) {

        this.valorVenal = valorVenal;
    }

    public double calculaImposto(){

        return this.valorVenal * 0.01;
    }
}
