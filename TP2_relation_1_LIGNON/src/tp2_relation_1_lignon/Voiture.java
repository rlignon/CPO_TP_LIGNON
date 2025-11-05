/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_lignon;

/**
 *
 * @author ronan
 */
public class Voiture {

    String Modele;
    String Marque;
    int PuissanceCV;
    Personne Proprietaire ;

    public Voiture(String LeModele, String LaMArque, int LapuissanceCv) {
        Modele = LeModele;
        Marque = LaMArque;
        PuissanceCV = LapuissanceCv;
        Proprietaire = null;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner =  Marque + ", " + Modele + ", " + PuissanceCV+ " CV";
        return chaine_a_retourner;
    }
    }
