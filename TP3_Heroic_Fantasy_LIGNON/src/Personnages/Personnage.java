/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author ronan
 */
public abstract class Personnage {

    int vieniv;
    String nom;
    Arme Arme_en_Main = null;

    public Personnage(int vieniv, String nom) {
        this.vieniv = vieniv;
        this.nom = nom;
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
    public String toString() {
        return "Personnage{" + "vieniv=" + vieniv + ", nom=" + nom + ", Arme_en_Main=" + Arme_en_Main +  '}';
    }

}
