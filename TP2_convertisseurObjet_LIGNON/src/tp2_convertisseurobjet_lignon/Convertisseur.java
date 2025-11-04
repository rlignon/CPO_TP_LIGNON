/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_lignon;

/**
 *
 * @author ronan
 */
public class Convertisseur {

    int nbConversions;

    public Convertisseur() {
        nbConversions = 0;
    }

    public double CelciusVersKelvin(double tCelcius) {
        tCelcius += 273.15;       
        nbConversions += 1;
        return tCelcius;
    }

    public double KelvinVersCelcius(double tKelvin) {
        tKelvin -= 273.15;
        nbConversions += 1;
        return tKelvin;
    }

    public double FarenheitVersCelcius(double tFareneit) {
        tFareneit = (tFareneit - 32) / 1.8;
        nbConversions += 1;
        return tFareneit;
    }

    public double CelciusVersFarenheit(double tCelcius2) {
        tCelcius2 = (tCelcius2 * (9 / 5)) + 32;
        nbConversions += 1;
        return tCelcius2;
    }

    public double KelvinVersFarenheit(double tFareneit2) {
        tFareneit2 = 1.8 * (KelvinVersCelcius(tFareneit2)) + 32;
        nbConversions += 1;
        return tFareneit2;
    }

    public double FarenheitVersKelvin(double tKelvin2) {
        tKelvin2 = ((tKelvin2 - 32) / 1.8) + 273.15;
        nbConversions += 1;
        return tKelvin2;
    }

    @Override
    public String toString() {
        return "nb de conversions " + nbConversions;
    }

}
