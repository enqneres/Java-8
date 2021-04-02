package javaDate;
import java.util.Date;

//Descobrir o timeInMillis do dia em que nasci

public class meuTimeInMilis {

    public static void main (String[]args){
        Date dataHoje = new Date();
        Long dataHojeMillis = dataHoje.getTime();

        System.out.println(dataHoje);
        System.out.println(dataHojeMillis);
        //imprime a data e hora de hoje..
        //imprime o time millis de hoje..

        @Deprecated
        Date minhaDataNasc = new Date(94,10,26);
        Long timeMillisNasc = minhaDataNasc.getTime();
        Date novoNasc = new Date(timeMillisNasc);

        System.out.println(novoNasc);
        System.out.println(timeMillisNasc);
        //imprime a data de nascimento..
        //imprime o timeMillis dessa data de nascimento ..

        @Deprecated
        Date novaData = new Date(2010,04,15);
        boolean dataAnterior = novaData.after(novoNasc);
        boolean dataPosterior = novaData.before(novoNasc);

        System.out.println(dataAnterior);
        System.out.println(dataPosterior);

        //retorna true ou false caso a dataNasc seja anterior a novaData
        //retorna true ou false caso a dataNasc seja posterior a novaData
    }
    }