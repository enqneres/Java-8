package br.esolutions.testegradle;


import java.time.LocalDate;
import java.time.Period;

public class Pessoa3 {
    private String nome;
    private LocalDate dataNascimento;
    public Pessoa3(String nome, int dia, int mes, int ano) {
        this.nome = nome;
        this.dataNascimento = LocalDate.of(ano, mes, dia);
    }
    public int calculaIdade() {return Period.between(dataNascimento, LocalDate.now()).getYears(); }

    public String getNome() { return nome; }

    public LocalDate getDataNascimento() { return dataNascimento; }

    public void setNome(String nome) { this.nome = nome; }
}
