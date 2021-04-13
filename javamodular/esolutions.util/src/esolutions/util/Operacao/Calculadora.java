package esolutions.util.Operacao;

import esolutions.util.Operacao.internal.DivHelper;
import esolutions.util.Operacao.internal.MultHelper;
import esolutions.util.Operacao.internal.SubHelper;
import esolutions.util.Operacao.internal.SumHelper;


public class Calculadora {

    private SumHelper soma;
    private SubHelper subtracao;
    private MultHelper multiplicacao;
    private DivHelper divisao;

    public Calculadora(){
        soma = new SumHelper();
        subtracao = new SubHelper();
        multiplicacao = new MultHelper();
        divisao = new DivHelper();

    }
    public int sum(int a, int b){
        return soma.execute(a,b);
    }

    public int sub(int a, int b) {
        return subtracao.execute(a,b);
    }

    public int mult(int a, int b) {
        return multiplicacao.execute(a,b);
    }

    public int div(int a, int b) {
        return divisao.execute(a,b);
    }
}
