package br.esolutions.testegradle;

import java.util.List;
import java.util.Vector;

public class javaVector {
    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        //adicionando 4 esportes..
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Ping Pong");
        esportes.add("Handebol");

        //alterando o valor da posicao 2..
        esportes.set(2, "Tenis de Mesa");

        //remove o esporte da posicao 2..
        esportes.remove(2);

        //removendo o esporte Handebol..
        esportes.remove("Handebol");

        //retornando o primeiro item..
        System.out.println(esportes.get(0));

        //navegando nos esportes..
        for (String esporte: esportes){
            System.out.println(esporte);
        }
    }
}
