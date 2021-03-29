package heranca;

public class InstanciaCarroMoto {

   public void main(String[] args){
       Carro carro = new Carro();
       carro.setMarca("Fiat");
       carro.setModelo("Argo");
       carro.setQuantidadePortas(4);
       carro.acelera();

       Moto moto = new Moto();
       moto.setMarca("Yamaha");
       moto.setModelo("MT-03");
       moto.setCilindradas("600cc");
       moto.acelera();
    }
}
