package ejercicios.java.desafio2;

import java.util.Scanner;

public class ControlDeNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos a procesar: ");
        int cantidadAlumnos = teclado.nextInt();
        teclado.nextLine();

        String[] nombres = new String[cantidadAlumnos];
        String[] apellidos = new String[cantidadAlumnos];
        double[] promedios = new double[cantidadAlumnos];

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Ingrese los datos del alumno " + (i + 1) + ":");
            System.out.print("Nombre: ");
            nombres[i] = teclado.nextLine();
            System.out.print("Apellido: ");
            apellidos[i] = teclado.nextLine();

            double sumaNotas = 0;
            System.out.print("Cantidad de exámenes: ");
            int cantidadExamenes = teclado.nextInt();
            for (int j = 0; j < cantidadExamenes; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                sumaNotas += teclado.nextDouble();
            }
            teclado.nextLine();

            promedios[i] = sumaNotas / cantidadExamenes;
        }

        double promedioMasAlto = promedios[0];
        double promedioMasBajo = promedios[0];
        String alumnosPromedioMasAlto = nombres[0] + " " + apellidos[0];
        String alumnosPromedioMasBajo = nombres[0] + " " + apellidos[0];

        for (int i = 1; i < cantidadAlumnos; i++) {
            if (promedios[i] > promedioMasAlto) {
                promedioMasAlto = promedios[i];
                alumnosPromedioMasAlto = nombres[i] + " " + apellidos[i];
            } else if (promedios[i] == promedioMasAlto) {
                alumnosPromedioMasAlto += ", " + nombres[i] + " " + apellidos[i];
            }

            if (promedios[i] < promedioMasBajo) {
                promedioMasBajo = promedios[i];
                alumnosPromedioMasBajo = nombres[i] + " " + apellidos[i];
            } else if (promedios[i] == promedioMasBajo) {
                alumnosPromedioMasBajo += ", " + nombres[i] + " " + apellidos[i];
            }
        }

        System.out.println("Alumno con el promedio más alto: " + alumnosPromedioMasAlto);
        System.out.println("Alumno con el promedio más bajo: " + alumnosPromedioMasBajo);
        
        System.out.println("Alumnos que promocionan (promedio >= 7):");
        for (int i = 0; i < cantidadAlumnos; i++) {
            if (promedios[i] >= 7) {
                System.out.println(nombres[i] + " " + apellidos[i]);
            }
        }

        System.out.println("Alumnos que deben recursar (promedio < 7):");
        for (int i = 0; i < cantidadAlumnos; i++) {
            if (promedios[i] < 7) {
                System.out.println(nombres[i] + " " + apellidos[i]);
            }
        }
    }
}