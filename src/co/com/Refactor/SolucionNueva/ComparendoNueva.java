package co.com.Refactor.SolucionNueva;

public class ComparendoNueva {

    private Camion camion;
    private Carro carro;
    private Mula mula;

    public ComparendoNueva(Camion camion, Carro carro, Mula mula) {
        this.camion = camion;
        this.carro = carro;
        this.mula = mula;
    }

    public ComparendoNueva(int limiteInferiorCarro) {
        this.carro.setLimiteInferior(limiteInferiorCarro);
    }

    public ComparendoNueva() {
    }

    public String enviarCorreoFotomulta(Vehiculo vehiculo) {
        return vehiculo.enviarCorreoFotomulta();
    }

    public int calcularComparendo(int velocidad, Vehiculo vehiculo) {
        return vehiculo.calcularComparendo(velocidad);
    }

    public void construirFotoMulta(int velocidad, Vehiculo vehiculo) {

        int tipoMulta = calcularComparendo(velocidad, vehiculo);
        String mensajeMulta = enviarCorreoFotomulta(vehiculo);
        System.out.println("----el tipo de comparendo es: " + tipoMulta + " " +
                "----cuerpo del correo" + mensajeMulta);
    }
}
