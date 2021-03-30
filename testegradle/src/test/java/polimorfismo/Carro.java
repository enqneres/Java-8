package polimorfismo;

import polimorfismo.Veiculo;

public class Carro extends Veiculo {

    @Override
    public double calculaImposto() {

        return super.calculaImposto() * 0.07;
    }
}
