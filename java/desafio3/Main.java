package ejercicio.java.desafio3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IVolador> voladores = new ArrayList<>();

        Avion avionArgentina = new Avion(true, false, "Argentina");
        Avion avionChile = new Avion(false, true, "Chile");
        Avion avionUruguay = new Avion(false, true, "Uruguay");
        Avion avionBrasil = new Avion(false, true, "Brasil");
        Avion avionExtranjero = new Avion(false, true, "Francia");

        voladores.add(avionArgentina);
        voladores.add(avionChile);
        voladores.add(avionUruguay);
        voladores.add(avionBrasil);
        voladores.add(avionExtranjero);

        Operario operario = new Operario();

        TorreDeControl torre = new TorreDeControl();

        for (IVolador volador : voladores) {
            volador.volar();
            boolean autorizacionPista1 = false;

            if (volador instanceof Avion) {
                Avion avion = (Avion) volador;
                if (avion.esDeArgentina()) {
                    autorizacionPista1 = true;
                    System.out.println("Avion:");
                    System.out.println("Es de Argentina");
                    System.out.println("Autorización: Puede aterrizar en Pista1");
                } else if (avion.esDeChile() || avion.esDeUruguay() || avion.esDeBrasil()) {
                    boolean autorizacionPista2 = torre.permitirAterrizaje(volador, operario);
                    System.out.println("Avion:");
                    System.out.println("Es de " + (avion.esDeChile() ? "Chile" : avion.esDeUruguay() ? "Uruguay" : "Brasil"));
                    System.out.println("Autorización: Puede aterrizar en Pista2");
                    System.out.println("Autorización para Pista 2: " + (autorizacionPista2 ? "Autorizado" : "No Autorizado"));
                } else {
                    System.out.println("Avion:");
                    System.out.println("Es de Francia (Extranjero)");
                    System.out.println("No tiene autorización para aterrizaje.");
                }
            }
        }
    }
}

