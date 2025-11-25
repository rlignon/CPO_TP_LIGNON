/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import Armes.Baton;
import Armes.Epee;
import java.util.ArrayList;
import tp3_heroic_fantasy_lignon.etreVivant;

/**
 *
 * @author ronan
 */
public abstract class Personnage implements etreVivant {

    int vieniv;
    String nom;
    Arme Arme_en_Main = null;
    public static int nbPersonnages = 0;

    public Personnage(int vieniv, String nom) {
        this.vieniv = vieniv;
        this.nom = nom;
        nbPersonnages += 1;
    }

    ArrayList<Arme> inventaire = new ArrayList<>();

    public void arme(Arme newarme) {
        if (inventaire.size() == 5) {

        } else {
            inventaire.add(newarme);
        }

    }

    public Arme getArme_en_Main() {
        return Arme_en_Main;
    }

    public String arme_choose(Arme armechoose) {
        if (inventaire.isEmpty()) {
            System.out.println("l'inventaire est vide");
        }
        if (inventaire.contains(armechoose)) {
            Arme_en_Main = armechoose;
            System.out.println("l'arme est équipée");
        } else {
            System.out.println("l'arme n'est pas dans l'inventaire");
        }
        return null;

    }

    @Override
    public void seFatiguer() {
        vieniv -= 10;
        if (vieniv < 0) {
            vieniv = 0;
        }
    }

    public boolean estVivant() {
        return vieniv > 0;
    }

    public void estAttaque(int points) {
        vieniv -= points;
        if (vieniv < 0) {
            vieniv = 0; 
        }
    }

    public int nbArmesPreferes() {
        int compteur = 0;

        for (Arme a : inventaire) {
            if (this instanceof Magicien && a instanceof Baton) {
                compteur++;
            }
            if (this instanceof Guerrier && a instanceof Epee) {
                compteur++;
            }
        }
        return compteur;
    }

    @Override
    public void finalize() throws Throwable {
        nbPersonnages--;   // on enlève 1 personnage
        super.finalize();

    }

    @Override
    public String toString() {
        return "Le personnage est " + nom + " avec " + vieniv + " points de vie,il est "+(estVivant() ? "Vivant" : "Mort")+" arme en main : " + Arme_en_Main + " avec " + nbArmesPreferes() + " armes préférées"
                + ", inventaire : " + inventaire;
    }

}
