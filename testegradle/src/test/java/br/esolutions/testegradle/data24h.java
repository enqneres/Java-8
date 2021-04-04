package br.esolutions.testegradle;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class data24h {
    public static void main(String[]args){
        Date agora = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSS");
        String dataFormatada = formatter.format(agora);
        System.out.println(dataFormatada);

        System.out.println("==========================");

        LocalDateTime antigaData = LocalDateTime.of(2010,05,15,10,00,00);
        System.out.println(antigaData);
        LocalDateTime novaData = antigaData.plusYears(4).plusMonths(6).plusHours(13);
        System.out.println("A nova data e: " + novaData);
    }
}
