package Optionais;

import java.util.Optional;

public class ExemploOptional {
    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Valor opcional");
        System.out.println(optionalString.isPresent());

        optionalString.ifPresent(System.out::println);
    }
}
