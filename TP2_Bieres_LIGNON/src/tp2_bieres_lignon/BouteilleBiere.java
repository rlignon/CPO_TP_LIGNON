/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_lignon;

/**
 *
 * @author ronan
 */
public class BouteilleBiere {

    String nom;
    double degreAlcool;
    String brasserie;
    Boolean ouverte;

    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }
    public Boolean Décapsuler(){
        if (ouverte==false){
            ouverte=true;
            System.out.println("biere ouverte");
            return ouverte;
        }
        else{
            System.out.println("erreur : biere déjà ouverte");
            return false;
        }
    }
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degres) Brasserie : " + brasserie);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés)Ouverte ? ";
        if (ouverte == true ) chaine_a_retourner += "oui" ;
        else chaine_a_retourner += "non" ;
        return chaine_a_retourner ;
}
}
