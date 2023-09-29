package ejercicio.java.desafio3;

public class Avion implements IVolador, IContratoAterrizaje {
    private boolean esDeArgentina;
    private boolean esExtranjero;
    private String paisOrigen;

    public Avion(boolean esDeArgentina, boolean esExtranjero, String paisOrigen) {
        this.esDeArgentina = esDeArgentina;
        this.esExtranjero = esExtranjero;
        this.paisOrigen = paisOrigen;
    }

    @Override
    public void volar() {
    }

    @Override
    public boolean cumplirContrato() {
        return esDeUruguay() || esDeChile() || esDeBrasil();
    }

    public boolean esDeArgentina() {
        return esDeArgentina;
    }

    public boolean esExtranjero() {
        return esExtranjero;
    }

    public boolean esDeChile() {
        return paisOrigen.equalsIgnoreCase("Chile");
    }

    public boolean esDeUruguay() {
        return paisOrigen.equalsIgnoreCase("Uruguay");
    }

    public boolean esDeBrasil() {
        return paisOrigen.equalsIgnoreCase("Brasil");
    }
}
