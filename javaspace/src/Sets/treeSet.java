package Sets;

import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        TreeSet<String> cidades = new TreeSet<>();

        cidades.add("Porto Alegre");
        cidades.add("Florianopolis");
        cidades.add("Curitiba");
        cidades.add("Sampa");
        cidades.add("Rio");

        System.out.println(cidades);
    }
}