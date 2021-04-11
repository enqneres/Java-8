package interfacesFuncionais;

import java.util.function.Supplier;

public class Supridores {
    public static void main(String[] args) {
        Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();
        System.out.println(instanciaPessoa.get());
    }
}

class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa(){
        nome = "enoque";
        idade = 26;
    }
    @Override
    public String toString(){
        return String.format("nome: %s, idade: %d",nome,idade);
    }

}
