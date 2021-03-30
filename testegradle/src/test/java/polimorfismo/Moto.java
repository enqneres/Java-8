package polimorfismo;

public class Moto extends Veiculo {
    @Override
    public double calculaImposto() {
        return super.calculaImposto() * 0.03;
    }
}




