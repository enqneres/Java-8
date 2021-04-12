package processamentoAssincronoeParalelo;

import java.util.stream.IntStream;

//elementos que dao resto da divisao 2 quando sao divididos por 3


public class ParalelStream {
    public static void main(String[] args) {
        IntStream stream = IntStream.of(3,5,9,11,13,15);

        stream.filter(num -> num % 3 == 2)
                .forEach(System.out::println);
    }
}
