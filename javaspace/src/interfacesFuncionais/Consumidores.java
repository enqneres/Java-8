package interfacesFuncionais;

import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args) {
        //JEITO 1
        // Consumer<String> imprimirUmaFrase = System.out::println;

        //JEITO 2
        Consumer<String> imprimirUmaFrase = frase -> System.out.println(frase);
        imprimirUmaFrase.accept("So sei que nada sei");
    }
}
