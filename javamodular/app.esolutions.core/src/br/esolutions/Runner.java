package br.esolutions;

import esolutions.util.Operacao.Calculadora;

public class Runner {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.div(9,3));
    }
}
