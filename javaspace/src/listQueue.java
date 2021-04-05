import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class listQueue {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();
        filaBanco.add("Pamela");
        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flavio");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clienteaSerAtendido = filaBanco.poll();
        System.out.println(clienteaSerAtendido);
        System.out.println(filaBanco);

        //filaBanco.clear();

        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        String primeiroClienteouErro = filaBanco.element();
        System.out.println(primeiroClienteouErro);
        System.out.println(filaBanco);

        for (String client: filaBanco){
            System.out.println(client);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        while (iteratorFilaBanco.hasNext()){
            System.out.println("---->" + iteratorFilaBanco.next());
        }

        System.out.println(filaBanco.size());

        System.out.println(filaBanco.isEmpty());
    }
}
