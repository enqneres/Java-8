package Sets;

import java.util.Collections;
import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
        HashSet<String> estados = new HashSet();

        estados.add("Para");
        estados.add("Roraima");
        estados.add("Amazonas");
        estados.add("Piaui");
        estados.add("Ceara");

        System.out.println(estados);

        estados.add(null);
        System.out.println(estados);

    }
}
