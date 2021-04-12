package processamentoAssincronoeParalelo;

import java.util.Random;
import java.util.concurrent.*;

/**
 *
 * Classe que cria um pool de threads e cria uma thread do tipo GerarNumeroAleatorio
 que apenas gera um numero e o retorna para a classe que
 * criou a thread.
 *
 * @author Eduardo Santana - contribuição ao site DevMedia
 *
 * Obs: o código foi modificado por mim, Enoque Neres, para melhor compreensão de cada linha.
 *
 */

public class GerarNumero {
    private static final ExecutorService threadpoll = Executors.newFixedThreadPool(3);

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        GerarNumeroAleatorio task = new GerarNumeroAleatorio();

        System.out.println("*** BEM VINDO AO GERADOR DE NUMEROS ***");
        Thread.sleep(1000);

        System.out.println("Aguarde um instante..");
        Thread.sleep(2000);

        Future<Integer> future = threadpoll.submit(task);
        while (!future.isDone()){
            System.out.println("A tarefa ainda nao foi processada. Aguarde 3 segundos...");
            Thread.sleep(3000);
        }
        System.out.println("Tarefa completa!");
        long factorial = (long) future.get();
        System.out.println("O numero gerado foi: " + factorial);
        threadpoll.shutdown();
    }
    // classe que implementa a interface Callable e retorna um numero aleatorio

    private static class GerarNumeroAleatorio implements Callable<Integer>{
        @Override
        public Integer call(){
            Random rand = new Random();
            Integer number = rand.nextInt(100);
            return number;
        }
    }
}
