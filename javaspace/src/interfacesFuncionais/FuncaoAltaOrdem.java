package interfacesFuncionais;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {
        Calculo soma = (a,b) -> a+b;
        Calculo subtracao = (a,b) -> a-b;
        Calculo multiplicacao = (a,b) -> a*b;
        Calculo divisao = (a,b) -> a/b;
        System.out.println(executarOperacao(soma, 1, 5));
        System.out.println(executarOperacao(multiplicacao, 3,5));
        System.out.println(executarOperacao(subtracao,20,6));
        System.out.println(executarOperacao(divisao,8,2));
    }

    public static int executarOperacao(Calculo calculo, int a, int b ){
        return calculo.calculo(a,b);
    }
}

@FunctionalInterface
interface Calculo{
    public int calculo(int a,int b);
}

//por parametro recebe outra funcao
//ou que ela retorna uma funcao
