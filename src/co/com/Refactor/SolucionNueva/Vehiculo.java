package co.com.Refactor.SolucionNueva;

public abstract class Vehiculo {

    private int limiteInferior;
    private int limiteInferiorIntermedio;
    private int limiteSuperior;
    private String tipoVehiculo;

    public Vehiculo(int limiteInferior, int limiteInferiorIntermedio,
                    int limiteSuperior, String tipoVehiculo) {
        this.limiteInferior = limiteInferior;
        this.limiteInferiorIntermedio = limiteInferiorIntermedio;
        this.limiteSuperior = limiteSuperior;
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getLimiteInferior() {
        return limiteInferior;
    }

    public int getLimiteInferiorIntermedio() {
        return limiteInferiorIntermedio;
    }

    public int getLimiteSuperior() {
        return limiteSuperior;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setLimiteInferior(int limiteInferior) {
        this.limiteInferior = limiteInferior;
    }

    public String enviarCorreoFotomulta(){
        String cuerpoMensaje =
                "//Enviando correo para el tipo " + tipoVehiculo + ".";
        String asunto = "//Asunto: comparendo "+ tipoVehiculo + ".";
        return   asunto + cuerpoMensaje;
    }

    public int calcularComparendo(int velocidad){
        int tipoComparendo = 2;
        if(velocidad <= this.getLimiteInferior()) {
            tipoComparendo = 0;
        }else if (velocidad >= this.getLimiteInferiorIntermedio() && velocidad <= this.getLimiteSuperior()) {
            tipoComparendo = 1;
        }
        return tipoComparendo;
    }
}
