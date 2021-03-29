package br.esolutions.testegradle;

public class Pessoa {
    private String nome = "Enoque";

    public String getNome() {
        return nome;
    }

    public String falarMeuNome() {
        return ("Ola, meu nome e " + getNome());
    }

    public String Andar() {
        return ("Andando...");
    }

}

//Classe Orientada a Objeto //