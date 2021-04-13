package esolutions.util.Operacao.internal;

import esolutions.util.Operacao.Operacao;

public class DivHelper implements Operacao {
    @Override
    public int execute(int a, int b){
        return a / b;
    }
}
