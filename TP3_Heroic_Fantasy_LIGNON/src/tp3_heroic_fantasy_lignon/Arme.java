/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_lignon;

/**
 *
 * @author ronan
 */
public abstract class Arme{
    int niveau;
    String nom;
    public Arme(int niveau, String nom) {
        this.niveau = niveau;
        this.nom = nom;
        if (niveau>100){
            niveau=100;
        }
    
    }
    @Override
    public String toString() {
        return "Arme{" + "niveau=" + niveau + ", nom=" + nom + '}';
    }
    
}
