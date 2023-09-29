package ejercicio.java.desafio3;

public class TorreDeControl {
    public boolean permitirAterrizaje(IVolador volador, Operario operario) {
        if (volador instanceof IContratoAterrizaje) {
            IContratoAterrizaje objetoAterrizaje = (IContratoAterrizaje) volador;
            if (objetoAterrizaje.cumplirContrato()) {
                return true;
            } else {
                boolean autorizacion = operario.autorizarAterrizaje(volador);
                if (autorizacion) {
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            if (volador instanceof Avion) {
                Avion avion = (Avion) volador;
                if (avion.esDeArgentina()) {
                    return true;
                } else if (avion.esDeChile() || avion.esDeUruguay() || avion.esDeBrasil()) {
                    return true;
                }
            }
            return false;
        }
    }
}
