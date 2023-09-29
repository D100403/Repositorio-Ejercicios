package ejercicio.java.desafio3;

public class Operario {
    public boolean autorizarAterrizaje(IVolador volador) {
        if (volador instanceof Avion) {
            Avion avion = (Avion) volador;
            if (avion.esDeArgentina()) {
                System.out.println("El avión es de Argentina. Aterrizaje en la Pista 1 autorizado.");
                return true;
            } else if (avion.esDeChile() || avion.esDeUruguay() || avion.esDeBrasil()) {
                System.out.println("El avión es de Uruguay, Chile o Brasil. Aterrizaje en la Pista 2 autorizado.");
                return true;
            }
        }

        System.out.println("El objeto volador no cumple con las condiciones para aterrizar.");
        return false;
    }
}
