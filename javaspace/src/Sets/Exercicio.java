package Sets;

import java.util.HashSet;

public class Exercicio {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();

        //adicione 5 numeros inteiros..
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        System.out.println(numeros);

        //navegue pelos numeros..
        for (Integer ordem: numeros){
            System.out.println(ordem);
        }

        //remova o primeiro item do Set..
        numeros.remove(3);
        System.out.println(numeros);

        //adicione o novo numero 23..
        numeros.add(23);
        System.out.println(numeros);

        //verifique o tamanho do Set..
        int tamanho = numeros.size();
        System.out.println(tamanho);

        //verifique se o set esta vazio..
        boolean estaVazio = numeros.isEmpty();
        System.out.println(estaVazio);
    }
}
