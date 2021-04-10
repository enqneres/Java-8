package javaMap;

import java.util.Map;
import java.util.TreeMap;

public class exercicioMap {
    public static void main(String[] args) {
        TreeMap<String, String> estados = new TreeMap<>();
//adiciona os 26 estados brasileiros
        estados.put("PA","Para");
        estados.put("PI","Piaui");
        estados.put("CE","Ceara");
        estados.put("MA","Maranhao");
        estados.put("AM","Amazonas");
        estados.put("AC","Acre");
        estados.put("AL","Alagoas");
        estados.put("AP","Amapa");
        estados.put("BA","Bahia");
        estados.put("DF","Distrito Federal");
        estados.put("ES","Espirito Santo");
        estados.put("GO","Goias");
        estados.put("MT","Mato Grosso");
        estados.put("MS","Mato Grosso do Sul");
        estados.put("MG","Minas Gerais");
        estados.put("PB","Paraiba");
        estados.put("PR","Parana");
        estados.put("PE","Pernambuco");
        estados.put("RR","Roraima");
        estados.put("RO","Rondonia");
        estados.put("RJ","Rio de Janeiro");
        estados.put("RN","Rio Grande do Norte");
        estados.put("RS","Rio Grande do Sul");
        estados.put("SC","Santa Catarina");
        estados.put("SP","Sao Paulo");
        estados.put("SE","Sergipe");

        System.out.println(estados);

        //remova o estado de Minas Gerais
        estados.remove("MG","Minas Gerais");
        System.out.println(estados);

        //adiciona o Distrito Federal
        estados.put("DF","Distrito Federal");
        System.out.println(estados);

        //mostra o tamanho do mapa
        int tamanho = estados.size();
        System.out.println(tamanho);

        //remova o estado de Mato Grosso do Sul usando o nome
        estados.remove( "MS","Mato Grosso do Sul");
        System.out.println(estados);

        //navega no mapa
        System.out.println("***LISTA DOS ESTADOS***");
        for (Map.Entry<String,String>estadosAtuais:estados.entrySet()){
            String key=estadosAtuais.getKey();
            String value= estadosAtuais.getValue();
            System.out.println(value+"("+key+")");
        }

        //verifica se existe o estado de SC pesquisando pela sigla
        boolean santacatarina = estados.containsKey("SC");
        System.out.println("SC na lista? " + santacatarina);

        //verifica se o maranhão existe pesquisando pelo nome
        boolean maranhao = estados.containsValue("Maranhao");
        System.out.println("Maranhao na lista? " + maranhao);

    }
}
