package Sets;

import java.util.LinkedHashSet;

public class linkedhashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> municipios = new LinkedHashSet<>();

        municipios.add("Brejo/MA");
        municipios.add("Braganca/PA");
        municipios.add("Granja/CE");
        municipios.add("Porto de Galinhas/PE");
        municipios.add("Cruzeiro do Sul/AM");

        System.out.println(municipios);
    }
}
