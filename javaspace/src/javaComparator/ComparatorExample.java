package javaComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<EstudanteComparable> estudante = new ArrayList<>();
        estudante.add(new EstudanteComparable("Alex",26));
        estudante.add(new EstudanteComparable("Joseph", 18));
        estudante.add(new EstudanteComparable("Pierre", 30));
        estudante.add(new EstudanteComparable("Jose", 27));
        estudante.add(new EstudanteComparable("Maria", 34));
        //imprime os nomes na ordem inserida
        System.out.println(estudante);
        //imprime as idades na ordem natural..
        estudante.sort((primeira,segunda)-> primeira.getIdade()- segunda.getIdade());
        System.out.println(estudante);
        //1° ordem reversa dos numeros -idade
        estudante.sort(Comparator.reverseOrder());
        System.out.println(estudante);
        //ordem natural dos numeros - idade(interface comparator)
        estudante.sort(Comparator.comparingInt(EstudanteComparable::getIdade));
        System.out.println(estudante);
        //2º ordem reversa dos numeros - idade(interface comparator)
        estudante.sort(Comparator.comparingInt(EstudanteComparable::getIdade).reversed());
        System.out.println(estudante);
        //ordem natural dos numeros - idade
        estudante.sort(EstudanteComparable::compareTo);
        System.out.println(estudante);
        //ordem natural dos numeros - idade
        Collections.sort(estudante);
        System.out.println(estudante);
        //ordem natural dos numeros - idade (interface comparator)
        Collections.sort(estudante, new EstudanteComparator());
        System.out.println(estudante);

    }
}
