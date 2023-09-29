package ejercicio.java.desafio3;

public class Pista1 extends PistaAterrizaje {

    public void autorizarAterrizaje(IVolador volador) {
        if (volador instanceof IContratoAterrizaje) {
            IContratoAterrizaje contrato = (IContratoAterrizaje) volador;
            if (contrato.cumplirContrato()) {
                System.out.println("Aterrizaje en Pista 1 autorizado.");
            } else {
                System.out.println("No se cumple el contrato de aterrizaje en Pista 1.");
            }
        } else {
            System.out.println("No se permite el aterrizaje en Pista 1 para este objeto.");
        }
    }
}