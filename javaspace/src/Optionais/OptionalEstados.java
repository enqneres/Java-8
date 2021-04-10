package Optionais;

import java.util.Optional;

public class OptionalEstados {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("23");
        System.out.println(optionalString);
        //
        Optional<String> optionalNull = Optional.ofNullable("Carla");
        System.out.println(optionalNull);
        //
        Optional<String> optionalVazio = Optional.empty();
        System.out.println(optionalVazio);

        Optional<String> optionalS = Optional.of(null);
        System.out.println(optionalS);

    }
}
