package org.yourcompany.calculadora;
import java.util.Random;
/**
 *
 * @author Posa el teu nom
 */


public class Calculadora {

    public static void main(String[] args) {

        // Exemples de crida pel mètode nombreDigits
        System.out.println("Nombre de dígits de 1234: " + nombreDigits(1234));
        System.out.println("Nombre de dígits de 56789: " + nombreDigits(56789));
        System.out.println("Nombre de dígits de -101010: " + nombreDigits(-101010));
        System.out.println("Nombre de dígits de 0: " + nombreDigits(0));

        // Crida pel mètode numeroCares
        System.out.println("Nº de cares tirada 50 vegades: " + numeroCares(50));
        System.out.println("Nº de cares tirada 100 vegades: " + numeroCares(100));
        System.out.println("Nº de cares tirada 10000 vegades: " + numeroCares(10000));

        // Crida pel mètode preuCinema
        System.out.println("true, true: " + preuCinema(5,true,true));
        System.out.println("false, true: " + preuCinema(5,false,true));
        System.out.println("true, false: " + preuCinema(5,true,false));
        System.out.println("false, false: " + preuCinema(5,false,false));

        // Exemples de crida per al mètode sumaPrimersNumeros
        // System.out.println("Suma dels primers 5 números: " + sumaPrimersNumeros(5));
        // System.out.println("Suma dels primers 10 números: " + sumaPrimersNumeros(10));
        // System.out.println("Suma dels primers 15 números: " + sumaPrimersNumeros(15));

        // Exemples de crida per al mètode calcularFactorial
        // System.out.println("Factorial de 5: " + calcularFactorial(5));
        // System.out.println("Factorial de 7: " + calcularFactorial(7));
        // System.out.println("Factorial de 10: " + calcularFactorial(10));

        // Exemples de crida per al mètode sumaQuadrats
        // System.out.println("Suma dels quadrats dels primers 3 números: " + sumaQuadrats(3));
        // System.out.println("Suma dels quadrats dels primers 5 números: " + sumaQuadrats(5));
        // System.out.println("Suma dels quadrats dels primers 7 números: " + sumaQuadrats(7));

        // Exemples de crida per al mètode calcularPotencia
        // System.out.println("2 elevat a la potència 3: " + calcularPotencia(2, 3));
        // System.out.println("5 elevat a la potència 4: " + calcularPotencia(5, 4));
        // System.out.println("3 elevat a la potència 5: " + calcularPotencia(3, 5));
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

    public static int numeroCares(int repeticions) {

        // Definir variables
        Random generador = new Random();
        int r;
        int numero = 0;
        int cares = 0;
        int creus = 0;
        
        // Bucle
        while (numero < repeticions) { 

            // Generar un nombre
            r = generador.nextInt(0,2);
            numero++;
            
            // Comptar cares i creus {
            if (r == 0) {
                cares++;
            } else {
                creus++;
            }
        }

        // Sortida
        return cares;
    }

    public static double preuCinema(double PreuBase, boolean wknd, boolean carnetJove) {
        
        // Variables
        double entradawknd = PreuBase+PreuBase*10/100;

        // Condicionals
        if (wknd == true) {
            if (carnetJove == true) {
                return entradawknd-(entradawknd*15/100);
            }
            else {
                return entradawknd;
            }
        }
        else {
            if (carnetJove == true) {
                return PreuBase-(PreuBase*15/100);
            } else {
                return PreuBase;
            }
        }
    }
}