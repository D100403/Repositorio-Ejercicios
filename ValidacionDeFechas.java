package ar.com.educacionit.universidad;
import java.util.Scanner;

public class ValidacionDeFechas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int dia = obtenerDia(teclado);
        int mes = obtenerMes(teclado);
        int anio = obtenerAnio(teclado);
        
        teclado.close();
        
        if (validarDia(dia, mes, anio) && validarMes(mes) && validarAnio(anio)) {
            System.out.println("La fecha es correcta.");
        } else {
            System.out.println("La fecha es incorrecta.");
        }
    }
    
    public static int obtenerDia(Scanner scanner) {
        System.out.println("Ingrese el día:");
        return scanner.nextInt();
    }
    
    public static int obtenerMes(Scanner scanner) {
        System.out.println("Ingrese el mes:");
        return scanner.nextInt();
    }
    
    public static int obtenerAnio(Scanner scanner) {
        System.out.println("Ingrese el año:");
        return scanner.nextInt();
    }
    
    public static boolean validarDia(int dia, int mes, int anio) {
        if (dia >= 1 && dia <= 31) {
            if (mes == 2) {
                if (esBisiesto(anio)) {
                    return dia <= 29;
                } else {
                    return dia <= 28;
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                return dia <= 30;
            } else {
                return true;
            }
        }
        return false;
    }
    
    public static boolean validarMes(int mes) {
        return mes >= 1 && mes <= 12;
    }
    
    public static boolean validarAnio(int anio) {
        return anio >= 1900 && anio <= 2099;
    }
    
    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
}
