package interfacesFuncionais;

public class Iteracoes {
    public static void main(String[] args) {
        String[] nomes = {"Mateus","Leo","Joana"};
        Integer[] numeros = {1,2,3};
        imprimirNomes(nomes);
    }

    public static void imprimirNomes(String... nomes){
        String nomesImprimir = "";
        for (int i = 0; i < nomes.length; i++){
            if (nomes[i].equals("Joana")){
                nomesImprimir+=" " + nomes[i];
            }
        }
        System.out.println("Nomes do for: " + nomesImprimir);
    }
}
