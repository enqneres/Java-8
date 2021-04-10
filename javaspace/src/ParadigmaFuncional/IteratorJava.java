package ParadigmaFuncional;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorJava {
    public static void main(String[] args) {
        //metodo 1 usando loop (ESTILO IMPERATIVO)

        /*
        List<String> valores = Arrays.asList("1","2","3");
        Iterator<String> it = valores.iterator();
        int soma = 0;
        while (it.hasNext()){
            soma += Integer.parseInt(it.next());
        }
        System.out.println("Soma = " + soma);
        */

        //metodo 2 usando for each (ESTILO IMPERATIVO)

        /*
        List<String> valores = Arrays.asList("1","2","3");
        int soma = 0;
        for (String item:valores){
            soma += Integer.parseInt(item);
        }
        System.out.println("Soma = " + soma);

         */

        //metodo 3 usando Stream.. (ESTILO DECLARATIVO)

        List<String> valores = Arrays.asList("1","2","3");
        final int soma = valores.stream()
                .map(item -> Integer.parseInt(item))
                .reduce(0, (a,b) -> a+b);
        System.out.println("Soma = " + soma);
    }
}
