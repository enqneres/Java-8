package processamentoAssincronoeParalelo;

public class ThreadExemplo {
    public static void main(String[] args) {
        barraCarregamento2 barra2 = new barraCarregamento2();
        barraCarregamento3 barra3 = new barraCarregamento3();
        GerarPDF gerarPDF = new GerarPDF();

        barra2.start();
        barra3.start();
        gerarPDF.start();
    }
}

class GerarPDF extends Thread{
    @Override
    public void run(){
        super.run();
        try {
            Thread.sleep(5000);
            System.out.println("Gerar PDF");
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class barraCarregamento2 extends Thread{
    @Override
    public void run(){
        super.run();

        try {
            Thread.sleep(1000);
            System.out.println("Loading...50% ");
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class barraCarregamento3 extends Thread{
    @Override
    public void run(){
        super.run();

        try {
            Thread.sleep(3000);
            System.out.println("Loading....99% ");
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}