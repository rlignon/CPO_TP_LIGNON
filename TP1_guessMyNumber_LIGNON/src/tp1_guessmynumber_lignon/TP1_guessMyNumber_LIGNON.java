// LIGNON Ronan 24/10/2025 GuessMyNumber
package tp1_guessmynumber_lignon;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ronan
 */
public class TP1_guessMyNumber_LIGNON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();

        double val1 = 0.0;
        boolean result = false;
        int compteur = 0;
        int n = generateurAleat.nextInt(100);
        int level;
        System.out.println("""
                           Choisir un niveau:
                           1) facile
                           2) normal
                           3) difficile
                           """);
        level = sc.nextInt();
        switch (level) {
            case 1:
                Facile(val1, result, compteur, n);
                return;
            case 2:
                Normal(val1, result, compteur, n);
                return;
            case 3:
                Difficile(val1, result, compteur, n);
                return;

        }

    }

    public static boolean Facile(double val1, boolean result, int compteur, int n) {
        Scanner sc = new Scanner(System.in);
        while (result == false) {
            System.out.println("Bonjour, saisissez une valeur :");
            val1 = sc.nextDouble();
            compteur += 1;
            if (n == val1) {
                System.out.println(compteur);
                System.out.println("Gagne");
                result = true;
            } else if (n < val1) {
                System.out.println("trop grand ");
            } else {
                System.out.println("trop petit");
            }
        }
        return result;
    }

    public static boolean Normal(double val1, boolean result, int compteur, int n) {
        Scanner sc = new Scanner(System.in);
        while (result == false) {
            System.out.println("Bonjour, saisissez une valeur :");
            val1 = sc.nextDouble();
            compteur += 1;
            if (compteur >= 5) {
                System.out.println("perdu");
                return result;
            }
            if (n == val1) {
                System.out.println(compteur);
                System.out.println("Gagne");
                result = true;
            } else if (n < val1) {
                System.out.println("trop grand ");
            } else {
                System.out.println("trop petit");
            }
        }
        return result;
    }

    public static boolean Difficile(double val1, boolean result, int compteur, int n) {
        Scanner sc = new Scanner(System.in);
        while (result == false) {
            Random generateurAleat = new Random();
            n = generateurAleat.nextInt(100);
            System.out.println("Bonjour, saisissez une valeur :");
            val1 = sc.nextDouble();
            compteur += 1;
            if (n == val1) {
                System.out.println(compteur);
                System.out.println("Gagne");
                result = true;
            } else if (n < val1) {
                System.out.println("trop grand ");
            } else {
                System.out.println("trop petit");
            }
        }
        return result;
    }
}
