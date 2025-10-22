// LIGNON Ronan 22/10/2025 Un convertisseur de températures

package tp1_convertisseur_lignon;

import java.util.Scanner;

/**
 *
 * @author ronan
 */
public class TP1_convertisseur_LIGNON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double val1;
        int val2;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Bonjour, saisissez une valeur :");
        val1=sc.nextDouble();
        System.out.println("""
                           1) De Celcius vers Kelvin
                           2) De Kelvin vers Celcius 
                           3) De Farenheit vers Celcius
                           4) De Celcius vers Farenheit
                           5) De Kelvin vers farenheit
                           6) De farenheit vers Kelvin
                           """);
        val2=sc.nextInt();
        switch (val2) {
            case 1 :
                System.out.println("la température est de "+CelciusVersKelvin (val1)+"K");
                break;
            case 2 :
                System.out.println("la température est de "+KelvinVersCelcius (val1)+"C");
                break;
            case 3 :
                System.out.println("la température est de "+FarenheitVersCelcius (val1)+"C");
                break;
            case 4 :
                System.out.println("la température est de "+CelciusVersFarenheit (val1)+"F");
                break;
            case 5 :
                System.out.println("la température est de "+KelvinVersFarenheit (val1)+"F");
                break;
            case 6 :
                System.out.println("la température est de "+FarenheitVersKelvin (val1)+"K");
                break;
             default:
                System.out.println("Erreur : valeur de conversion non valide.");
                break;
                
        }
        //System.out.println("la temperature en Kelvin est : "+CelciusVersKelvin (val1)+" K");
        //System.out.println("choisir une valeur de temperature en Kelvin");
        


    }
    public static double CelciusVersKelvin (double tCelcius){
    tCelcius+=273.15;
        return tCelcius;
   }
    public static double KelvinVersCelcius (double tKelvin){
    tKelvin-=273.15;
        return tKelvin;
   }
    public static double FarenheitVersCelcius (double tFareneit){
    tFareneit=(tFareneit-32)/1.8;
        return tFareneit;
   }
    public static double CelciusVersFarenheit (double tCelcius2){
    tCelcius2=(tCelcius2*(9/5))+32;
        return tCelcius2;
   }
    public static double KelvinVersFarenheit (double tFareneit2){
    tFareneit2=1.8*(KelvinVersCelcius(tFareneit2))+32;
        return tFareneit2;
   }
    public static double FarenheitVersKelvin (double tKelvin2){
    tKelvin2=((tKelvin2 -32)/1.8)+273.15;
        return tKelvin2;
   }


    
}
