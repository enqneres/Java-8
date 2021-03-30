package polimorfismo;

public class Main {
    public static void main(String[]args){
        Veiculo generico = new Veiculo();
        generico.setValorVenal(1000.0);
        System.out.println("O valor do IPVA de um veiculo generico");
        System.out.println(generico.calculaImposto());

        System.out.println("===========================");

        Veiculo carro = new Carro();
        carro.setValorVenal(3500.0);
        System.out.println("O valor do IPVA de um carro");
        System.out.println(carro.calculaImposto());

        System.out.println("===========================");

        Veiculo moto = new Moto();
        moto.setValorVenal(1500.0);
        System.out.println("O valor do IPVA de uma moto");
        System.out.println(moto.calculaImposto());
    }
}
