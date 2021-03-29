package br.esolutions.testegradle;

//Vamos ver um exemplo para imprimir o nome do carregador de classe

public class ClassLoaderExample {
    public static void main(String[]args)
    {
        // Vamos imprimir o nome do carregador de classes da classe atual.
        // O carregador de classe Aplicativo / Sistema carregará esta classe
        Class c=ClassLoaderExample.class;
        System.out.println(c.getClassLoader());
        /// Se imprimirmos o nome do carregador de classes de String, ele imprimirá nulo porque é uma
        // classe incorporada que é encontrada em rt.jar, portanto é carregada pelo carregador de classe Bootstrap
        System.out.println(String.class.getClassLoader());
    }
}
