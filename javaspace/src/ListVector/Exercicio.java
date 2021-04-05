package ListVector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio {
    public static void main(String[] args) {
        List<String> estudantes = new ArrayList<>();
        estudantes.add("Juliana");
        estudantes.add("Pedro");
        estudantes.add("Carlos");
        estudantes.add("Larissa");
        estudantes.add("Joao");

        //navegue pela lista e exiba os nomes..
        for (String nomes: estudantes){
            System.out.println(nomes);
        }

        //substitua o Carlos pelo Roberto..
        estudantes.set(2, "Roberto");
        System.out.println(estudantes);

        //retorne o nome da posicao 1..
        System.out.println(estudantes.get(1));

        //remova o nome da posicao 4..
        estudantes.remove(4);
        System.out.println(estudantes);

        //remova o nome Joao
        estudantes.remove("Joao");
        System.out.println(estudantes);

        //retorne a quantidade de itens na lista..
        int quantidade = estudantes.size();
        System.out.println("Agora ha " + quantidade + " na lista");

        //verifique se o Juliano existe na lista..
        boolean temJuliano = estudantes.contains("Juliano");
        System.out.println(temJuliano);

        //adicione o Ismael e o Rodrigo..
        estudantes.add("Ismael");
        estudantes.add("Rodrigo");
        System.out.println(estudantes);

        //ordenar por ordem alfabetica..
        Collections.sort(estudantes);
        System.out.println(estudantes);

        //verifique se a lista esta vazia..
        boolean listaEstaVazia = estudantes.isEmpty();
        System.out.println(listaEstaVazia);





    }

}
