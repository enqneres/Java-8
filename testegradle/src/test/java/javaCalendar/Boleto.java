package javaCalendar;

import java.util.Calendar;

public class Boleto {
    public static void main(String[]args){
        Calendar agora = Calendar.getInstance();
        System.out.println(agora);
        //convertendo..
        System.out.println("A data corrente e: " + agora.getTime());
        //convertendo para o padrao BR..
        System.out.printf("A data brasileira e: " + "%tF\n", agora);
        //criando estrutura data de vencimento..
        Calendar dataVencimento = Calendar.getInstance();
        dataVencimento.add(Calendar.DATE, 10);
        System.out.printf("Seu boleto vence em: " + "%tF\n", dataVencimento);
        }
    }

    /* printf acrescido de:

    * "%tc\n" - imprime padrao em pt-br
    * "%tF\n" - imprime data no formato YY-MM-DD
    * "%tD\n" - imprime data no formato MM/DD/YY
    * "%tr\n" - imprime hora no formato 00:00:00 AM/PM
    * "%tT\n" - imprime hora no formato 24h

     */
