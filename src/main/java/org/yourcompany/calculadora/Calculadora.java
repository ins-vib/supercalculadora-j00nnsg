package org.yourcompany.calculadora;
import java.util.Scanner;
/**
 *
 * @author Jon Serrano González
 */


public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eleccio;
        int nombre;
        int potencia;
        // Exemples de crida per al mètode sumaPrimersNumeros
        // System.out.println("Suma dels primers 5 números: " + sumaPrimersNumeros(5));
        // System.out.println("Suma dels primers 10 números: " + sumaPrimersNumeros(10));
        // System.out.println("Suma dels primers 15 números: " + sumaPrimersNumeros(15));
        // System.out.println();

        // Exemples de crida per al mètode calcularFactorial
        // System.out.println("Factorial de 5: " + calcularFactorial(5));
        // System.out.println("Factorial de 7: " + calcularFactorial(7));
        // System.out.println("Factorial de 10: " + calcularFactorial(10));
        // System.out.println();

        // Exemples de crida per al mètode sumaQuadrats
        // System.out.println("Suma dels quadrats dels primers 3 números: " + sumaQuadrats(3));
        // System.out.println("Suma dels quadrats dels primers 5 números: " + sumaQuadrats(5));
        // System.out.println("Suma dels quadrats dels primers 7 números: " + sumaQuadrats(7));
        // System.out.println();

        // Exemples de crida per al mètode calcularPotencia
        // System.out.println("2 elevat a la potència 3: " + calcularPotencia(2, 3));
        // System.out.println("5 elevat a la potència 4: " + calcularPotencia(5, 4));
        // System.out.println("3 elevat a la potència 5: " + calcularPotencia(3, 5));

        System.out.println("------------------ Menú ------------------");
        System.out.println("  1 - Nombre dígits");
        System.out.println("  2 - Sumar primers nombres");
        System.out.println("  3 - Calcular factorial");
        System.out.println("  4 - Sumar quadrats");
        System.out.println("  5 - Calcular potència");
        System.out.println("  6 - Soritr");
        System.out.println();
        System.out.print("  Escull una opció: ");
        eleccio = scanner.nextInt();
        System.out.println("------------------------------------------");

        while (eleccio != 6) {
            switch (eleccio) {
                case 1: // Nombre dígits
                    System.out.print("Entra un nombre: ");
                    nombre = scanner.nextInt();
                    System.out.println("Nombre de xifres: " + nombreDigits(nombre));
                    break;
                    case 2: // Sumar primers nombres
                    System.out.print("Entra un nombre: ");
                    nombre = scanner.nextInt();
                    System.out.println("Suma dels primers 5 números: " + sumaPrimersNumeros(nombre));
                    break;
                case 3: // Calcular factorial
                    System.out.print("Entra un nombre: ");
                    nombre = scanner.nextInt();
                    System.out.println("Factorial de " + nombre + ": " + calcularFactorial(nombre));
                    break;
                case 4: // Sumar quadrats
                    System.out.print("Entra un nombre: ");
                    nombre = scanner.nextInt();
                    System.out.println("Suma dels quadrats dels primers " + nombre + " números: " + sumaQuadrats(nombre));
                    break;
                case 5: // Calcular potències
                    System.out.print("Entra un nombre: ");
                    nombre = scanner.nextInt();
                    System.out.print("Entra una potència: ");
                    potencia = scanner.nextInt();
                    System.out.println("5 elevat a la potència 4: " + calcularPotencia(nombre, potencia));
                    break;
                case 6: // Sortir
                    break;

                default:
                System.out.println("Escull una opció vàlida"); 
            }
        }
    }

    /**
     * Calcula el nombre de dígits d’un número enter.
     * Funciona tant per a nombres positius com negatius.
     * Si el nombre és 0, retorna 1.
     *
     * @param nombre Número del qual es vol saber el nombre de dígits
     * @return Quantitat de dígits que té {@code nombre}
     */


    public static int nombreDigits(int nombre) {
        if (nombre == 0) {
            return 1; // el 0 té un dígit
        }        
        int comptador = 0;
        while (nombre != 0) {
            nombre /= 10;
            comptador++;
        }
        return comptador;
    }

    public static int sumaPrimersNumeros(int nombre) {
        int suma = 0;

        while (nombre != 0) {
            suma = suma + nombre;
            nombre--;
        }

        return suma;
    }

    public static int calcularFactorial(int nombre) {
        int r = 1;

        while (nombre != 0) { 
            r = r * nombre;
            nombre--;
        }

        return r;
    }

    public static int sumaQuadrats(int nombre) {
        int quadrat = nombre;
        int suma = 0;

        while (nombre != 0) {
            quadrat = nombre * nombre;
            if (suma == 0) {
                suma = quadrat;
            } else {
                suma += quadrat;
            }
            nombre--;
        }
        return suma;
    }

    public static int calcularPotencia(int nombre, int potencia) {
        int resultat = nombre;

        while (potencia > nombre) {
            resultat = resultat + nombre;
            potencia--;
        }

        return resultat;
    }

}