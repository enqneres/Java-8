package javaMap;

import java.util.HashMap;
import java.util.Map;

public class MapAtividade {
    public static void main(String[] args) {
        Map<String, String> capitais = new HashMap<>();

        capitais.put("RS","Porto Alegre");
        capitais.put("PB","Jao Pessoa");
        capitais.put("TO","Palmas");
        capitais.put("RJ","Rio de Janeiro");

        System.out.println(capitais.get(3));

        System.out.println(capitais.containsKey("Rio de Janeiro"));

        System.out.println(capitais.containsValue("Porto Alegre"));

        System.out.println(capitais.get("Rio de Janeiro"));

        capitais.put(null,"Sao Paulo");
        System.out.println(capitais);



        //System.out.println(timesCampeoes);

        //System.out.println(timesCampeoes.get("Remo"));

        //System.out.println(timesCampeoes.containsKey("Tuna"));

        //System.out.println(timesCampeoes.containsValue(4));

        //System.out.println(timesCampeoes.size());

        //System.out.println(timesCampeoes.get(2));
    }

}
