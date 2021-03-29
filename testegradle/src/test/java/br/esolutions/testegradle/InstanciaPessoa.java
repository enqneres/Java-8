package br.esolutions.testegradle;

public class InstanciaPessoa {
    public static void main (String[]args){
        Pessoa3 pessoa = new Pessoa3("Enoque", 26, 05, 1994);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getDataNascimento());
        System.out.println(pessoa.calculaIdade());

        pessoa.setNome("Enoque Neres");

        System.out.println(pessoa.getNome());
    }
}
