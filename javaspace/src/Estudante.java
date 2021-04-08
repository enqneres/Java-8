import java.util.Comparator;

public class Estudante implements Comparator<Estudante> {
    private final String nome;
    private final Integer idade;

    public Estudante(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }
    public Integer getIdade(){
        return idade;
    }

    @Override
}
