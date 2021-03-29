package br.esolutions.testegradle;

public class InstanciaCarroMoto {

    public void main(String[]args){
        Car carro = new Car();
        carro.setMarca("Fiat");
        carro.setModelo("Argo");
        carro.setQuantidadePortas(4);

        Moto moto = new Moto();
        moto.setMarca("Yamaha");
        moto.setModelo("MT-03");
        moto.setCilindradas("600cc");

    }
}
