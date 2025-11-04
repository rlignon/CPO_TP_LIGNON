//LIGNON Ronan 03/11/2025 Un convertisseur de températures : version classes

package tp2_convertisseurobjet_lignon;

import java.util.Scanner;

/**
 *
 * @author ronan
 */
public class TP2_convertisseurObjet_LIGNON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int val2;
        double val1;
        Convertisseur valeur1 = new Convertisseur();
        Scanner sc = new Scanner(System.in);
        System.out.println("Bonjour, saisissez une valeur :");
        val1 = sc.nextDouble();
        System.out.println("""
                           1) De Celcius vers Kelvin
                           2) De Kelvin vers Celcius 
                           3) De Farenheit vers Celcius
                           4) De Celcius vers Farenheit
                           5) De Kelvin vers farenheit
                           6) De farenheit vers Kelvin
                           """);
        val2 = sc.nextInt();
        switch (val2) {
            case 1:
                System.out.println(valeur1.CelciusVersKelvin(val1));
                System.out.println(valeur1);
                break;
            case 2:
                System.out.println(valeur1.KelvinVersCelcius(val1));
                System.out.println(valeur1);
                break;
            case 3:
                System.out.println(valeur1.FarenheitVersCelcius(val1));
                System.out.println(valeur1);
                break;
            case 4:
                System.out.println(valeur1.CelciusVersFarenheit(val1));
                System.out.println(valeur1);
                break;
            case 5:
                System.out.println(valeur1.KelvinVersFarenheit(val1));
                System.out.println(valeur1);
                break;
            case 6:
                System.out.println(valeur1.FarenheitVersKelvin(val1));
                System.out.println(valeur1);
                break;
            default:
                System.out.println("Erreur : valeur de conversion non valide.");
                break;

        }

    }

}
