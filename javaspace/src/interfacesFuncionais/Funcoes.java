package interfacesFuncionais;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        Function<String, String> retorneNomeContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String,Integer> converteEcalcula = string -> Integer.valueOf(string) * 2;

        System.out.println(retorneNomeContrario.apply("so sei que nada sei"));
        System.out.println(converteEcalcula.apply("30"));
    }
}
