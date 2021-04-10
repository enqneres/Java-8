package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {
    public static void main(String[] args) {
        List<String> jogadores = new ArrayList<>();

        jogadores.add("Julio");
        jogadores.add("Marcelo");
        jogadores.add("Adriano");
        jogadores.add("Thiago");

        System.out.println("Contagem: " + jogadores.stream().count());

        System.out.println("Maior numero de letras: " + jogadores.stream().max(Comparator.comparingInt(String::length)));

        System.out.println("Menor nuumero de letras: " + jogadores.stream().min(Comparator.comparingInt(String::length)));

        System.out.println("Com a letra R no nome: " + jogadores.stream().filter((jogador) ->
        jogador.toLowerCase().contains("r")).collect(Collectors.toList()));

        System.out.println("Retorna os 3 primeiros elementos: " + jogadores.stream().limit(3).collect(Collectors.toList()));

        System.out.println("Retorne todos " + jogadores.stream().peek(System.out::println).collect(Collectors.toList()));

        System.out.println("Retorna novamente: ");
        jogadores.stream().forEach(System.out::println);

        System.out.println("Tem algum elemento com W no nome? " + jogadores.stream().allMatch((elemento)-> elemento.contains("W")));

    }
}
