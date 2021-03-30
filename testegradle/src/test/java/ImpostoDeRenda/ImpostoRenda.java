package ImpostoDeRenda;

public class ImpostoRenda {
    public static void main (String[]args){
        Gerente gerente = new Gerente();
        gerente.setFuncao("Gerente Luis");
        gerente.setSalario(5000);
        System.out.println(gerente.getFuncao());
        System.out.println("IR a pagar: " + gerente.getSalario());

        Supervisor supervisor = new Supervisor();
        supervisor.setFuncao("Supervisor Mateus");
        supervisor.setSalario(3000);
        System.out.println(supervisor.getFuncao());
        System.out.println("IR a pagar: " + supervisor.getSalario());

        Atendente atendente = new Atendente();
        atendente.setFuncao("Atendente Maria");
        atendente.setSalario(1200);
        System.out.println(atendente.getFuncao());
        System.out.println("IR a pagar: " + atendente.getSalario());

    }
}
