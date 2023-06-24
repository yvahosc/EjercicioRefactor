package co.com.Refactor.SolucionNueva;

public class Main {
    public static void main(String[] args) {

        ComparendoNueva comparendo =  new ComparendoNueva();

        Carro carro = new Carro();
        Mula mula = new Mula();
        Camion camion = new Camion();

        comparendo.construirFotoMulta(80, carro);
        comparendo.construirFotoMulta(200, mula);
        comparendo.construirFotoMulta(40, camion);

        /*
        comparendo.construirFotoMulta(400, carro);
        comparendo.construirFotoMulta(400, mula);
        comparendo.construirFotoMulta(400, camion);
        */
    }
}
