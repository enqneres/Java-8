package br.esolutions.testegradle;

import br.esolutions.testegradle.Carro3;

import static java.lang.System.*;

public class InstanciaCarro {
    public static void main (String[]args){
        Carro3 novoCarro = new Carro3("FIAT", "UNO","UP",2020);


        out.println("Marca: " + novoCarro.marca);
        out.println("Modelo: " + novoCarro.modelo);
        out.println("Variante: " + novoCarro.variante);
        out.println("Ano: " + novoCarro.ano);
    }
}
